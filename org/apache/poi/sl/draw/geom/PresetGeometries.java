package org.apache.poi.sl.draw.geom;

import java.io.InputStream;
import java.util.LinkedHashMap;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.EventFilter;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import org.apache.poi.sl.draw.binding.CTCustomGeometry2D;
import org.apache.poi.sl.draw.geom.CustomGeometry;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class PresetGeometries extends LinkedHashMap {

   private static final POILogger LOG = POILogFactory.getLogger(PresetGeometries.class);
   protected static final String BINDING_PACKAGE = "org.apache.poi.sl.draw.binding";
   protected static PresetGeometries _inst;


   public void init(InputStream is) throws XMLStreamException, JAXBException {
      EventFilter startElementFilter = new EventFilter() {
         public boolean accept(XMLEvent event) {
            return event.isStartElement();
         }
      };
      XMLInputFactory staxFactory = XMLInputFactory.newFactory();
      XMLEventReader staxReader = staxFactory.createXMLEventReader(is);
      XMLEventReader staxFiltRd = staxFactory.createFilteredReader(staxReader, startElementFilter);
      staxFiltRd.nextEvent();
      JAXBContext jaxbContext = JAXBContext.newInstance("org.apache.poi.sl.draw.binding");
      Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

      String name;
      CTCustomGeometry2D cus;
      for(long cntElem = 0L; staxFiltRd.peek() != null; this.put(name, new CustomGeometry(cus))) {
         StartElement evRoot = (StartElement)staxFiltRd.peek();
         name = evRoot.getName().getLocalPart();
         JAXBElement el = unmarshaller.unmarshal(staxReader, CTCustomGeometry2D.class);
         cus = (CTCustomGeometry2D)el.getValue();
         ++cntElem;
         if(this.containsKey(name)) {
            LOG.log(5, new Object[]{"Duplicate definition of " + name});
         }
      }

   }

   public static CustomGeometry convertCustomGeometry(XMLStreamReader staxReader) {
      try {
         JAXBContext e = JAXBContext.newInstance("org.apache.poi.sl.draw.binding");
         Unmarshaller unmarshaller = e.createUnmarshaller();
         JAXBElement el = unmarshaller.unmarshal(staxReader, CTCustomGeometry2D.class);
         return new CustomGeometry((CTCustomGeometry2D)el.getValue());
      } catch (JAXBException var4) {
         LOG.log(7, new Object[]{"Unable to parse single custom geometry", var4});
         return null;
      }
   }

   public static synchronized PresetGeometries getInstance() {
      if(_inst == null) {
         PresetGeometries lInst = new PresetGeometries();

         try {
            InputStream e = PresetGeometries.class.getResourceAsStream("presetShapeDefinitions.xml");

            try {
               lInst.init(e);
            } finally {
               e.close();
            }
         } catch (Exception var6) {
            throw new RuntimeException(var6);
         }

         _inst = lInst;
      }

      return _inst;
   }

}
