public class Box {
	//Box Properties
	String boxName;
	int height;
	int width;
	int length;

	public static void main(String[] args) {
		//Empty main :P
	}
	
	public Box() { //No variable constructor
		//If no properties were given, we'll just asume it's an infinitely small box and call it "a".
		//Will always return false for any given radius except an infinitely small sphere.
		boxName = "a";
		height = 0;
		width = 0;
		length = 0;
	}
	
	public Box(String boxName1, int height1, int width1, int length1) { //Constructor with all variables
		//Set box's properties to given properties from Runner.java
		boxName = boxName1;
		height = height1;
		width = width1;
		length = length1;
	}
	
	public int getVolume() {
		//Generates the volume and prints the value to the player as well as returning the value through the method
		int volume;
		//Length*Width*Height = Volume
		volume = length * width * height;
		System.out.println("The volume of " + boxName + " is: " + volume);
		return volume;
	}
	
	public String getName() {
		//Provides/Returns the value for the name of the given Box
		String name;
		name = boxName;
		//System.out.println("The box's name is: " + boxName); //Debug tool
		return name;
	}
	
	public boolean fitsBall(int radius) {
		//Generates a radius of the box, then checks if the given sphere will fit in the box by comparing
		//the sphere's radius to the box's radius and returns a boolean based on results
		double boxRadius = width/2;
		if(radius <= boxRadius){
			return true;
		} else {
			return false;
		}
	}
}