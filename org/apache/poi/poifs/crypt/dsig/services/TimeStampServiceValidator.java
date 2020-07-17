package org.apache.poi.poifs.crypt.dsig.services;

import java.util.List;
import org.apache.poi.poifs.crypt.dsig.services.RevocationData;

public interface TimeStampServiceValidator {

   void validate(List var1, RevocationData var2) throws Exception;
}
