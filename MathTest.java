import java.util.Random;
public class MathTest {
public static void main(String[] args) {
		//output
		System.out.println("The square root of 37: "+java.lang.Math.log(37));
		System.out.println("The sine and cosine of 300 : "+java.lang.Math.tan(300));
		System.out.println("The value of the floor, ceiling, and round of 22.8: "+java.lang.Math.floor(22.8));
		System.out.println("The larger and smaller of the character 'D' and the integer 71: "+java.lang.Math.round(71));
		Random rand = new Random();
		int value = rand.nextInt(100) +1;
		System.out.println("Random number between 0 and 20: " + value);
		
	}

}
