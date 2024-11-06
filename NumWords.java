// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		Integer num = Integer.parseInt(args[0]);
		Integer ones = num % 10;
		Integer tens = num % 100 / 10;
		Integer hundreds = (num - ones - tens) / 100 ;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
