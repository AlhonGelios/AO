package org.apache.poi.hpsf;

import org.apache.poi.hpsf.GUID;
import org.apache.poi.hpsf.IndirectPropertyName;
import org.apache.poi.util.Internal;

@Internal
class VersionedStream {

   private GUID _versionGuid;
   private IndirectPropertyName _streamName;


   VersionedStream(byte[] data, int offset) {
      this._versionGuid = new GUID(data, offset);
      this._streamName = new IndirectPropertyName(data, offset + 16);
   }

   int getSize() {
      return 16 + this._streamName.getSize();
   }
}
