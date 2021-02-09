import java.util.Scanner;
class LineComparisonProb{
   public static void main(String[] args){
	float x1,y1,x2,y2,x3,y3,x4,y4;
	double length1,length2;
	System.out.println("Welcome to Line Comparison Problems.");

      	Scanner sc = new Scanner(System.in);
      	System.out.println("\n Enter x1 co-ordinate of the line.");
      	x1 = sc.nextFloat();
      	System.out.println("\n Enter y1 co-ordinate of the line.");
      	y1 = sc.nextFloat();

      	System.out.println("\n Enter x2 co-ordinate of the line.");
      	x2 = sc.nextFloat();
      	System.out.println("\n Enter y2 co-ordinate of the line.");
      	y2 = sc.nextFloat();

	System.out.println("\n Enter x3 co-ordinate of the line.");
      	x3 = sc.nextFloat();
      	System.out.println("\n Enter y3 co-ordinate of the line.");
      	y3 = sc.nextFloat();

	System.out.println("\n Enter x4 co-ordinate of the line.");
      	x4 = sc.nextFloat();
      	System.out.println("\n Enter y4 co-ordinate of the line.");
      	y4 = sc.nextFloat();
      
	System.out.println("\n Coordinates of the line1 is x1="+x1+ " y1="+y1+" and x2="+x2 + " y2="+y2);
 	System.out.println("\n Coordinates of the line2 is x3="+x3+ " y3="+y3+" and x4="+x4 + " y4="+y4);

	length1 = Math.sqrt(Math.pow((x2 - x1),2) +  Math.pow((y2 - y1),2));
	length2 = Math.sqrt(Math.pow((x4 - x3),2) +  Math.pow((y4 - y3),2));	
   	System.out.println("\n Length of Line1="+length1+" and Line2="+length2);
	   	compareTo(length1,length2);
	   
	}
	public static void compareTo(int length1, int length2){
       		if(length1==length2)
			System.out.println("\n The lines are Equal. ");
		else if (length1>length2)
        		System.out.println("\n line1 is gretaer than line2. ");
		else
			System.out.println("\n Line2 is gretaer than Line1. ");	
	}	
}
