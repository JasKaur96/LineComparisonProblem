import java.util.Scanner;
class LineComparisonProb{
   public static void main(String[] args){
		float x1,y1,x2,y2,x3,y3,x4,y4;
		double length1,length2;
		System.out.println("Welcome to Line Comparison Problems.");

		Scanner sc = new Scanner(System.in);
      System.out.println("\n Enter x1-y1 co-ordinates of the line.");
      x1 = sc.nextFloat();
      y1 = sc.nextFloat();

      System.out.println("\n Enter x2-y2 co-ordinates of the line.");
      x2 = sc.nextFloat();
      y2 = sc.nextFloat();

      System.out.println("\n Enter x3-y3 co-ordinates of the line.");
      x1 = sc.nextFloat();
      y1 = sc.nextFloat();

      System.out.println("\n Enter x24-y4 co-ordinates of the line.");
      x2 = sc.nextFloat();
      y2 = sc.nextFloat();
      
		System.out.println("\n Coordinates of the line1 is x1="+x1+ " y1="+y1+" and x2="+x2 + " y2="+y2);
 		System.out.println("\n Coordinates of the line2 is x3="+x3+ " y3="+y3+" and x4="+x4 + " y4="+y4);

			
		length1 = Math.sqrt(Math.pow((x2 - x1),2) +  Math.pow((y2 - y1),2));
		length2 = Math.sqrt(Math.pow((x4 - x3),2) +  Math.pow((y4 - y3),2));	

      if(length1 == length2)
			System.out.println("\n The lines are Equal. ");
		else
         System.out.println("\n The lines are not Equal. ");
		
	}
}
