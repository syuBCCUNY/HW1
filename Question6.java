import java.util.*;

public class Question6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.println("Enter x-coordinates for the center of circle A: ");
			double xcoordA = input.nextDouble();
			System.out.println("Enter y-coordinates for the center of circle A: ");
			double ycoordA = input.nextDouble();
			System.out.println("Enter radius for circle A: ");
			double radA = input.nextDouble();

			System.out.println("Enter x-coordinates for the center of circle B: ");
			double xcoordB = input.nextDouble();
			System.out.println("Enter y-coordinates for the center of circle B: ");
			double ycoordB = input.nextDouble();
			System.out.println("Enter radius for circle B: ");
			double radB = input.nextDouble();
	
			double distancebetweenCircles = Math.sqrt(Math.pow((xcoordB-xcoordA),2)+Math.pow((ycoordB-ycoordA),2));	
//logic is confusing			
			if (distancebetweenCircles > radA + radB) {
				System.out.println("The circles are separate from each other.");
				} else if (distancebetweenCircles == radA + radB){
					System.out.println("The circles are touching each other.");
					} else	if (distancebetweenCircles + 2*radA < radB || distancebetweenCircles + 2*radB < radA ){
						System.out.println("The circles are completely within one other.");
						} else 	
							System.out.println("The circles are overlapping each other.");
	}
}