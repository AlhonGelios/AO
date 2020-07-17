package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.Encoding;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.TDSReader;
import com.microsoft.sqlserver.jdbc.TDSWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class SQLCollation implements Serializable {

   private final int info;
   private final int sortId;
   private final Encoding encoding;
   private static final Map localeIndex = new HashMap();
   private static final HashMap sortOrderIndex;


   private final int langID() {
      return this.info & '\uffff';
   }

   final String getCharset() {
      return this.encoding.charsetName();
   }

   final boolean supportsAsciiConversion() {
      return this.encoding.supportsAsciiConversion();
   }

   final boolean hasAsciiCompatibleSBCS() {
      return this.encoding.hasAsciiCompatibleSBCS();
   }

   static final int tdsLength() {
      return 5;
   }

   SQLCollation(TDSReader var1) throws UnsupportedEncodingException, SQLServerException {
      this.info = var1.readInt();
      this.sortId = var1.readUnsignedByte();
      this.encoding = 0 == this.sortId?this.encodingFromLCID():this.encodingFromSortId();
   }

   void writeCollation(TDSWriter var1) throws SQLServerException {
      var1.writeInt(this.info);
      var1.writeByte((byte)(this.sortId & 255));
   }

   private Encoding encodingFromLCID() throws UnsupportedEncodingException {
      SQLCollation.WindowsLocale var1 = (SQLCollation.WindowsLocale)localeIndex.get(Integer.valueOf(this.langID()));
      if(null == var1) {
         MessageFormat var2 = new MessageFormat(SQLServerException.getErrString("R_unknownLCID"));
         Object[] var7 = new Object[]{Integer.toHexString(this.langID()).toUpperCase()};
         throw new UnsupportedEncodingException(var2.format(var7));
      } else {
         try {
            return var1.getEncoding();
         } catch (UnsupportedEncodingException var6) {
            MessageFormat var3 = new MessageFormat(SQLServerException.getErrString("R_unknownLCID"));
            Object[] var4 = new Object[]{var1};
            UnsupportedEncodingException var5 = new UnsupportedEncodingException(var3.format(var4));
            var5.initCause(var6);
            throw var5;
         }
      }
   }

   private Encoding encodingFromSortId() throws UnsupportedEncodingException {
      SQLCollation.SortOrder var1 = (SQLCollation.SortOrder)sortOrderIndex.get(Integer.valueOf(this.sortId));
      if(null == var1) {
         MessageFormat var2 = new MessageFormat(SQLServerException.getErrString("R_unknownSortId"));
         Object[] var7 = new Object[]{Integer.valueOf(this.sortId)};
         throw new UnsupportedEncodingException(var2.format(var7));
      } else {
         try {
            return var1.getEncoding();
         } catch (UnsupportedEncodingException var6) {
            MessageFormat var3 = new MessageFormat(SQLServerException.getErrString("R_unknownSortId"));
            Object[] var4 = new Object[]{var1};
            UnsupportedEncodingException var5 = new UnsupportedEncodingException(var3.format(var4));
            var5.initCause(var6);
            throw var5;
         }
      }
   }

   static {
      Iterator var0 = EnumSet.allOf(SQLCollation.WindowsLocale.class).iterator();

      while(var0.hasNext()) {
         SQLCollation.WindowsLocale var1 = (SQLCollation.WindowsLocale)var0.next();
         localeIndex.put(Integer.valueOf(var1.langID), var1);
      }

      sortOrderIndex = new HashMap();
      var0 = EnumSet.allOf(SQLCollation.SortOrder.class).iterator();

      while(var0.hasNext()) {
         SQLCollation.SortOrder var2 = (SQLCollation.SortOrder)var0.next();
         sortOrderIndex.put(Integer.valueOf(var2.sortId), var2);
      }

   }

   static enum WindowsLocale {

      ar_SA("ar_SA", 0, 1025, Encoding.CP1256),
      bg_BG("bg_BG", 1, 1026, Encoding.CP1251),
      ca_ES("ca_ES", 2, 1027, Encoding.CP1252),
      zh_TW("zh_TW", 3, 1028, Encoding.CP950),
      cs_CZ("cs_CZ", 4, 1029, Encoding.CP1250),
      da_DK("da_DK", 5, 1030, Encoding.CP1252),
      de_DE("de_DE", 6, 1031, Encoding.CP1252),
      el_GR("el_GR", 7, 1032, Encoding.CP1253),
      en_US("en_US", 8, 1033, Encoding.CP1252),
      es_ES_tradnl("es_ES_tradnl", 9, 1034, Encoding.CP1252),
      fi_FI("fi_FI", 10, 1035, Encoding.CP1252),
      fr_FR("fr_FR", 11, 1036, Encoding.CP1252),
      he_IL("he_IL", 12, 1037, Encoding.CP1255),
      hu_HU("hu_HU", 13, 1038, Encoding.CP1250),
      is_IS("is_IS", 14, 1039, Encoding.CP1252),
      it_IT("it_IT", 15, 1040, Encoding.CP1252),
      ja_JP("ja_JP", 16, 1041, Encoding.CP932),
      ko_KR("ko_KR", 17, 1042, Encoding.CP949),
      nl_NL("nl_NL", 18, 1043, Encoding.CP1252),
      nb_NO("nb_NO", 19, 1044, Encoding.CP1252),
      pl_PL("pl_PL", 20, 1045, Encoding.CP1250),
      pt_BR("pt_BR", 21, 1046, Encoding.CP1252),
      rm_CH("rm_CH", 22, 1047, Encoding.CP1252),
      ro_RO("ro_RO", 23, 1048, Encoding.CP1250),
      ru_RU("ru_RU", 24, 1049, Encoding.CP1251),
      hr_HR("hr_HR", 25, 1050, Encoding.CP1250),
      sk_SK("sk_SK", 26, 1051, Encoding.CP1250),
      sq_AL("sq_AL", 27, 1052, Encoding.CP1250),
      sv_SE("sv_SE", 28, 1053, Encoding.CP1252),
      th_TH("th_TH", 29, 1054, Encoding.CP874),
      tr_TR("tr_TR", 30, 1055, Encoding.CP1254),
      ur_PK("ur_PK", 31, 1056, Encoding.CP1256),
      id_ID("id_ID", 32, 1057, Encoding.CP1252),
      uk_UA("uk_UA", 33, 1058, Encoding.CP1251),
      be_BY("be_BY", 34, 1059, Encoding.CP1251),
      sl_SI("sl_SI", 35, 1060, Encoding.CP1250),
      et_EE("et_EE", 36, 1061, Encoding.CP1257),
      lv_LV("lv_LV", 37, 1062, Encoding.CP1257),
      lt_LT("lt_LT", 38, 1063, Encoding.CP1257),
      tg_Cyrl_TJ("tg_Cyrl_TJ", 39, 1064, Encoding.CP1251),
      fa_IR("fa_IR", 40, 1065, Encoding.CP1256),
      vi_VN("vi_VN", 41, 1066, Encoding.CP1258),
      hy_AM("hy_AM", 42, 1067, Encoding.CP1252),
      az_Latn_AZ("az_Latn_AZ", 43, 1068, Encoding.CP1254),
      eu_ES("eu_ES", 44, 1069, Encoding.CP1252),
      wen_DE("wen_DE", 45, 1070, Encoding.CP1252),
      mk_MK("mk_MK", 46, 1071, Encoding.CP1251),
      tn_ZA("tn_ZA", 47, 1074, Encoding.CP1252),
      xh_ZA("xh_ZA", 48, 1076, Encoding.CP1252),
      zu_ZA("zu_ZA", 49, 1077, Encoding.CP1252),
      Af_ZA("Af_ZA", 50, 1078, Encoding.CP1252),
      ka_GE("ka_GE", 51, 1079, Encoding.CP1252),
      fo_FO("fo_FO", 52, 1080, Encoding.CP1252),
      hi_IN("hi_IN", 53, 1081, Encoding.UNICODE),
      mt_MT("mt_MT", 54, 1082, Encoding.UNICODE),
      se_NO("se_NO", 55, 1083, Encoding.CP1252),
      ms_MY("ms_MY", 56, 1086, Encoding.CP1252),
      kk_KZ("kk_KZ", 57, 1087, Encoding.CP1251),
      ky_KG("ky_KG", 58, 1088, Encoding.CP1251),
      sw_KE("sw_KE", 59, 1089, Encoding.CP1252),
      tk_TM("tk_TM", 60, 1090, Encoding.CP1250),
      uz_Latn_UZ("uz_Latn_UZ", 61, 1091, Encoding.CP1254),
      tt_RU("tt_RU", 62, 1092, Encoding.CP1251),
      bn_IN("bn_IN", 63, 1093, Encoding.UNICODE),
      pa_IN("pa_IN", 64, 1094, Encoding.UNICODE),
      gu_IN("gu_IN", 65, 1095, Encoding.UNICODE),
      or_IN("or_IN", 66, 1096, Encoding.UNICODE),
      ta_IN("ta_IN", 67, 1097, Encoding.UNICODE),
      te_IN("te_IN", 68, 1098, Encoding.UNICODE),
      kn_IN("kn_IN", 69, 1099, Encoding.UNICODE),
      ml_IN("ml_IN", 70, 1100, Encoding.UNICODE),
      as_IN("as_IN", 71, 1101, Encoding.UNICODE),
      mr_IN("mr_IN", 72, 1102, Encoding.UNICODE),
      sa_IN("sa_IN", 73, 1103, Encoding.UNICODE),
      mn_MN("mn_MN", 74, 1104, Encoding.CP1251),
      bo_CN("bo_CN", 75, 1105, Encoding.UNICODE),
      cy_GB("cy_GB", 76, 1106, Encoding.CP1252),
      km_KH("km_KH", 77, 1107, Encoding.UNICODE),
      lo_LA("lo_LA", 78, 1108, Encoding.UNICODE),
      gl_ES("gl_ES", 79, 1110, Encoding.CP1252),
      kok_IN("kok_IN", 80, 1111, Encoding.UNICODE),
      syr_SY("syr_SY", 81, 1114, Encoding.UNICODE),
      si_LK("si_LK", 82, 1115, Encoding.UNICODE),
      iu_Cans_CA("iu_Cans_CA", 83, 1117, Encoding.CP1252),
      am_ET("am_ET", 84, 1118, Encoding.CP1252),
      ne_NP("ne_NP", 85, 1121, Encoding.UNICODE),
      fy_NL("fy_NL", 86, 1122, Encoding.CP1252),
      ps_AF("ps_AF", 87, 1123, Encoding.UNICODE),
      fil_PH("fil_PH", 88, 1124, Encoding.CP1252),
      dv_MV("dv_MV", 89, 1125, Encoding.UNICODE),
      ha_Latn_NG("ha_Latn_NG", 90, 1128, Encoding.CP1252),
      yo_NG("yo_NG", 91, 1130, Encoding.CP1252),
      quz_BO("quz_BO", 92, 1131, Encoding.CP1252),
      nso_ZA("nso_ZA", 93, 1132, Encoding.CP1252),
      ba_RU("ba_RU", 94, 1133, Encoding.CP1251),
      lb_LU("lb_LU", 95, 1134, Encoding.CP1252),
      kl_GL("kl_GL", 96, 1135, Encoding.CP1252),
      ig_NG("ig_NG", 97, 1136, Encoding.CP1252),
      ii_CN("ii_CN", 98, 1144, Encoding.CP1252),
      arn_CL("arn_CL", 99, 1146, Encoding.CP1252),
      moh_CA("moh_CA", 100, 1148, Encoding.CP1252),
      br_FR("br_FR", 101, 1150, Encoding.CP1252),
      ug_CN("ug_CN", 102, 1152, Encoding.CP1256),
      mi_NZ("mi_NZ", 103, 1153, Encoding.UNICODE),
      oc_FR("oc_FR", 104, 1154, Encoding.CP1252),
      co_FR("co_FR", 105, 1155, Encoding.CP1252),
      gsw_FR("gsw_FR", 106, 1156, Encoding.CP1252),
      sah_RU("sah_RU", 107, 1157, Encoding.CP1251),
      qut_GT("qut_GT", 108, 1158, Encoding.CP1252),
      rw_RW("rw_RW", 109, 1159, Encoding.CP1252),
      wo_SN("wo_SN", 110, 1160, Encoding.CP1252),
      prs_AF("prs_AF", 111, 1164, Encoding.CP1256),
      ar_IQ("ar_IQ", 112, 2049, Encoding.CP1256),
      zh_CN("zh_CN", 113, 2052, Encoding.CP936),
      de_CH("de_CH", 114, 2055, Encoding.CP1252),
      en_GB("en_GB", 115, 2057, Encoding.CP1252),
      es_MX("es_MX", 116, 2058, Encoding.CP1252),
      fr_BE("fr_BE", 117, 2060, Encoding.CP1252),
      it_CH("it_CH", 118, 2064, Encoding.CP1252),
      nl_BE("nl_BE", 119, 2067, Encoding.CP1252),
      nn_NO("nn_NO", 120, 2068, Encoding.CP1252),
      pt_PT("pt_PT", 121, 2070, Encoding.CP1252),
      sr_Latn_CS("sr_Latn_CS", 122, 2074, Encoding.CP1250),
      sv_FI("sv_FI", 123, 2077, Encoding.CP1252),
      Lithuanian_Classic("Lithuanian_Classic", 124, 2087, Encoding.CP1257),
      az_Cyrl_AZ("az_Cyrl_AZ", 125, 2092, Encoding.CP1251),
      dsb_DE("dsb_DE", 126, 2094, Encoding.CP1252),
      se_SE("se_SE", 127, 2107, Encoding.CP1252),
      ga_IE("ga_IE", 128, 2108, Encoding.CP1252),
      ms_BN("ms_BN", 129, 2110, Encoding.CP1252),
      uz_Cyrl_UZ("uz_Cyrl_UZ", 130, 2115, Encoding.CP1251),
      bn_BD("bn_BD", 131, 2117, Encoding.UNICODE),
      mn_Mong_CN("mn_Mong_CN", 132, 2128, Encoding.CP1251),
      iu_Latn_CA("iu_Latn_CA", 133, 2141, Encoding.CP1252),
      tzm_Latn_DZ("tzm_Latn_DZ", 134, 2143, Encoding.CP1252),
      quz_EC("quz_EC", 135, 2155, Encoding.CP1252),
      ar_EG("ar_EG", 136, 3073, Encoding.CP1256),
      zh_HK("zh_HK", 137, 3076, Encoding.CP950),
      de_AT("de_AT", 138, 3079, Encoding.CP1252),
      en_AU("en_AU", 139, 3081, Encoding.CP1252),
      es_ES("es_ES", 140, 3082, Encoding.CP1252),
      fr_CA("fr_CA", 141, 3084, Encoding.CP1252),
      sr_Cyrl_CS("sr_Cyrl_CS", 142, 3098, Encoding.CP1251),
      se_FI("se_FI", 143, 3131, Encoding.CP1252),
      quz_PE("quz_PE", 144, 3179, Encoding.CP1252),
      ar_LY("ar_LY", 145, 4097, Encoding.CP1256),
      zh_SG("zh_SG", 146, 4100, Encoding.CP936),
      de_LU("de_LU", 147, 4103, Encoding.CP1252),
      en_CA("en_CA", 148, 4105, Encoding.CP1252),
      es_GT("es_GT", 149, 4106, Encoding.CP1252),
      fr_CH("fr_CH", 150, 4108, Encoding.CP1252),
      hr_BA("hr_BA", 151, 4122, Encoding.CP1250),
      smj_NO("smj_NO", 152, 4155, Encoding.CP1252),
      ar_DZ("ar_DZ", 153, 5121, Encoding.CP1256),
      zh_MO("zh_MO", 154, 5124, Encoding.CP950),
      de_LI("de_LI", 155, 5127, Encoding.CP1252),
      en_NZ("en_NZ", 156, 5129, Encoding.CP1252),
      es_CR("es_CR", 157, 5130, Encoding.CP1252),
      fr_LU("fr_LU", 158, 5132, Encoding.CP1252),
      bs_Latn_BA("bs_Latn_BA", 159, 5146, Encoding.CP1250),
      smj_SE("smj_SE", 160, 5179, Encoding.CP1252),
      ar_MA("ar_MA", 161, 6145, Encoding.CP1256),
      en_IE("en_IE", 162, 6153, Encoding.CP1252),
      es_PA("es_PA", 163, 6154, Encoding.CP1252),
      fr_MC("fr_MC", 164, 6156, Encoding.CP1252),
      sr_Latn_BA("sr_Latn_BA", 165, 6170, Encoding.CP1250),
      sma_NO("sma_NO", 166, 6203, Encoding.CP1252),
      ar_TN("ar_TN", 167, 7169, Encoding.CP1256),
      en_ZA("en_ZA", 168, 7177, Encoding.CP1252),
      es_DO("es_DO", 169, 7178, Encoding.CP1252),
      sr_Cyrl_BA("sr_Cyrl_BA", 170, 7194, Encoding.CP1251),
      sma_SB("sma_SB", 171, 7227, Encoding.CP1252),
      ar_OM("ar_OM", 172, 8193, Encoding.CP1256),
      en_JM("en_JM", 173, 8201, Encoding.CP1252),
      es_VE("es_VE", 174, 8202, Encoding.CP1252),
      bs_Cyrl_BA("bs_Cyrl_BA", 175, 8218, Encoding.CP1251),
      sms_FI("sms_FI", 176, 8251, Encoding.CP1252),
      ar_YE("ar_YE", 177, 9217, Encoding.CP1256),
      en_CB("en_CB", 178, 9225, Encoding.CP1252),
      es_CO("es_CO", 179, 9226, Encoding.CP1252),
      smn_FI("smn_FI", 180, 9275, Encoding.CP1252),
      ar_SY("ar_SY", 181, 10241, Encoding.CP1256),
      en_BZ("en_BZ", 182, 10249, Encoding.CP1252),
      es_PE("es_PE", 183, 10250, Encoding.CP1252),
      ar_JO("ar_JO", 184, 11265, Encoding.CP1256),
      en_TT("en_TT", 185, 11273, Encoding.CP1252),
      es_AR("es_AR", 186, 11274, Encoding.CP1252),
      ar_LB("ar_LB", 187, 12289, Encoding.CP1256),
      en_ZW("en_ZW", 188, 12297, Encoding.CP1252),
      es_EC("es_EC", 189, 12298, Encoding.CP1252),
      ar_KW("ar_KW", 190, 13313, Encoding.CP1256),
      en_PH("en_PH", 191, 13321, Encoding.CP1252),
      es_CL("es_CL", 192, 13322, Encoding.CP1252),
      ar_AE("ar_AE", 193, 14337, Encoding.CP1256),
      es_UY("es_UY", 194, 14346, Encoding.CP1252),
      ar_BH("ar_BH", 195, 15361, Encoding.CP1256),
      es_PY("es_PY", 196, 15370, Encoding.CP1252),
      ar_QA("ar_QA", 197, 16385, Encoding.CP1256),
      en_IN("en_IN", 198, 16393, Encoding.CP1252),
      es_BO("es_BO", 199, 16394, Encoding.CP1252),
      en_MY("en_MY", 200, 17417, Encoding.CP1252),
      es_SV("es_SV", 201, 17418, Encoding.CP1252),
      en_SG("en_SG", 202, 18441, Encoding.CP1252),
      es_HN("es_HN", 203, 18442, Encoding.CP1252),
      es_NI("es_NI", 204, 19466, Encoding.CP1252),
      es_PR("es_PR", 205, 20490, Encoding.CP1252),
      es_US("es_US", 206, 21514, Encoding.CP1252);
      private final int langID;
      private final Encoding encoding;
      // $FF: synthetic field
      private static final SQLCollation.WindowsLocale[] $VALUES = new SQLCollation.WindowsLocale[]{ar_SA, bg_BG, ca_ES, zh_TW, cs_CZ, da_DK, de_DE, el_GR, en_US, es_ES_tradnl, fi_FI, fr_FR, he_IL, hu_HU, is_IS, it_IT, ja_JP, ko_KR, nl_NL, nb_NO, pl_PL, pt_BR, rm_CH, ro_RO, ru_RU, hr_HR, sk_SK, sq_AL, sv_SE, th_TH, tr_TR, ur_PK, id_ID, uk_UA, be_BY, sl_SI, et_EE, lv_LV, lt_LT, tg_Cyrl_TJ, fa_IR, vi_VN, hy_AM, az_Latn_AZ, eu_ES, wen_DE, mk_MK, tn_ZA, xh_ZA, zu_ZA, Af_ZA, ka_GE, fo_FO, hi_IN, mt_MT, se_NO, ms_MY, kk_KZ, ky_KG, sw_KE, tk_TM, uz_Latn_UZ, tt_RU, bn_IN, pa_IN, gu_IN, or_IN, ta_IN, te_IN, kn_IN, ml_IN, as_IN, mr_IN, sa_IN, mn_MN, bo_CN, cy_GB, km_KH, lo_LA, gl_ES, kok_IN, syr_SY, si_LK, iu_Cans_CA, am_ET, ne_NP, fy_NL, ps_AF, fil_PH, dv_MV, ha_Latn_NG, yo_NG, quz_BO, nso_ZA, ba_RU, lb_LU, kl_GL, ig_NG, ii_CN, arn_CL, moh_CA, br_FR, ug_CN, mi_NZ, oc_FR, co_FR, gsw_FR, sah_RU, qut_GT, rw_RW, wo_SN, prs_AF, ar_IQ, zh_CN, de_CH, en_GB, es_MX, fr_BE, it_CH, nl_BE, nn_NO, pt_PT, sr_Latn_CS, sv_FI, Lithuanian_Classic, az_Cyrl_AZ, dsb_DE, se_SE, ga_IE, ms_BN, uz_Cyrl_UZ, bn_BD, mn_Mong_CN, iu_Latn_CA, tzm_Latn_DZ, quz_EC, ar_EG, zh_HK, de_AT, en_AU, es_ES, fr_CA, sr_Cyrl_CS, se_FI, quz_PE, ar_LY, zh_SG, de_LU, en_CA, es_GT, fr_CH, hr_BA, smj_NO, ar_DZ, zh_MO, de_LI, en_NZ, es_CR, fr_LU, bs_Latn_BA, smj_SE, ar_MA, en_IE, es_PA, fr_MC, sr_Latn_BA, sma_NO, ar_TN, en_ZA, es_DO, sr_Cyrl_BA, sma_SB, ar_OM, en_JM, es_VE, bs_Cyrl_BA, sms_FI, ar_YE, en_CB, es_CO, smn_FI, ar_SY, en_BZ, es_PE, ar_JO, en_TT, es_AR, ar_LB, en_ZW, es_EC, ar_KW, en_PH, es_CL, ar_AE, es_UY, ar_BH, es_PY, ar_QA, en_IN, es_BO, en_MY, es_SV, en_SG, es_HN, es_NI, es_PR, es_US};


      private WindowsLocale(String var1, int var2, int var3, Encoding var4) {
         this.langID = var3;
         this.encoding = var4;
      }

      final Encoding getEncoding() throws UnsupportedEncodingException {
         return this.encoding.checkSupported();
      }

   }

   static enum SortOrder {

      BIN_CP437("BIN_CP437", 0, 30, "SQL_Latin1_General_CP437_BIN", Encoding.CP437),
      DICTIONARY_437("DICTIONARY_437", 1, 31, "SQL_Latin1_General_CP437_CS_AS", Encoding.CP437),
      NOCASE_437("NOCASE_437", 2, 32, "SQL_Latin1_General_CP437_CI_AS", Encoding.CP437),
      NOCASEPREF_437("NOCASEPREF_437", 3, 33, "SQL_Latin1_General_Pref_CP437_CI_AS", Encoding.CP437),
      NOACCENTS_437("NOACCENTS_437", 4, 34, "SQL_Latin1_General_CP437_CI_AI", Encoding.CP437),
      BIN2_CP437("BIN2_CP437", 5, 35, "SQL_Latin1_General_CP437_BIN2", Encoding.CP437),
      BIN_CP850("BIN_CP850", 6, 40, "SQL_Latin1_General_CP850_BIN", Encoding.CP850),
      DICTIONARY_850("DICTIONARY_850", 7, 41, "SQL_Latin1_General_CP850_CS_AS", Encoding.CP850),
      NOCASE_850("NOCASE_850", 8, 42, "SQL_Latin1_General_CP850_CI_AS", Encoding.CP850),
      NOCASEPREF_850("NOCASEPREF_850", 9, 43, "SQL_Latin1_General_Pref_CP850_CI_AS", Encoding.CP850),
      NOACCENTS_850("NOACCENTS_850", 10, 44, "SQL_Latin1_General_CP850_CI_AI", Encoding.CP850),
      BIN2_CP850("BIN2_CP850", 11, 45, "SQL_Latin1_General_CP850_BIN2", Encoding.CP850),
      CASELESS_34("CASELESS_34", 12, 49, "SQL_1xCompat_CP850_CI_AS", Encoding.CP850),
      BIN_ISO_1("BIN_ISO_1", 13, 50, "bin_iso_1", Encoding.CP1252),
      DICTIONARY_ISO("DICTIONARY_ISO", 14, 51, "SQL_Latin1_General_CP1_CS_AS", Encoding.CP1252),
      NOCASE_ISO("NOCASE_ISO", 15, 52, "SQL_Latin1_General_CP1_CI_AS", Encoding.CP1252),
      NOCASEPREF_ISO("NOCASEPREF_ISO", 16, 53, "SQL_Latin1_General_Pref_CP1_CI_AS", Encoding.CP1252),
      NOACCENTS_ISO("NOACCENTS_ISO", 17, 54, "SQL_Latin1_General_CP1_CI_AI", Encoding.CP1252),
      ALT_DICTIONARY("ALT_DICTIONARY", 18, 55, "SQL_AltDiction_CP850_CS_AS", Encoding.CP850),
      ALT_NOCASEPREF("ALT_NOCASEPREF", 19, 56, "SQL_AltDiction_Pref_CP850_CI_AS", Encoding.CP850),
      ALT_NOACCENTS("ALT_NOACCENTS", 20, 57, "SQL_AltDiction_CP850_CI_AI", Encoding.CP850),
      SCAND_NOCASEPREF("SCAND_NOCASEPREF", 21, 58, "SQL_Scandinavian_Pref_CP850_CI_AS", Encoding.CP850),
      SCAND_DICTIONARY("SCAND_DICTIONARY", 22, 59, "SQL_Scandinavian_CP850_CS_AS", Encoding.CP850),
      SCAND_NOCASE("SCAND_NOCASE", 23, 60, "SQL_Scandinavian_CP850_CI_AS", Encoding.CP850),
      ALT_NOCASE("ALT_NOCASE", 24, 61, "SQL_AltDiction_CP850_CI_AS", Encoding.CP850),
      DICTIONARY_1252("DICTIONARY_1252", 25, 71, "dictionary_1252", Encoding.CP1252),
      NOCASE_1252("NOCASE_1252", 26, 72, "nocase_1252", Encoding.CP1252),
      DNK_NOR_DICTIONARY("DNK_NOR_DICTIONARY", 27, 73, "dnk_nor_dictionary", Encoding.CP1252),
      FIN_SWE_DICTIONARY("FIN_SWE_DICTIONARY", 28, 74, "fin_swe_dictionary", Encoding.CP1252),
      ISL_DICTIONARY("ISL_DICTIONARY", 29, 75, "isl_dictionary", Encoding.CP1252),
      BIN_CP1250("BIN_CP1250", 30, 80, "bin_cp1250", Encoding.CP1250),
      DICTIONARY_1250("DICTIONARY_1250", 31, 81, "SQL_Latin1_General_CP1250_CS_AS", Encoding.CP1250),
      NOCASE_1250("NOCASE_1250", 32, 82, "SQL_Latin1_General_CP1250_CI_AS", Encoding.CP1250),
      CSYDIC("CSYDIC", 33, 83, "SQL_Czech_CP1250_CS_AS", Encoding.CP1250),
      CSYNC("CSYNC", 34, 84, "SQL_Czech_CP1250_CI_AS", Encoding.CP1250),
      HUNDIC("HUNDIC", 35, 85, "SQL_Hungarian_CP1250_CS_AS", Encoding.CP1250),
      HUNNC("HUNNC", 36, 86, "SQL_Hungarian_CP1250_CI_AS", Encoding.CP1250),
      PLKDIC("PLKDIC", 37, 87, "SQL_Polish_CP1250_CS_AS", Encoding.CP1250),
      PLKNC("PLKNC", 38, 88, "SQL_Polish_CP1250_CI_AS", Encoding.CP1250),
      ROMDIC("ROMDIC", 39, 89, "SQL_Romanian_CP1250_CS_AS", Encoding.CP1250),
      ROMNC("ROMNC", 40, 90, "SQL_Romanian_CP1250_CI_AS", Encoding.CP1250),
      SHLDIC("SHLDIC", 41, 91, "SQL_Croatian_CP1250_CS_AS", Encoding.CP1250),
      SHLNC("SHLNC", 42, 92, "SQL_Croatian_CP1250_CI_AS", Encoding.CP1250),
      SKYDIC("SKYDIC", 43, 93, "SQL_Slovak_CP1250_CS_AS", Encoding.CP1250),
      SKYNC("SKYNC", 44, 94, "SQL_Slovak_CP1250_CI_AS", Encoding.CP1250),
      SLVDIC("SLVDIC", 45, 95, "SQL_Slovenian_CP1250_CS_AS", Encoding.CP1250),
      SLVNC("SLVNC", 46, 96, "SQL_Slovenian_CP1250_CI_AS", Encoding.CP1250),
      POLISH_CS("POLISH_CS", 47, 97, "polish_cs", Encoding.CP1250),
      POLISH_CI("POLISH_CI", 48, 98, "polish_ci", Encoding.CP1250),
      BIN_CP1251("BIN_CP1251", 49, 104, "bin_cp1251", Encoding.CP1251),
      DICTIONARY_1251("DICTIONARY_1251", 50, 105, "SQL_Latin1_General_CP1251_CS_AS", Encoding.CP1251),
      NOCASE_1251("NOCASE_1251", 51, 106, "SQL_Latin1_General_CP1251_CI_AS", Encoding.CP1251),
      UKRDIC("UKRDIC", 52, 107, "SQL_Ukrainian_CP1251_CS_AS", Encoding.CP1251),
      UKRNC("UKRNC", 53, 108, "SQL_Ukrainian_CP1251_CI_AS", Encoding.CP1251),
      BIN_CP1253("BIN_CP1253", 54, 112, "bin_cp1253", Encoding.CP1253),
      DICTIONARY_1253("DICTIONARY_1253", 55, 113, "SQL_Latin1_General_CP1253_CS_AS", Encoding.CP1253),
      NOCASE_1253("NOCASE_1253", 56, 114, "SQL_Latin1_General_CP1253_CI_AS", Encoding.CP1253),
      GREEK_MIXEDDICTIONARY("GREEK_MIXEDDICTIONARY", 57, 120, "SQL_MixDiction_CP1253_CS_AS", Encoding.CP1253),
      GREEK_ALTDICTIONARY("GREEK_ALTDICTIONARY", 58, 121, "SQL_AltDiction_CP1253_CS_AS", Encoding.CP1253),
      GREEK_ALTDICTIONARY2("GREEK_ALTDICTIONARY2", 59, 122, "SQL_AltDiction2_CP1253_CS_AS", Encoding.CP1253),
      GREEK_NOCASEDICT("GREEK_NOCASEDICT", 60, 124, "SQL_Latin1_General_CP1253_CI_AI", Encoding.CP1253),
      BIN_CP1254("BIN_CP1254", 61, 128, "bin_cp1254", Encoding.CP1254),
      DICTIONARY_1254("DICTIONARY_1254", 62, 129, "SQL_Latin1_General_CP1254_CS_AS", Encoding.CP1254),
      NOCASE_1254("NOCASE_1254", 63, 130, "SQL_Latin1_General_CP1254_CI_AS", Encoding.CP1254),
      BIN_CP1255("BIN_CP1255", 64, 136, "bin_cp1255", Encoding.CP1255),
      DICTIONARY_1255("DICTIONARY_1255", 65, 137, "SQL_Latin1_General_CP1255_CS_AS", Encoding.CP1255),
      NOCASE_1255("NOCASE_1255", 66, 138, "SQL_Latin1_General_CP1255_CI_AS", Encoding.CP1255),
      BIN_CP1256("BIN_CP1256", 67, 144, "bin_cp1256", Encoding.CP1256),
      DICTIONARY_1256("DICTIONARY_1256", 68, 145, "SQL_Latin1_General_CP1256_CS_AS", Encoding.CP1256),
      NOCASE_1256("NOCASE_1256", 69, 146, "SQL_Latin1_General_CP1256_CI_AS", Encoding.CP1256),
      BIN_CP1257("BIN_CP1257", 70, 152, "bin_cp1257", Encoding.CP1257),
      DICTIONARY_1257("DICTIONARY_1257", 71, 153, "SQL_Latin1_General_CP1257_CS_AS", Encoding.CP1257),
      NOCASE_1257("NOCASE_1257", 72, 154, "SQL_Latin1_General_CP1257_CI_AS", Encoding.CP1257),
      ETIDIC("ETIDIC", 73, 155, "SQL_Estonian_CP1257_CS_AS", Encoding.CP1257),
      ETINC("ETINC", 74, 156, "SQL_Estonian_CP1257_CI_AS", Encoding.CP1257),
      LVIDIC("LVIDIC", 75, 157, "SQL_Latvian_CP1257_CS_AS", Encoding.CP1257),
      LVINC("LVINC", 76, 158, "SQL_Latvian_CP1257_CI_AS", Encoding.CP1257),
      LTHDIC("LTHDIC", 77, 159, "SQL_Lithuanian_CP1257_CS_AS", Encoding.CP1257),
      LTHNC("LTHNC", 78, 160, "SQL_Lithuanian_CP1257_CI_AS", Encoding.CP1257),
      DANNO_NOCASEPREF("DANNO_NOCASEPREF", 79, 183, "SQL_Danish_Pref_CP1_CI_AS", Encoding.CP1252),
      SVFI1_NOCASEPREF("SVFI1_NOCASEPREF", 80, 184, "SQL_SwedishPhone_Pref_CP1_CI_AS", Encoding.CP1252),
      SVFI2_NOCASEPREF("SVFI2_NOCASEPREF", 81, 185, "SQL_SwedishStd_Pref_CP1_CI_AS", Encoding.CP1252),
      ISLAN_NOCASEPREF("ISLAN_NOCASEPREF", 82, 186, "SQL_Icelandic_Pref_CP1_CI_AS", Encoding.CP1252),
      BIN_CP932("BIN_CP932", 83, 192, "bin_cp932", Encoding.CP932),
      NLS_CP932("NLS_CP932", 84, 193, "nls_cp932", Encoding.CP932),
      BIN_CP949("BIN_CP949", 85, 194, "bin_cp949", Encoding.CP949),
      NLS_CP949("NLS_CP949", 86, 195, "nls_cp949", Encoding.CP949),
      BIN_CP950("BIN_CP950", 87, 196, "bin_cp950", Encoding.CP950),
      NLS_CP950("NLS_CP950", 88, 197, "nls_cp950", Encoding.CP950),
      BIN_CP936("BIN_CP936", 89, 198, "bin_cp936", Encoding.CP936),
      NLS_CP936("NLS_CP936", 90, 199, "nls_cp936", Encoding.CP936),
      NLS_CP932_CS("NLS_CP932_CS", 91, 200, "nls_cp932_cs", Encoding.CP932),
      NLS_CP949_CS("NLS_CP949_CS", 92, 201, "nls_cp949_cs", Encoding.CP949),
      NLS_CP950_CS("NLS_CP950_CS", 93, 202, "nls_cp950_cs", Encoding.CP950),
      NLS_CP936_CS("NLS_CP936_CS", 94, 203, "nls_cp936_cs", Encoding.CP936),
      BIN_CP874("BIN_CP874", 95, 204, "bin_cp874", Encoding.CP874),
      NLS_CP874("NLS_CP874", 96, 205, "nls_cp874", Encoding.CP874),
      NLS_CP874_CS("NLS_CP874_CS", 97, 206, "nls_cp874_cs", Encoding.CP874),
      EBCDIC_037("EBCDIC_037", 98, 210, "SQL_EBCDIC037_CP1_CS_AS", Encoding.CP1252),
      EBCDIC_273("EBCDIC_273", 99, 211, "SQL_EBCDIC273_CP1_CS_AS", Encoding.CP1252),
      EBCDIC_277("EBCDIC_277", 100, 212, "SQL_EBCDIC277_CP1_CS_AS", Encoding.CP1252),
      EBCDIC_278("EBCDIC_278", 101, 213, "SQL_EBCDIC278_CP1_CS_AS", Encoding.CP1252),
      EBCDIC_280("EBCDIC_280", 102, 214, "SQL_EBCDIC280_CP1_CS_AS", Encoding.CP1252),
      EBCDIC_284("EBCDIC_284", 103, 215, "SQL_EBCDIC284_CP1_CS_AS", Encoding.CP1252),
      EBCDIC_285("EBCDIC_285", 104, 216, "SQL_EBCDIC285_CP1_CS_AS", Encoding.CP1252),
      EBCDIC_297("EBCDIC_297", 105, 217, "SQL_EBCDIC297_CP1_CS_AS", Encoding.CP1252);
      private final int sortId;
      private final String name;
      private final Encoding encoding;
      // $FF: synthetic field
      private static final SQLCollation.SortOrder[] $VALUES = new SQLCollation.SortOrder[]{BIN_CP437, DICTIONARY_437, NOCASE_437, NOCASEPREF_437, NOACCENTS_437, BIN2_CP437, BIN_CP850, DICTIONARY_850, NOCASE_850, NOCASEPREF_850, NOACCENTS_850, BIN2_CP850, CASELESS_34, BIN_ISO_1, DICTIONARY_ISO, NOCASE_ISO, NOCASEPREF_ISO, NOACCENTS_ISO, ALT_DICTIONARY, ALT_NOCASEPREF, ALT_NOACCENTS, SCAND_NOCASEPREF, SCAND_DICTIONARY, SCAND_NOCASE, ALT_NOCASE, DICTIONARY_1252, NOCASE_1252, DNK_NOR_DICTIONARY, FIN_SWE_DICTIONARY, ISL_DICTIONARY, BIN_CP1250, DICTIONARY_1250, NOCASE_1250, CSYDIC, CSYNC, HUNDIC, HUNNC, PLKDIC, PLKNC, ROMDIC, ROMNC, SHLDIC, SHLNC, SKYDIC, SKYNC, SLVDIC, SLVNC, POLISH_CS, POLISH_CI, BIN_CP1251, DICTIONARY_1251, NOCASE_1251, UKRDIC, UKRNC, BIN_CP1253, DICTIONARY_1253, NOCASE_1253, GREEK_MIXEDDICTIONARY, GREEK_ALTDICTIONARY, GREEK_ALTDICTIONARY2, GREEK_NOCASEDICT, BIN_CP1254, DICTIONARY_1254, NOCASE_1254, BIN_CP1255, DICTIONARY_1255, NOCASE_1255, BIN_CP1256, DICTIONARY_1256, NOCASE_1256, BIN_CP1257, DICTIONARY_1257, NOCASE_1257, ETIDIC, ETINC, LVIDIC, LVINC, LTHDIC, LTHNC, DANNO_NOCASEPREF, SVFI1_NOCASEPREF, SVFI2_NOCASEPREF, ISLAN_NOCASEPREF, BIN_CP932, NLS_CP932, BIN_CP949, NLS_CP949, BIN_CP950, NLS_CP950, BIN_CP936, NLS_CP936, NLS_CP932_CS, NLS_CP949_CS, NLS_CP950_CS, NLS_CP936_CS, BIN_CP874, NLS_CP874, NLS_CP874_CS, EBCDIC_037, EBCDIC_273, EBCDIC_277, EBCDIC_278, EBCDIC_280, EBCDIC_284, EBCDIC_285, EBCDIC_297};


      final Encoding getEncoding() throws UnsupportedEncodingException {
         return this.encoding.checkSupported();
      }

      private SortOrder(String var1, int var2, int var3, String var4, Encoding var5) {
         this.sortId = var3;
         this.name = var4;
         this.encoding = var5;
      }

      public final String toString() {
         return this.name;
      }

   }
}
