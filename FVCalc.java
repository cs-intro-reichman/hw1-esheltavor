// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		Integer currentValue = Integer.parseInt(args[0]);
		Double rate = Double.parseDouble(args[1]);
		Integer years = Integer.parseInt(args[2]);
		Integer futureValue = (int) (currentValue * Math.pow(1 + rate / 100, years));
		System.out.println("After " + years + " years, $" + currentValue + " saved at " + rate + "% will yield $" + futureValue);
	}
}
