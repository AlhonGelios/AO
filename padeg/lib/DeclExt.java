package padeg.lib;

import padeg.lib.FioComm;
import padeg.lib.StrUtils;
import padeg.lib.Syllable;
import padeg.lib.TExceptionDic;

class DeclExt {

   private String prevWord;
   private boolean memoTerm;
   private boolean comma;
   private boolean terminate;
   private String[] ends = new String[7];


   private void setEndings(String c1, String c2, String c3, String c4, String c5, String c6) {
      this.ends[1] = c1;
      this.ends[2] = c2;
      this.ends[3] = c3;
      this.ends[4] = c4;
      this.ends[5] = c5;
      this.ends[6] = c6;
   }

   private void clearEndings() {
      this.setEndings("", "", "", "", "", "");
   }

   private boolean abbreviation(String s, int num) {
      String specialChars = "-.,";
      int n = 0;
      int vocCnt = 0;
      int conCnt = 0;
      String upper = s.toUpperCase();
      int len = s.length();

      for(int i = 0; i < len && "-.,".indexOf(s.charAt(i)) < 0; ++i) {
         if(s.charAt(i) == upper.charAt(i)) {
            ++n;
         }

         if(n >= num) {
            break;
         }

         if("аоуыэяеёюи".indexOf(s.charAt(i)) >= 0) {
            ++vocCnt;
         }

         if("бвгджзйклмнпрстфхцчшщ".indexOf(s.charAt(i)) >= 0) {
            ++conCnt;
         }
      }

      if((vocCnt == len || conCnt == len) && len >= num) {
         n = num;
      }

      return n >= num;
   }

   private boolean pointAbbreviation(String s) {
      return TExceptionDic.exceptionDic.present(s, "PointAbbreviation");
   }

   private boolean adjective(String s) {
      String cEnd2 = "";
      String cEnd3 = "";
      String cEnd4 = "";
      int len = s.length();
      s = s.toLowerCase();
      boolean result = false;
      if(len > 2) {
         cEnd2 = s.substring(s.length() - 2);
      }

      if(len > 3) {
         cEnd3 = s.substring(s.length() - 3);
      }

      if(len > 4) {
         cEnd4 = s.substring(s.length() - 4);
      }

      if(!s.equals("прочие") && !s.equals("третий") && !s.equals("божье") && !s.equals("охотничье")) {
         if(cEnd4.equals("иеся")) {
            result = true;
         } else if(cEnd2.equals("ие")) {
            if(!cEnd3.equals("щие") && !cEnd3.equals("шие")) {
               if(!cEnd3.equals("тие") && !cEnd4.equals("яние")) {
                  if(cEnd4.equals("нние")) {
                     result = true;
                  } else if(!cEnd4.equals("ение") && !cEnd4.equals("ание")) {
                     if(cEnd3.equals("ние") || cEnd4.equals("ские") || cEnd3.equals("кие")) {
                        result = true;
                     }
                  } else {
                     result = false;
                  }
               } else {
                  result = false;
               }
            } else {
               result = true;
            }
         } else if(cEnd2.equals("ий")) {
            if(!cEnd3.equals("щий") && !cEnd3.equals("ший") && !cEnd3.equals("чий")) {
               if(!cEnd3.equals("ций") && !cEnd4.equals("ытий") && !cEnd4.equals("яний") && !cEnd4.equals("оний")) {
                  if(cEnd4.equals("нний")) {
                     result = true;
                  } else if(!cEnd4.equals("ений") && !cEnd4.equals("аний")) {
                     if(cEnd3.equals("ний")) {
                        result = true;
                     } else if(cEnd4.equals("илий")) {
                        result = false;
                     } else if(cEnd4.equals("ский") || cEnd3.equals("кий") || cEnd3.equals("жий")) {
                        result = true;
                     }
                  } else {
                     result = false;
                  }
               } else {
                  result = false;
               }
            } else {
               result = true;
            }
         } else if(cEnd2.equals("ый") || cEnd2.equals("ой") || cEnd2.equals("ее") || cEnd2.equals("ое") || cEnd2.equals("ые") || cEnd2.equals("ая") || cEnd2.equals("яя")) {
            result = true;
         }
      } else {
         result = true;
      }

      if(result && TExceptionDic.exceptionDic.present(s, "NonAdjective")) {
         result = false;
      }

      return result;
   }

   private boolean plural(String s) {
      return TExceptionDic.exceptionDic.present(s, "Plural");
   }

   private String restoreWordView(String ethalon, String s) {
      int i = s.length() - 1;
      int p = ethalon.indexOf(45);

      for(i = p + 1; i < ethalon.length() && i < s.length() && s.charAt(i) == Character.toLowerCase(ethalon.charAt(i)); ++i) {
         ;
      }

      return ethalon.substring(0, i) + s.substring(i);
   }

   private boolean isOrderNumber(String s) {
      String[] numFlag = new String[]{"сто", "дцать", "сорок", "ьдесят", "триста", "четыреста", "ьсот", "тысяча"};

      for(int i = 0; i < numFlag.length; ++i) {
         if(s.endsWith(numFlag[i])) {
            return true;
         }
      }

      return false;
   }

   private String declNumeral(String s, int padeg, boolean isSoul) {
      String prefix = StrUtils.extractWord(1, s, "-");
      int i = Integer.valueOf(prefix).intValue();
      String end = StrUtils.extractWord(2, s, "-");
      boolean three = i % 10 == 3;
      boolean female = end.endsWith("я");
      if(female) {
         this.setEndings(end, "ой", "ой", "ую", "ой", "ой");
      } else {
         this.setEndings(end, "ого", "ому", "ого", "ым", "ом");
      }

      if(three) {
         if(female) {
            this.setEndings(end, "ей", "ей", "ю", "ей", "ей");
         } else {
            this.setEndings(end, "его", "ему", "его", "им", "ем");
         }
      }

      if(!isSoul && !female) {
         this.ends[4] = this.ends[1];
      }

      return String.valueOf(i) + '-' + this.ends[padeg];
   }

   private String formatChar(String s, char ch) {
      s = s.trim();
      if(s.length() > 0) {
         int i = s.indexOf(ch);
         if(i >= 0) {
            s = s.substring(0, i).trim() + ch + this.formatChar(s.substring(i + 1), ch);
         }
      }

      return s;
   }

   private boolean isNumeral(String s) {
      boolean result = false;

      try {
         Integer.parseInt(StrUtils.extractWord(1, s, "-"));
         String e = StrUtils.extractWord(2, s, "-");
         int len = e.length();
         if(len == 0) {
            return false;
         } else {
            char end = e.charAt(len - 1);
            char prev = len > 1?e.charAt(len - 2):32;
            if(end == 1081 && (len == 1 || "ыио".indexOf(prev) >= 0) || end == 1103 && (len == 1 || prev == 1072) || end == 1077 && (len == 1 || prev == 1086)) {
               result = true;
            }

            return result;
         }
      } catch (NumberFormatException var7) {
         return false;
      }
   }

   private String formatParameter(String s) {
      String numChar = "0123456789";
      StringBuilder result = new StringBuilder();

      for(int i = 0; i < s.length(); ++i) {
         result.append(s.charAt(i));
         if(i > 0 && i < s.length() - 1) {
            if(s.charAt(i + 1) == 40) {
               result.append(' ');
            }

            if(s.charAt(i) == 46 && s.charAt(i + 1) != 44 && ("0123456789".indexOf(s.charAt(i + 1)) < 0 || "0123456789".indexOf(s.charAt(i - 1)) < 0)) {
               result.append(' ');
            }

            if(s.charAt(i) == 44 && ("0123456789".indexOf(s.charAt(i + 1)) < 0 || "0123456789".indexOf(s.charAt(i - 1)) < 0)) {
               result.append(' ');
            }
         }
      }

      return result.toString();
   }

   private String processWord(String anyWord, int padeg, boolean isSoul, boolean hyphen) {
      String s = anyWord.trim().toLowerCase();
      this.terminate = false;
      if(padeg != 1 && !this.isOrderNumber(s)) {
         if(!s.equals("по") && !s.equals("на")) {
            if(!this.abbreviation(anyWord, 2) && !this.pointAbbreviation(s)) {
               if(hyphen && TExceptionDic.exceptionDic.present(anyWord, "NonDeclBeforeHyphen")) {
                  this.terminate = true;
                  return anyWord;
               } else {
                  int len = s.length();
                  char last = s.charAt(len - 1);
                  if(len <= 2 && last != 46) {
                     return anyWord;
                  } else {
                     if(last != 46) {
                        this.prevWord = "";
                     }

                     this.clearEndings();
                     String result = anyWord;
                     if(s.endsWith("ство")) {
                        this.setEndings("о", "а", "у", "а", "ом", "е");
                        if(!isSoul) {
                           this.ends[4] = this.ends[1];
                        }

                        result = anyWord.substring(0, len - 1) + this.ends[padeg];
                        this.terminate = true;
                        return result;
                     } else {
                        String cEnd = len < 2?s:s.substring(len - 2);
                        char prev;
                        if("бвгджзйклмнпрстфхцчшщь.,".indexOf(last) >= 0) {
                           if(!cEnd.equals("ый") && !cEnd.equals("ой")) {
                              if(cEnd.equals("ий")) {
                                 this.terminate = !this.adjective(s);
                                 prev = s.length() > 2?s.charAt(len - 3):32;
                                 if(this.terminate) {
                                    if("цш".indexOf(prev) < 0 && "чщ".indexOf(prev) < 0 && prev != 1078) {
                                       result = anyWord.substring(0, len - 1);
                                       this.setEndings("й", "я", "ю", "й", "ем", "и");
                                    } else {
                                       this.setEndings("ий", "его", "ему", "его", "им", "ем");
                                       result = anyWord.substring(0, len - 2);
                                    }
                                 } else {
                                    if("гкх".indexOf(prev) >= 0) {
                                       this.setEndings("ий", "ого", "ому", "ого", "им", "ом");
                                    } else {
                                       this.setEndings("ий", "его", "ему", "его", "им", "ем");
                                    }

                                    result = anyWord.substring(0, len - 2);
                                    if(s.equals("третий") && padeg > 1) {
                                       result = result + '\u044c';
                                    }
                                 }
                              } else if(cEnd.equals("ок")) {
                                 if((padeg == 1 || !isSoul) && (padeg == 1 || padeg == 4 || isSoul)) {
                                    result = anyWord;
                                 } else {
                                    result = anyWord.substring(0, len - 2) + '\u043a';
                                 }

                                 this.setEndings("", "а", "у", "а", "ом", "е");
                                 this.terminate = true;
                              } else if(cEnd.equals("ец")) {
                                 result = anyWord;
                                 this.setEndings("", "а", "у", "а", "ом", "е");
                                 switch(s.charAt(len - 3)) {
                                 case 1072:
                                 case 1077:
                                 case 1080:
                                 case 1086:
                                 case 1091:
                                    this.ends[5] = "ем";
                                    result = anyWord.substring(0, len - 2) + "йц";
                                    break;
                                 case 1073:
                                 case 1074:
                                 case 1075:
                                 case 1078:
                                 case 1079:
                                 case 1081:
                                 case 1082:
                                 case 1084:
                                 case 1088:
                                 case 1089:
                                 case 1090:
                                 default:
                                    result = anyWord.substring(0, len - 2) + '\u0446';
                                    break;
                                 case 1076:
                                 case 1085:
                                    if("аоуыэяеёюи".indexOf(s.charAt(len - 4)) >= 0 && Syllable.countSyllable(anyWord) > 2) {
                                       result = anyWord.substring(0, len - 2) + '\u0446';
                                    }
                                    break;
                                 case 1083:
                                    if("аоуыэяеёюи".indexOf(s.charAt(len - 4)) >= 0) {
                                       result = anyWord.substring(0, len - 2) + "ьц";
                                    } else {
                                       this.ends[5] = "ем";
                                       if(s.charAt(len - 4) == 1081) {
                                          this.ends[5] = "ом";
                                       }
                                    }
                                    break;
                                 case 1087:
                                    if(len > 3) {
                                       if("аоуыэяеёюи".indexOf(s.charAt(len - 4)) >= 0) {
                                          this.ends[5] = "ем";
                                          result = anyWord.substring(0, len - 2) + '\u0446';
                                       }
                                    } else {
                                       this.ends[5] = "ем";
                                    }
                                 }

                                 if(padeg == 4 && !isSoul) {
                                    result = anyWord;
                                 }

                                 this.terminate = true;
                              } else if(cEnd.equals("ть")) {
                                 this.setEndings("ь", "и", "и", "ь", "ью", "и");
                                 result = anyWord.substring(0, len - 1);
                                 this.terminate = true;
                              } else if(last == 1081) {
                                 if(len == 1) {
                                    result = anyWord;
                                 } else {
                                    result = anyWord.substring(0, len - 1);
                                    this.setEndings("й", "я", "ю", "й", "ем", "е");
                                    this.terminate = true;
                                 }
                              } else if(last == 46) {
                                 result = anyWord;
                                 this.prevWord = this.prevWord + s;
                                 if(this.pointAbbreviation(this.prevWord)) {
                                    this.terminate = true;
                                    this.prevWord = "";
                                 }
                              } else if(last == 44) {
                                 result = this.processWord(anyWord.substring(0, len - 1), padeg, isSoul, hyphen) + ',';
                                 this.clearEndings();
                                 if(!this.comma) {
                                    this.memoTerm = this.terminate;
                                    this.comma = true;
                                    this.terminate = false;
                                 } else {
                                    this.terminate = this.memoTerm;
                                 }
                              } else if(last == 1100) {
                                 this.setEndings("ь", "я", "ю", "я", "ем", "е");
                                 result = anyWord.substring(0, len - 1);
                                 this.terminate = true;
                                 if(s.equals("вновь")) {
                                    result = anyWord;
                                    this.clearEndings();
                                 }
                              } else {
                                 this.setEndings("", "а", "у", "а", "ом", "е");
                                 result = anyWord;
                                 this.terminate = true;
                              }
                           } else {
                              this.setEndings(cEnd, "ого", "ому", "ого", "ым", "ом");
                              result = anyWord.substring(0, len - 2);
                              prev = s.length() > 2?s.charAt(len - 3):32;
                              if("гкх".indexOf(prev) >= 0 || "цш".indexOf(prev) >= 0 || "чщ".indexOf(prev) >= 0 || prev == 1078) {
                                 this.ends[5] = "им";
                              }

                              this.terminate = !this.adjective(s);
                           }

                           if(!isSoul) {
                              this.ends[4] = this.ends[1];
                           }
                        } else {
                           if(s.endsWith("иеся")) {
                              this.setEndings("е", "х", "м", "е", "ми", "х");
                              result = anyWord.substring(0, len - 3) + this.ends[padeg] + anyWord.substring(len - 2);
                              return result;
                           }

                           if(this.plural(s)) {
                              if(!cEnd.equals("ии") && !cEnd.equals("ия")) {
                                 if(cEnd.equals("ие")) {
                                    this.setEndings("е", "х", "м", "х", "ми", "х");
                                    result = anyWord.substring(0, len - 1);
                                 } else if(cEnd.equals("ли")) {
                                    this.setEndings("и", "ей", "ям", "ей", "ями", "ях");
                                    result = anyWord.substring(0, len - 1);
                                 } else if(last == 1099) {
                                    this.setEndings("ы", "ов", "ам", "ов", "ами", "ах");
                                    if(anyWord.equals("плиты")) {
                                       this.ends[2] = "";
                                    }

                                    result = anyWord.substring(0, len - 1);
                                 }
                              } else {
                                 this.setEndings(cEnd, "ий", "иям", cEnd, "иями", "иях");
                                 result = anyWord.substring(0, len - 2);
                              }

                              if(!isSoul) {
                                 this.ends[4] = this.ends[1];
                              }

                              this.terminate = true;
                           } else if(cEnd.equals("ое")) {
                              this.setEndings("ое", "ого", "ому", "ому", "ым", "ом");
                              if("гкх".indexOf(s.charAt(len - 3)) >= 0) {
                                 this.ends[5] = "им";
                              }

                              if(!isSoul) {
                                 this.ends[4] = this.ends[1];
                              }

                              result = anyWord.substring(0, len - 2);
                           } else if(cEnd.equals("ее")) {
                              this.setEndings("ее", "его", "ему", "ему", "им", "ем");
                              if(!isSoul) {
                                 this.ends[4] = this.ends[1];
                              }

                              result = anyWord.substring(0, len - 2);
                           } else if(cEnd.equals("ие")) {
                              this.terminate = !this.adjective(s);
                              if(this.terminate) {
                                 this.setEndings("е", "я", "ю", "е", "ем", "и");
                              } else {
                                 this.setEndings("е", "х", "м", "х", "ми", "х");
                              }

                              result = anyWord.substring(0, len - 1);
                              if(!isSoul) {
                                 this.ends[4] = this.ends[1];
                              }
                           } else if(cEnd.equals("ые")) {
                              this.setEndings("е", "х", "м", "х", "ми", "х");
                              if(!isSoul) {
                                 this.ends[4] = this.ends[1];
                              }

                              result = anyWord.substring(0, len - 1);
                           } else if(cEnd.equals("ье")) {
                              if(isSoul) {
                                 this.terminate = true;
                                 return anyWord;
                              }

                              this.terminate = !this.adjective(s);
                              if(this.terminate) {
                                 this.setEndings("е", "я", "ю", "е", "ем", "и");
                              } else {
                                 this.setEndings("е", "его", "ему", "е", "им", "ем");
                              }

                              result = anyWord.substring(0, len - 1);
                           } else if(cEnd.equals("ои")) {
                              this.setEndings("и", "ев", "ям", "и", "ями", "ях");
                              result = anyWord.substring(0, len - 1);
                              this.terminate = true;
                           } else {
                              prev = s.charAt(len - 2);
                              if(last == 1072 && "бвгджзйклмнпрстфхцчшщ".indexOf(prev) >= 0) {
                                 this.setEndings("а", "ы", "е", "у", "ой", "е");
                                 if("чщ".indexOf(prev) >= 0 || "гкх".indexOf(prev) >= 0 || "жш".indexOf(prev) >= 0) {
                                    this.ends[2] = "и";
                                 }

                                 if("чщ".indexOf(prev) >= 0 || "цш".indexOf(prev) >= 0 || "ж".indexOf(prev) >= 0) {
                                    this.ends[5] = "ей";
                                 }

                                 result = anyWord.substring(0, len - 1);
                                 this.terminate = true;
                              } else if(last == 1103) {
                                 if(s.equals("учащийся")) {
                                    this.setEndings("ий", "его", "ему", "его", "им", "ем");
                                    result = anyWord.substring(0, len - 4) + this.ends[padeg] + anyWord.substring(len - 2);
                                    this.terminate = true;
                                    return result;
                                 }

                                 this.setEndings("я", "и", "е", "ю", "ей", "е");
                                 this.terminate = true;
                                 result = anyWord.substring(0, len - 1);
                                 if(prev == 1080) {
                                    this.ends[3] = "и";
                                    this.ends[6] = "и";
                                 } else if(prev == 1072) {
                                    result = anyWord.substring(0, len - 2);
                                    this.setEndings("ая", "ой", "ой", "ую", "ой", "ой");
                                    if("чщ".indexOf(s.charAt(len - 3)) >= 0) {
                                       this.setEndings("ая", "ей", "ей", "ую", "ей", "ей");
                                    }

                                    this.terminate = !this.adjective(s);
                                 } else if(prev == 1103) {
                                    this.setEndings("яя", "ей", "ей", "юю", "ей", "ей");
                                    result = anyWord.substring(0, len - 2);
                                    this.terminate = false;
                                 }
                              } else if(last == 1086) {
                                 result = anyWord;
                                 this.terminate = true;
                              } else if(last == 1080 && anyWord.equals("ясли")) {
                                 this.setEndings("и", "ей", "ям", "и", "ями", "ях");
                                 result = anyWord.substring(0, len - 1);
                                 this.terminate = true;
                              } else {
                                 result = anyWord;
                              }
                           }
                        }

                        result = result + this.ends[padeg];
                        return result;
                     }
                  }
               }
            } else {
               this.terminate = true;
               return anyWord;
            }
         } else {
            this.terminate = true;
            return anyWord;
         }
      } else {
         return anyWord;
      }
   }

   public String getDeclension(String s, int padeg, boolean isSoul) {
      this.comma = false;
      this.memoTerm = false;
      if(!FioComm.isRangeInt(1, 6, padeg)) {
         throw FioComm.createDeclenError(-1, String.valueOf(padeg));
      } else {
         int tmpI = s.indexOf(" - ");
         if(tmpI > 0 && isSoul) {
            return this.getDeclension(s.substring(0, tmpI - 1), padeg, isSoul) + " - " + this.getDeclension(s.substring(tmpI + 3), padeg, isSoul);
         } else {
            s = this.formatParameter(s);
            s = this.formatChar(s, '-');
            StrUtils.Border[] b = StrUtils.countWords(s, " ");
            int wrdCount = b.length;
            int currWrd = 0;
            this.prevWord = "";
            boolean breakDecl = false;
            StringBuilder result = new StringBuilder();

            for(int res = 0; res < wrdCount; ++res) {
               String tmpS = s.substring(b[res].left, b[res].right);
               if(tmpS.indexOf(45) >= 0) {
                  if(this.isNumeral(tmpS)) {
                     result.append(' ').append(this.declNumeral(tmpS, padeg, isSoul));
                  } else if(!TExceptionDic.exceptionDic.getRightPart(tmpS, "HyphenAbbreviation").equals(tmpS)) {
                     String j = TExceptionDic.exceptionDic.getRightPart(tmpS, "HyphenAbbreviation");
                     this.terminate = breakDecl;
                     j = this.processWord(j, padeg, isSoul, false);
                     breakDecl = this.terminate;
                     result.append(' ').append(this.restoreWordView(tmpS, j));
                  } else {
                     result.append(' ');
                     StrUtils.Border[] var17 = StrUtils.countWords(tmpS, "-");
                     int wrdNext = var17.length;

                     for(int j1 = 0; j1 < wrdNext; ++j1) {
                        String subWrd = tmpS.substring(var17[j1].left, var17[j1].right);
                        this.terminate = breakDecl;
                        result.append(this.processWord(subWrd, padeg, isSoul, true));
                        breakDecl = this.terminate;
                        if(j1 < wrdNext - 1) {
                           result.append('-');
                        }
                     }
                  }
               } else {
                  this.terminate = breakDecl;
                  result.append(' ').append(this.processWord(tmpS, padeg, isSoul, false));
                  breakDecl = this.terminate;
                  if(breakDecl && !tmpS.toLowerCase().equals("по")) {
                     tmpI = 0;

                     for(int var18 = res + 1; var18 < wrdCount; ++var18) {
                        String var19 = s.substring(b[var18].left, b[var18].right);
                        if(!this.adjective(var19)) {
                           ++tmpI;
                        }

                        if(var19.equals("и")) {
                           --tmpI;
                           if(var18 == res + 1 || tmpI == 0 && var18 == wrdCount - 2) {
                              tmpI = 0;
                              break;
                           }
                        }

                        if(var19.equals("в")) {
                           --tmpI;
                           if(tmpI == 0) {
                              tmpI = 1;
                              break;
                           }
                        }
                     }

                     breakDecl = tmpI != 0;
                  }
               }

               currWrd = res;
               if(breakDecl) {
                  break;
               }
            }

            if(currWrd < wrdCount - 1) {
               result.append(' ').append(s.substring(b[currWrd + 1].left));
            }

            String var16 = result.toString();
            var16 = this.formatChar(var16, ' ').trim();
            var16 = var16.replace(". )", ".)");
            return var16;
         }
      }
   }

   public String getAppointment(String s, int padeg) {
      return this.getDeclension(s, padeg, true);
   }

   public String getOffice(String s, int padeg) {
      return this.getDeclension(s, padeg, false);
   }

   public String getFullAppointment(String appointment, String office, int padeg) {
      if(!FioComm.isRangeInt(1, 6, padeg)) {
         throw FioComm.createDeclenError(-1, String.valueOf(padeg));
      } else {
         StrUtils.Border[] off_b = StrUtils.countWords(office, " ");
         String anyWord = off_b.length < 1?"":office.substring(off_b[0].left, off_b[0].right);
         if(!this.abbreviation(anyWord, 2) && !TExceptionDic.exceptionDic.present(anyWord, "OfficeNoLowerCase") && office.length() >= 1) {
            office = office.toLowerCase().charAt(0) + office.substring(1);
         }

         appointment = appointment.replace(".", ". ");
         StrUtils.Border[] app_b = StrUtils.countWords(appointment, " ");
         int appWordCount = app_b.length;
         String appLastWord = app_b.length < 1?"":appointment.substring(app_b[app_b.length - 1].left, app_b[app_b.length - 1].right);
         byte memoPadeg = 0;

         for(int result = 0; result < off_b.length; ++result) {
            anyWord = office.substring(off_b[result].left, off_b[result].right);
            if(this.getOffice(anyWord, 2).equals(appLastWord)) {
               memoPadeg = 2;
               break;
            }

            if(this.getOffice(anyWord, 5).equals(appLastWord)) {
               memoPadeg = 5;
               break;
            }
         }

         if(memoPadeg != 0) {
            --appWordCount;
         } else {
            memoPadeg = 2;
         }

         if(appLastWord.length() >= 8 && appLastWord.substring(0, 8).toLowerCase().equals("заведующ")) {
            memoPadeg = 5;
         }

         StringBuilder var12 = new StringBuilder();
         if(appWordCount < 1) {
            var12.append(this.getOffice(office, memoPadeg));
            return var12.toString();
         } else {
            for(int i = 0; i < app_b.length; ++i) {
               var12.append(appointment.substring(app_b[i].left, app_b[i].right)).append(' ');
            }

            var12.append(this.getOffice(office, memoPadeg));
            return this.getAppointment(var12.toString(), padeg);
         }
      }
   }
}
