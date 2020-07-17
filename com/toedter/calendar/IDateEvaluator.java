package com.toedter.calendar;

import java.awt.Color;
import java.util.Date;

public interface IDateEvaluator {

   boolean isSpecial(Date var1);

   Color getSpecialForegroundColor();

   Color getSpecialBackroundColor();

   String getSpecialTooltip();

   boolean isInvalid(Date var1);

   Color getInvalidForegroundColor();

   Color getInvalidBackroundColor();

   String getInvalidTooltip();
}
