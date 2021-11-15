import java.util.*;
public class Runner {
	
	static Scanner user = new Scanner(System.in);

	public static void main(String[] args) {
		//Create boxes
		Box a = new Box();
		Box b = new Box("b", 4, 4, 8);
		Box c = new Box("c", 12, 40, 10);
		//Get Volume of Boxes
		a.getVolume();
		b.getVolume();
		c.getVolume();
		//Variables for next step
		int radius;
		int count = 0;
		//Get user input
		System.out.println();
		System.out.println("What is the radius of the ball?");
		radius = user.nextInt();
		//Check if user input radius fits any of the boxes, if so tell the user which ones did. 
		//Or if none did tell them none did 
		if(a.fitsBall(radius)) {
			System.out.println("The ball fits in: " + a.getName());
			count++;
		}
		if(b.fitsBall(radius)) {
			System.out.println("The ball fits in: " + b.getName());
			count++;
		}
		if(c.fitsBall(radius)) {
			System.out.println("The ball fits in: " + c.getName());
			count++;
		}
		if(count == 0) {
			System.out.println("It doesn't fit any of them.");
		}
		//end program
	}
}