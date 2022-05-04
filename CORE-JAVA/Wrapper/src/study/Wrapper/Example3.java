package study.Wrapper;

public class Example3 {

	public static void main(String[] args) {
// 		Integer Constant Pool Is Created Only For Range -128 to 127
		Integer I1 = 30;
		Integer I2 = 30;
		if (I1 == I2)
			System.out.println("Both I1 an I2 are Refrencing same object");
		else
			System.out.println("Both I1 an I2 are Refrencing Different object");

		Integer I3 = Integer.valueOf(35);
		Integer I4 = Integer.valueOf(35);  // after 127 => diff show
		if (I3 == I4)
			System.out.println("Both I3 an I4 are Refrencing same object");
		else
			System.out.println("Both I3 an I4 are Refrencing Different object");

		I3++; // creates a new Object , Integer is Immutable
		
	}

}
