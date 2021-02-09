import java.util.Scanner;
class LineComparisonProb{
   public static void main(String[] args){
      float x1,y1,x2,y2;
      double length;
      System.out.println("Welcome to Line Comparison Problems.");

      Scanner sc = new Scanner(System.in);
      System.out.println("\n Enter x1-y1 co-ordinates of the line.");
      x1 = sc.nextFloat();
      y1 = sc.nextFloat();

      System.out.println("\n Enter x2-y2 co-ordinates of the line.");
      x2 = sc.nextFloat();
      y2 = sc.nextFloat();

      System.out.println("\n Coordinates of the line are x1="+x1+ " y1="+y1+" and x2="+x2 + " y2="+y2);

      length = Math.sqrt(Math.pow((x2 - x1),2) +  Math.pow((y2 - y1),2));
      System.out.println("\nLength of the line : "+ length);
   }
}
