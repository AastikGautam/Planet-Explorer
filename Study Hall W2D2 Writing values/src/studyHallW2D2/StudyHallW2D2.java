package studyHallW2D2;

public class StudyHallW2D2 {
	
	/**********************************************************************************************
	 * The following are Attributes of the class StudyHallW2D2
	 */
	
	public static final long SIZE = 275;
	public static final String MESSAGE = "This is a string constant!";
	public static final boolean EXAMPLE_PROGRAM = true;
	
	public static long sum;
	public static long value1 = 15;
	public static long value2 = 34;
	public static long value3 = 75;
	
	/**********************************************************************************************
	 * The method main() is a special method.  All Java programs start with this method.  In basic
	 * programs, this may be the only method in the program's only class. Most useful programs will 
	 * have more than one class and each class will have many methods.
	 * 
	 * @param args	The program arguments (parameters) named args are ignored in this program.
	 */
	public static void main(String[] args) {
		// The following writes out a line to the console.  Run the program and see what it does.
		System.out.println("This is an exercise program.");
		
		// The following line write out MESSAGE.
		System.out.println(MESSAGE);
		
		// The following line write out SIZE.
		System.out.println(SIZE);
		
		// The following line write out EXAMPLE_PROGRAM.
		System.out.println(EXAMPLE_PROGRAM);
		
		// The following line write out sum of the variables value1, value2, and value3.
		System.out.println(value1 + value2 + value3);
		
		// The following line write out "The Sum is:".
		System.out.println("The Sum is:");
		
		// The following line write out variable sum .
		System.out.println(value1 + value2 + value3);
		
		// The following println tells the user that the program has finished.
		System.out.println("The program is finished and is now quiting.");
	}

}
