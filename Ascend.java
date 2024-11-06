// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		Integer lim = Integer.parseInt(args[0]);
		Integer a = (int) (Math.random() * lim);
		Integer b = (int) (Math.random() * lim);
		Integer c = (int) (Math.random() * lim);
		System.out.println(a + " " + b + " " + c);
		Integer maxNum = Integer.max(Integer.max(a, b), c);
		Integer minNum = Integer.min(Integer.min(a, b), c);
		Integer midNum = a + b + c - maxNum - minNum;
		System.out.println(minNum + " " + midNum + " " + maxNum);
	}
}
