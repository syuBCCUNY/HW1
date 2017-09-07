import java.util.*;

public class Question5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.println("Enter x-coordinates for point A: ");
			double xcoordA = input.nextDouble();
			System.out.println("Enter y-coordinates for point A: ");
			double ycoordA = input.nextDouble();

			System.out.println("Enter x-coordinates for point B: ");
			double xcoordB = input.nextDouble();
			System.out.println("Enter y-coordinates for point B: ");
			double ycoordB = input.nextDouble();

			System.out.println("Enter x-coordinates for point C: ");
			double xcoordC = input.nextDouble();
			System.out.println("Enter y-coordinates for point C: ");
			double ycoordC = input.nextDouble();

			double sideAB = Math.sqrt(Math.pow((xcoordB-xcoordA),2)+Math.pow((ycoordB-ycoordA),2));
			double sideAC = Math.sqrt(Math.pow((xcoordC-xcoordA),2)+Math.pow((ycoordC-ycoordA),2));
			double sideBC = Math.sqrt(Math.pow((xcoordC-xcoordB),2)+Math.pow((ycoordC-ycoordB),2));

			System.out.println("The length of the sides are: " + sideAB + " " + sideAC + " " + sideBC);	

			if(sideAB + sideAC <= sideBC || sideAC + sideBC <= sideAB || sideAB + sideBC <= sideAC){
				System.out.println("This is a fake triangle.");
				}
			else 
				System.out.println("This is a real triangle.");
	}
}