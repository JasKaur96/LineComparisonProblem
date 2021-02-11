import java.util.Scanner;
class LineComparisonProb{
   private final double x1;
   private final double y1;
   private final double x2;
   private final double y2;

   public LineComparisonProb(double x1, double y1, double x2, double y2){
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
   }

   public double lengthOfLine(){
      double length = Math.sqrt(Math.pow((x2 - x1),2) +  Math.pow((y2 - y1),2));
      return length;
   }

   public static void compareTo(double length1,double length2){
      System.out.println("\n Length of line1=" + length1 +  "\n Length of line2="+length2);
      if(length1 == length2)
            System.out.println("\n The lines are Equal. ");
      else if (length1 > length2)
            System.out.println("\n Line1 is greater than line2. ");
      else
            System.out.println("\n Line2 is greater than Line1. ");
   }

   public static void main(String[] args){
      System.out.println("******Welcome to Line Comparison Problems.******");
      LineComparisonProb line1 = new LineComparisonProb(2.3,3.5,5.3,8.5);
      LineComparisonProb line2 = new LineComparisonProb(3.3,4.5,5.3,5.5);
      double length1 = line1.lengthOfLine();
      double length2 = line2.lengthOfLine();
      compareTo(length1,length2);
   }
}

