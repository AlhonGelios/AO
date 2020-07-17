package org.apache.xmlbeans;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.GDate;
import org.apache.xmlbeans.GDateSpecification;
import org.apache.xmlbeans.GDuration;
import org.apache.xmlbeans.GDurationSpecification;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.StringEnumAbstractBase;
import org.apache.xmlbeans.XmlObject;

public interface SimpleValue extends XmlObject {

   SchemaType instanceType();

   String getStringValue();

   boolean getBooleanValue();

   byte getByteValue();

   short getShortValue();

   int getIntValue();

   long getLongValue();

   BigInteger getBigIntegerValue();

   BigDecimal getBigDecimalValue();

   float getFloatValue();

   double getDoubleValue();

   byte[] getByteArrayValue();

   StringEnumAbstractBase getEnumValue();

   Calendar getCalendarValue();

   Date getDateValue();

   GDate getGDateValue();

   GDuration getGDurationValue();

   QName getQNameValue();

   List getListValue();

   List xgetListValue();

   Object getObjectValue();

   void setStringValue(String var1);

   void setBooleanValue(boolean var1);

   void setByteValue(byte var1);

   void setShortValue(short var1);

   void setIntValue(int var1);

   void setLongValue(long var1);

   void setBigIntegerValue(BigInteger var1);

   void setBigDecimalValue(BigDecimal var1);

   void setFloatValue(float var1);

   void setDoubleValue(double var1);

   void setByteArrayValue(byte[] var1);

   void setEnumValue(StringEnumAbstractBase var1);

   void setCalendarValue(Calendar var1);

   void setDateValue(Date var1);

   void setGDateValue(GDate var1);

   void setGDurationValue(GDuration var1);

   void setQNameValue(QName var1);

   void setListValue(List var1);

   void setObjectValue(Object var1);

   String stringValue();

   boolean booleanValue();

   byte byteValue();

   short shortValue();

   int intValue();

   long longValue();

   BigInteger bigIntegerValue();

   BigDecimal bigDecimalValue();

   float floatValue();

   double doubleValue();

   byte[] byteArrayValue();

   StringEnumAbstractBase enumValue();

   Calendar calendarValue();

   Date dateValue();

   GDate gDateValue();

   GDuration gDurationValue();

   QName qNameValue();

   List listValue();

   List xlistValue();

   Object objectValue();

   void set(String var1);

   void set(boolean var1);

   void set(byte var1);

   void set(short var1);

   void set(int var1);

   void set(long var1);

   void set(BigInteger var1);

   void set(BigDecimal var1);

   void set(float var1);

   void set(double var1);

   void set(byte[] var1);

   void set(StringEnumAbstractBase var1);

   void set(Calendar var1);

   void set(Date var1);

   void set(GDateSpecification var1);

   void set(GDurationSpecification var1);

   void set(QName var1);

   void set(List var1);

   void objectSet(Object var1);
}
