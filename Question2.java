import java.util.*;

// help acquired from Introduction of java programming comprehensive version 10th edition by Liang, section covered - reading input (2.3)
// null help cited from https://stackoverflow.com/questions/8270926/while-eof-in-java

public class Question2{
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
			while(input != null){
				System.out.println("Enter a radius: ");
				double radius = input.nextDouble();
				double area = radius * radius * 3.14159;
				System.out.println ("The area of radius " + radius + " is " + area);
			}
	}	
}