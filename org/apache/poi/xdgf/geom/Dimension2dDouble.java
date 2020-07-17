package org.apache.poi.xdgf.geom;

import java.awt.geom.Dimension2D;

public class Dimension2dDouble extends Dimension2D {

   double width;
   double height;


   public Dimension2dDouble() {
      this.width = 0.0D;
      this.height = 0.0D;
   }

   public Dimension2dDouble(double width, double height) {
      this.width = width;
      this.height = height;
   }

   public double getWidth() {
      return this.width;
   }

   public double getHeight() {
      return this.height;
   }

   public void setSize(double width, double height) {
      this.width = width;
      this.height = height;
   }

   public boolean equals(Object obj) {
      if(!(obj instanceof Dimension2dDouble)) {
         return false;
      } else {
         Dimension2dDouble other = (Dimension2dDouble)obj;
         return this.width == other.width && this.height == other.height;
      }
   }

   public int hashCode() {
      double sum = this.width + this.height;
      return (int)Math.ceil(sum * (sum + 1.0D) / 2.0D + this.width);
   }

   public String toString() {
      return "Dimension2dDouble[" + this.width + ", " + this.height + "]";
   }
}
