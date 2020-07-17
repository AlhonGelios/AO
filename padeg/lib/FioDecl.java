package padeg.lib;

import padeg.lib.FIO;
import padeg.lib.FioComm;
import padeg.lib.StrUtils;
import padeg.lib.Syllable;
import padeg.lib.TExceptionDic;

public class FioDecl {

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

   private String leaveWithoutDeclension(String lastName, String firstName, String middleName) {
      StringBuilder result = new StringBuilder();
      if(firstName.length() == 0) {
         result.append(lastName).append(' ').append(middleName);
      } else if(firstName.charAt(firstName.length() - 1) == 46) {
         result.append(lastName).append(' ').append(firstName).append(middleName);
      } else {
         result.append(lastName).append(' ').append(firstName).append(' ').append(middleName);
      }

      return FioComm.proper(result.toString()).trim();
   }

   private String addSpaceAfterPoint(String s) {
      String result = s.trim();
      if(result.length() > 0) {
         int i = result.indexOf(46);
         if(i >= 0) {
            result = result.substring(0, i).trim() + ". " + this.addSpaceAfterPoint(result.substring(i + 1));
         }
      }

      return result;
   }

   public boolean nonDeclension(String anyWord, boolean male, boolean isLastName, boolean multiple) {
      if(anyWord.length() == 0) {
         return true;
      } else {
         int len = anyWord.length();
         char last = anyWord.charAt(len - 1);
         if("аоуыэяеёюи".indexOf(last) >= 0 && "аяиы".indexOf(last) < 0) {
            return true;
         } else {
            if(isLastName) {
               if(len <= 2) {
                  return true;
               }

               if(multiple) {
                  if(anyWord.equalsIgnoreCase("Бут") || anyWord.equalsIgnoreCase("Тер") || anyWord.equalsIgnoreCase("Аскер") || anyWord.equalsIgnoreCase("Кара") || anyWord.equalsIgnoreCase("Бонч") || anyWord.equalsIgnoreCase("Куй")) {
                     return true;
                  }

                  if(TExceptionDic.exceptionDic.present(anyWord, "FirstPartLastName")) {
                     return true;
                  }
               }

               String cEnd = anyWord.substring(len - 2);
               if(cEnd.equals("иа") || cEnd.equals("ия")) {
                  return true;
               }

               if(male) {
                  if(last == 1080 && !anyWord.substring(len - 3, len - 1).equals("ск") || last == 1099 && anyWord.charAt(len - 2) != 1085) {
                     return true;
                  }

                  if((cEnd.equals("их") || cEnd.equals("ых")) && !TExceptionDic.exceptionDic.present(anyWord, "BaseNonRussian")) {
                     return true;
                  }
               } else {
                  if("бвгджзйклмнпрстфхцчшщ".indexOf(last) >= 0 || "ьиы".indexOf(last) >= 0) {
                     return true;
                  }

                  if(TExceptionDic.exceptionDic.present(anyWord, "LastNameW")) {
                     return true;
                  }
               }

               if(TExceptionDic.exceptionDic.present(anyWord, "LastName")) {
                  return true;
               }
            } else {
               if("иы".indexOf(last) >= 0) {
                  return true;
               }

               if(male) {
                  if(TExceptionDic.exceptionDic.present(anyWord, "FirstNameM")) {
                     return true;
                  }
               } else {
                  if("бвгджзйклмнпрстфхцчшщ".indexOf(last) >= 0) {
                     return true;
                  }

                  if(TExceptionDic.exceptionDic.present(anyWord, "FirstNameW")) {
                     return true;
                  }
               }
            }

            return false;
         }
      }
   }

   public String getFirstNameM(String firstName, int padeg) {
      if(firstName.length() == 0) {
         return "";
      } else {
         firstName = FioComm.proper(firstName);
         String result = firstName;
         if(firstName.equalsIgnoreCase("Пётр") && padeg >= 2) {
            firstName = firstName.replace('\u0451', '\u0435');
         }

         int len = firstName.length();
         if(padeg > 1 && firstName.charAt(len - 1) != 46) {
            if(firstName.charAt(len - 1) == 1086) {
               firstName = FioComm.proper(TExceptionDic.exceptionDic.getRightPart(firstName, "FirstNameParallelForms"));
               len = firstName.length();
            }

            if(this.nonDeclension(firstName, true, false, false)) {
               return result;
            }

            char last = firstName.charAt(len - 1);
            this.clearEndings();
            if(firstName.equalsIgnoreCase("Лев")) {
               firstName = "Льв";
               this.setEndings("", "а", "у", "а", "ом", "е");
            } else if(firstName.equalsIgnoreCase("Павел")) {
               firstName = "Павл";
               this.setEndings("", "а", "у", "а", "ом", "е");
            } else {
               char prev = firstName.length() > 1?firstName.charAt(len - 2):32;
               if(last != 1081 && last != 1100) {
                  if(last == 1072 && "бвгджзйклмнпрстфхцчшщ".indexOf(prev) >= 0) {
                     this.setEndings("а", "ы", "е", "у", "ой", "е");
                     if("гкх".indexOf(prev) >= 0 || "чщ".indexOf(prev) >= 0 || "жш".indexOf(prev) >= 0) {
                        this.ends[2] = "и";
                     }

                     if("цш".indexOf(prev) >= 0 || "чщ".indexOf(prev) >= 0 || 1078 == prev) {
                        this.ends[5] = "ей";
                     }

                     if(len > 2) {
                        firstName = firstName.substring(0, len - 1);
                     }
                  } else if(last == 1103 && ("бвгджзйклмнпрстфхцчшщ".indexOf(prev) >= 0 || 1100 == prev)) {
                     this.setEndings("я", "и", "е", "ю", "ей", "е");
                     if(len > 2) {
                        firstName = firstName.substring(0, len - 1);
                     }
                  } else if("бвгджзйклмнпрстфхцчшщ".indexOf(last) >= 0) {
                     this.setEndings("", "а", "у", "а", "ом", "е");
                  }
               } else {
                  this.setEndings(String.valueOf(last), "я", "ю", "я", "ем", "е");
                  if(prev == 1080) {
                     this.ends[6] = "и";
                  }

                  firstName = firstName.substring(0, len - 1);
               }

               if("цш".indexOf(last) >= 0 || "чщ".indexOf(last) >= 0 || 1078 == last) {
                  this.ends[5] = "ем";
               }
            }

            result = firstName + this.ends[padeg];
         }

         return result;
      }
   }

   private String getFirstNameW(String firstName, int padeg) {
      if(firstName.length() == 0) {
         return "";
      } else {
         firstName = FioComm.proper(firstName);
         String result = firstName;
         int len = firstName.length();
         if(padeg > 1 && firstName.charAt(len - 1) != 46) {
            if(this.nonDeclension(firstName, false, false, false)) {
               return firstName;
            }

            this.clearEndings();
            char last = firstName.charAt(len - 1);
            char prev = firstName.length() > 1?firstName.charAt(len - 2):32;
            if(last == 1072) {
               this.setEndings("а", "ы", "е", "у", "ой", "е");
               if("гкх".indexOf(prev) >= 0 || "чщ".indexOf(prev) >= 0 || "жш".indexOf(prev) >= 0) {
                  this.ends[2] = "и";
               }

               if("цш".indexOf(prev) >= 0 || "чщ".indexOf(prev) >= 0 || 1078 == prev) {
                  this.ends[5] = "ей";
               }

               firstName = firstName.substring(0, len - 1);
            } else if(last == 1103) {
               this.setEndings("я", "и", "е", "ю", "ей", "е");
               if(prev == 1080 && TExceptionDic.exceptionDic.accentInfo(firstName) != 1) {
                  this.ends[3] = "и";
                  this.ends[6] = "и";
               }

               firstName = firstName.substring(0, len - 1);
            } else if(last == 1100) {
               this.setEndings("ь", "и", "и", "ь", "ью", "и");
               firstName = firstName.substring(0, len - 1);
            }

            result = firstName + this.ends[padeg];
         }

         return result;
      }
   }

   private String getMiddleNameM(String middleName, int padeg) {
      if(middleName.length() == 0) {
         return "";
      } else {
         middleName = FioComm.proper(middleName);
         String result = middleName;
         int len = middleName.length();
         char last = middleName.charAt(len - 1);
         if(padeg > 1 && last != 46) {
            if(FioComm.getSex(middleName) == 1084) {
               this.setEndings("", "а", "у", "а", "ем", "е");
               if(last != 1095) {
                  this.clearEndings();
               }

               result = middleName + this.ends[padeg];
            } else {
               result = this.getFirstNameM(middleName, padeg);
            }
         }

         return result;
      }
   }

   private String getMiddleNameW(String middleName, int padeg) {
      if(middleName.length() == 0) {
         return "";
      } else {
         middleName = FioComm.proper(middleName);
         String result = middleName;
         int len = middleName.length();
         char last = middleName.charAt(len - 1);
         if(padeg > 1 && last != 46) {
            if(FioComm.getSex(middleName) == 1078) {
               this.setEndings("а", "ы", "е", "у", "ой", "е");
               if(last == 1072) {
                  middleName = middleName.substring(0, len - 1);
               } else {
                  this.clearEndings();
               }

               result = middleName + this.ends[padeg];
            } else {
               result = this.getFirstNameW(middleName, padeg);
            }
         }

         return result;
      }
   }

   private String getLastNameM(String lastName, int padeg, boolean multiple) {
      if(lastName.length() == 0) {
         return "";
      } else {
         String result = "";
         int len = lastName.length();
         int delimPos = lastName.indexOf(45);
         if(delimPos >= 0) {
            int var10 = StrUtils.wordCount(lastName, "-");
            String var11 = lastName.substring(0, delimPos).trim();
            String var12 = lastName.substring(delimPos + 1).trim();
            if(var10 == 2 && var12.toLowerCase().indexOf("оглы") >= 0) {
               result = StrUtils.properCase(var11, " ") + '-' + var12;
               return result;
            } else {
               result = this.getLastNameM(var11, padeg, true) + '-' + this.getLastNameM(var12, padeg, false);
               return result;
            }
         } else {
            lastName = FioComm.proper(lastName);
            this.clearEndings();
            result = lastName;
            if(padeg > 1) {
               if(this.nonDeclension(lastName, true, true, multiple)) {
                  return lastName;
               }

               String cEnd = lastName.length() < 3?lastName:lastName.substring(len - 3);
               if(cEnd.equals("ски") && padeg > 1) {
                  lastName = lastName + '\u0439';
                  cEnd = "ий";
                  ++len;
               }

               cEnd = lastName.length() < 2?lastName:lastName.substring(len - 2);
               if(cEnd.equals("ны") && padeg > 1) {
                  lastName = lastName + '\u0439';
                  cEnd = "ый";
                  ++len;
               }

               if(cEnd.equals("ый")) {
                  this.setEndings("", "ого", "ому", "ого", "ым", "ом");
                  if(padeg > 1) {
                     lastName = lastName.substring(0, len - 2);
                  }
               } else {
                  char last;
                  if(cEnd.equals("ой")) {
                     this.setEndings("", "ого", "ому", "ого", "ым", "ом");
                     last = lastName.charAt(len - 3);
                     if(Syllable.countSyllable(lastName) != 1 && last != 1088) {
                        if("гкх".indexOf(last) >= 0 || "чщ".indexOf(last) >= 0) {
                           this.ends[5] = "им";
                        }

                        if(padeg > 1) {
                           lastName = lastName.substring(0, len - 2);
                        }
                     } else {
                        this.setEndings("й", "я", "ю", "я", "ем", "е");
                        lastName = lastName.substring(0, len - 1);
                     }
                  } else if(!cEnd.equals("ий") && !cEnd.equals("ей") && !cEnd.equals("ай") && !cEnd.equals("яй") && !cEnd.equals("уй")) {
                     if(!cEnd.equals("ын") && !cEnd.equals("ин") && !cEnd.equals("ев") && !cEnd.equals("ёв") && !cEnd.equals("ов")) {
                        if(!cEnd.equals("ич") && !cEnd.equals("ач")) {
                           if(cEnd.equals("ок")) {
                              this.setEndings("", "а", "у", "а", "ом", "е");
                              if(padeg > 1 && Syllable.countSyllable(lastName) > 1 && !TExceptionDic.exceptionDic.present(lastName, "NonLeaveVocalic") && lastName.charAt(len - 3) != 1082 && "бвгджзйклмнпрстфхцчшщ".indexOf(lastName.charAt(len - 4)) < 0) {
                                 lastName = lastName.substring(0, len - 2) + '\u043a';
                              }
                           } else if(cEnd.equals("ец")) {
                              this.setEndings("", "а", "у", "а", "ем", "е");
                              if(!TExceptionDic.exceptionDic.present(lastName, "NonLeaveVocalic")) {
                                 this.ends[5] = "ом";
                                 if(padeg > 1) {
                                    switch(Character.toLowerCase(lastName.charAt(len - 3))) {
                                    case 1072:
                                    case 1077:
                                    case 1080:
                                    case 1086:
                                    case 1091:
                                       this.ends[5] = "ем";
                                       lastName = lastName.substring(0, len - 2) + "йц";
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
                                       if(Syllable.countSyllable(lastName) > 1) {
                                          lastName = lastName.substring(0, len - 2) + '\u0446';
                                       }
                                       break;
                                    case 1076:
                                    case 1085:
                                       if(len > 3 && "аоуыэяеёюи".indexOf(lastName.charAt(len - 4)) >= 0 && Syllable.countSyllable(lastName) > 2) {
                                          lastName = lastName.substring(0, len - 2) + '\u0446';
                                       }
                                       break;
                                    case 1083:
                                       if(len > 3) {
                                          if("аоуыэяеёюи".indexOf(lastName.charAt(len - 4)) >= 0) {
                                             lastName = lastName.substring(0, len - 2) + "ьц";
                                          } else {
                                             this.ends[5] = "ем";
                                             if(lastName.charAt(len - 4) == 1081) {
                                                this.ends[5] = "ом";
                                             }
                                          }
                                       }
                                       break;
                                    case 1087:
                                       if(len > 3) {
                                          if("аоуыэяеёюи".indexOf(lastName.charAt(len - 4)) >= 0) {
                                             this.ends[5] = "ем";
                                             lastName = lastName.substring(0, len - 2) + '\u0446';
                                          }
                                       } else {
                                          this.ends[5] = "ем";
                                       }
                                    }

                                    if(TExceptionDic.exceptionDic.accentInfo(result) == 2) {
                                       this.ends[5] = "ем";
                                    }
                                 }
                              }
                           } else {
                              last = lastName.charAt(len - 1);
                              char prev = lastName.length() > 1?lastName.charAt(len - 2):32;
                              if(last == 1072 && "бвгджзйклмнпрстфхцчшщ".indexOf(prev) >= 0) {
                                 this.setEndings("а", "ы", "е", "у", "ой", "е");
                                 if("гкх".indexOf(prev) >= 0 || "чщ".indexOf(prev) >= 0 || "жш".indexOf(prev) >= 0) {
                                    this.ends[2] = "и";
                                 }

                                 if(("чщ".indexOf(prev) >= 0 || "цш".indexOf(prev) >= 0 || 1078 == prev) && TExceptionDic.exceptionDic.accentInfo(lastName) != 1) {
                                    this.ends[5] = "ей";
                                 }

                                 lastName = lastName.substring(0, len - 1);
                              } else if(last == 1103 && "бвгджзйклмнпрстфхцчшщь".indexOf(prev) >= 0) {
                                 this.setEndings("я", "и", "е", "ю", "ей", "е");
                                 lastName = lastName.substring(0, len - 1);
                              } else if(last == 1100) {
                                 this.setEndings("", "я", "ю", "я", "ем", "е");
                                 if(padeg > 1) {
                                    lastName = lastName.substring(0, len - 1);
                                 }
                              } else if("бвгджзйклмнпрстфхцчшщ".indexOf(last) >= 0) {
                                 this.setEndings("", "а", "у", "а", "ом", "е");
                                 if("цш".indexOf(last) >= 0) {
                                    this.ends[5] = "ем";
                                 }
                              }
                           }
                        } else {
                           this.setEndings("", "а", "у", "а", "ем", "е");
                        }
                     } else {
                        this.setEndings("", "а", "у", "а", "ым", "е");
                        if(lastName.equalsIgnoreCase("Лев") && padeg > 1) {
                           lastName = "Льв";
                        }

                        if(Syllable.countSyllable(lastName) == 1) {
                           this.ends[5] = "ом";
                        }

                        if(lastName.equalsIgnoreCase("Львов")) {
                           this.ends[5] = "ым";
                        }

                        if(TExceptionDic.exceptionDic.present(lastName, "BaseNonRussian")) {
                           this.ends[5] = "ом";
                        }
                     }
                  } else {
                     last = lastName.charAt(len - 3);
                     if(cEnd.equals("ий") && "гкх".indexOf(last) >= 0) {
                        this.setEndings(cEnd, "ого", "ому", "ого", "им", "ом");
                        lastName = lastName.substring(0, len - 2);
                     } else if(cEnd.equals("ий") && ("цш".indexOf(last) >= 0 || "чщ".indexOf(last) >= 0 || "нж".indexOf(last) >= 0)) {
                        this.setEndings(cEnd, "его", "ему", "его", "им", "ем");
                        lastName = lastName.substring(0, len - 2);
                     } else {
                        this.setEndings("й", "я", "ю", "я", "ем", "е");
                        lastName = lastName.substring(0, len - 1);
                     }
                  }
               }

               result = lastName + this.ends[padeg];
            }

            return result;
         }
      }
   }

   private String getLastNameW(String lastName, int padeg, boolean multiple) {
      if(lastName.length() == 0) {
         return "";
      } else {
         String result = "";
         int len = lastName.length();
         int delimPos = lastName.indexOf(45);
         if(delimPos >= 0) {
            int var10 = StrUtils.wordCount(lastName, "-");
            String var11 = lastName.substring(0, delimPos).trim();
            String endPart = lastName.substring(delimPos + 1).trim();
            if(var10 == 2 && endPart.toLowerCase().indexOf("кызы") >= 0) {
               result = StrUtils.properCase(var11, " ") + '-' + endPart;
               return result;
            } else {
               result = this.getLastNameW(var11, padeg, true) + '-' + this.getLastNameW(endPart, padeg, false);
               return result;
            }
         } else {
            lastName = FioComm.proper(lastName);
            this.clearEndings();
            result = lastName;
            if(padeg > 1) {
               if(this.nonDeclension(lastName, false, true, multiple)) {
                  return lastName;
               }

               String cEnd = lastName.length() > 3?lastName.substring(len - 4):lastName;
               if(cEnd.equals("цына")) {
                  this.setEndings("а", "ой", "ой", "у", "ой", "ой");
                  lastName = lastName.substring(0, len - 1);
               } else {
                  cEnd = lastName.length() > 2?lastName.substring(len - 3):lastName;
                  if((cEnd.equals("ска") && "ьв".indexOf(lastName.charAt(len - 4)) >= 0 || cEnd.equals("цка")) && padeg > 1) {
                     lastName = lastName + '\u044f';
                     ++len;
                  }

                  if(!cEnd.equals("ова") && !cEnd.equals("ева") && !cEnd.equals("ёва") && !cEnd.equals("ина")) {
                     cEnd = lastName.length() > 1?lastName.substring(len - 2):lastName;
                     char prev;
                     if(!cEnd.equals("ая") && !cEnd.equals("яя")) {
                        cEnd = lastName.substring(len - 1);
                        if(cEnd.equals("а") && "бвгджзйклмнпрстфхцчшщ".indexOf(lastName.charAt(len - 2)) >= 0) {
                           this.setEndings("а", "ы", "е", "у", "ой", "е");
                           prev = lastName.charAt(len - 2);
                           if("гкх".indexOf(prev) >= 0 || "чщ".indexOf(prev) >= 0 || "жш".indexOf(prev) >= 0) {
                              this.ends[2] = "и";
                           }

                           if(("цш".indexOf(prev) >= 0 || "чщ".indexOf(prev) >= 0 || 1078 == prev) && TExceptionDic.exceptionDic.accentInfo(lastName) != 1) {
                              this.ends[5] = "ей";
                           }

                           lastName = lastName.substring(0, len - 1);
                        } else if(cEnd.equals("я") && "бвгджзйклмнпрстфхцчшщь".indexOf(lastName.charAt(len - 2)) >= 0) {
                           this.setEndings("я", "и", "е", "ю", "ей", "е");
                           lastName = lastName.substring(0, len - 1);
                        }
                     } else {
                        if(cEnd.equals("ая")) {
                           this.setEndings("ая", "ой", "ой", "ую", "ой", "ой");
                           prev = lastName.charAt(len - 3);
                           if("цш".indexOf(prev) >= 0 || "чщ".indexOf(prev) >= 0 || 1078 == prev) {
                              this.setEndings("ая", "ей", "ей", "ую", "ей", "ей");
                           }
                        } else {
                           this.setEndings("яя", "ей", "ей", "юю", "ей", "ей");
                        }

                        lastName = lastName.substring(0, len - 2);
                     }
                  } else {
                     if(TExceptionDic.exceptionDic.present(lastName, "DependedLastNameW")) {
                        this.setEndings("а", "ы", "е", "у", "ой", "е");
                     } else {
                        this.setEndings("а", "ой", "ой", "у", "ой", "ой");
                     }

                     lastName = lastName.substring(0, len - 1);
                  }
               }

               result = lastName + this.ends[padeg];
            }

            return result;
         }
      }
   }

   public String getFIO(String lastName, String firstName, String middleName, char sex, int padeg) {
      if(lastName == null) {
         lastName = "";
      } else {
         lastName = lastName.trim();
      }

      if(firstName == null) {
         firstName = "";
      } else {
         firstName = firstName.trim();
      }

      if(middleName == null) {
         middleName = "";
      } else {
         middleName = middleName.trim();
      }

      boolean flagPoint = false;
      StringBuilder result = new StringBuilder();
      if(!FioComm.isRangeInt(1, 6, padeg)) {
         throw FioComm.createDeclenError(-1, String.valueOf(padeg));
      } else {
         int midLen = middleName.length();
         if(midLen > 0 && middleName.charAt(midLen - 1) == 46) {
            String declType = middleName.substring(0, midLen - 1);
            if(FioComm.getSex(declType) != 0 || FioComm.chinaName(lastName, firstName, declType)) {
               middleName = declType;
               --midLen;
               flagPoint = true;
            }
         }

         char var10;
         if(sex == 0) {
            if(midLen <= 0) {
               return this.leaveWithoutDeclension(lastName, firstName, middleName);
            }

            if(middleName.charAt(midLen - 1) == 46) {
               return this.leaveWithoutDeclension(lastName, firstName, middleName);
            }

            var10 = FioComm.getSex(middleName);
            if(var10 != 0) {
               sex = var10;
            } else {
               sex = 1;
            }
         }

         sex = Character.toLowerCase(sex);
         if(midLen > 0) {
            if(middleName.charAt(midLen - 1) != 46) {
               var10 = FioComm.getSex(middleName);
            } else {
               var10 = sex;
            }

            if(var10 == 0) {
               if(FioComm.chinaName(lastName, firstName, middleName)) {
                  var10 = 99;
               } else {
                  var10 = sex;
               }
            }
         } else {
            var10 = sex;
         }

         switch(sex) {
         case 1078:
            if(var10 == 1078) {
               result.append(this.getLastNameW(lastName, padeg, false)).append(' ').append(this.getFirstNameW(firstName, padeg));
               if(midLen > 0) {
                  if(result.charAt(result.length() - 1) != 46 || middleName.charAt(midLen - 1) != 46) {
                     result.append(' ');
                  }

                  result.append(this.getMiddleNameW(middleName, padeg));
               }
            } else {
               result.append(this.leaveWithoutDeclension(lastName, firstName, middleName));
            }
            break;
         case 1084:
            switch(var10) {
            case 99:
               middleName = middleName.toLowerCase();
               if("бвгджзйклмнпрстфхцчшщь".indexOf(middleName.charAt(midLen - 1)) >= 0) {
                  FioComm.proper(result.append(lastName).append(' ').append(firstName)).append(' ').append(this.getFirstNameM(middleName, padeg));
               } else {
                  result.append(this.leaveWithoutDeclension(lastName, firstName, middleName));
               }

               return flagPoint?result.toString().trim() + '.':result.toString().trim();
            case 1078:
               result.append(this.leaveWithoutDeclension(lastName, firstName, middleName));
               return flagPoint?result.toString().trim() + '.':result.toString().trim();
            case 1084:
               result.append(this.getLastNameM(lastName, padeg, false)).append(' ').append(this.getFirstNameM(firstName, padeg));
               if(midLen > 0) {
                  if(result.charAt(result.length() - 1) != 46 || middleName.charAt(midLen - 1) != 46) {
                     result.append(' ');
                  }

                  result.append(this.getMiddleNameM(middleName, padeg));
               }

               return flagPoint?result.toString().trim() + '.':result.toString().trim();
            default:
               result.append(this.leaveWithoutDeclension(lastName, firstName, middleName));
               return flagPoint?result.toString().trim() + '.':result.toString().trim();
            }
         default:
            if(sex != 1) {
               throw FioComm.createDeclenError(-2, "\'" + sex + "\'");
            }

            result.append(this.leaveWithoutDeclension(lastName, firstName, middleName));
         }

         return flagPoint?result.toString().trim() + '.':result.toString().trim();
      }
   }

   public String getFIOFromStr(String cFIO, char sex, int padeg) {
      FIO fio = new FIO("", "", "");
      FioComm.separateFIO(cFIO, fio);
      if(fio.middleName.length() == 0 && FioComm.chinaName(fio.lastName, fio.firstName, fio.middleName)) {
         fio.middleName = fio.firstName;
         fio.firstName = fio.lastName;
         fio.lastName = "";
      }

      return this.getFIO(fio.lastName, fio.firstName, fio.middleName, sex, padeg);
   }

   public String getIF(String firstName, String lastName, char sex, int padeg) {
      lastName = lastName.trim();
      firstName = firstName.trim();
      StringBuilder result = new StringBuilder();
      if(FioComm.isRangeInt(1, 6, padeg)) {
         sex = Character.toLowerCase(sex);
         if(firstName.indexOf(46) >= 0) {
            firstName = this.addSpaceAfterPoint(firstName).trim();
         }

         StrUtils.Border[] borders = StrUtils.countWords(firstName, " \t");
         int n = borders.length;
         int i;
         String someName;
         int len;
         if(sex == 1084) {
            for(i = 0; i < n; ++i) {
               someName = firstName.substring(borders[i].left, borders[i].right);
               len = someName.length();
               if(someName.charAt(len - 1) == 46) {
                  result.append(FioComm.proper(someName));
               } else {
                  result.append(this.getFirstNameM(someName, padeg));
               }
            }

            result = (new StringBuilder(result.toString().trim())).append(' ').append(this.getLastNameM(lastName, padeg, false));
         } else if(sex == 1078) {
            for(i = 0; i < n; ++i) {
               someName = firstName.substring(borders[i].left, borders[i].right);
               len = someName.length();
               if(someName.charAt(len - 1) == 46) {
                  result.append(FioComm.proper(someName));
               } else {
                  result.append(this.getFirstNameW(someName, padeg));
               }
            }

            result = (new StringBuilder(result.toString().trim())).append(' ').append(this.getLastNameW(lastName, padeg, false));
         } else {
            if(sex != 0) {
               throw FioComm.createDeclenError(-2, "\'" + sex + "\'");
            }

            result.append(FioComm.proper(firstName + ' ' + lastName));
         }

         return result.toString().trim();
      } else {
         throw FioComm.createDeclenError(-1, String.valueOf(padeg));
      }
   }

   public String getIFFromStr(String cif, char sex, int padeg) {
      cif = cif.trim();
      int n = StrUtils.wordCount(cif, " \t.");
      String ci;
      String cf;
      if(n > 1) {
         int i;
         for(i = cif.length() - 1; i > 0; --i) {
            char test = cif.charAt(i);
            if(test == 46 || " \t".indexOf(test) >= 0) {
               break;
            }
         }

         cf = cif.substring(i + 1);
         ci = cif.substring(0, i);
      } else {
         cf = cif;
         ci = "";
      }

      return this.getIF(ci, cf, sex, padeg);
   }
}
