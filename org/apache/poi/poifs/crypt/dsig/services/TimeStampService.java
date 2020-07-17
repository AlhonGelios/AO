package org.apache.poi.poifs.crypt.dsig.services;

import org.apache.poi.poifs.crypt.dsig.SignatureConfig;
import org.apache.poi.poifs.crypt.dsig.services.RevocationData;

public interface TimeStampService extends SignatureConfig.SignatureConfigurable {

   byte[] timeStamp(byte[] var1, RevocationData var2) throws Exception;
}
