package example;

public class Format {

	public static void main(String[] args) {
		double x = 0.321847012;
		int y = 134211334;
		//%[alignment][width][.decimal]f for decimal num
		//%[alignment][width]d for int num
		System.out.format("%10.5f", x);
		System.out.println("");
		System.out.format("%-60d", y);
		System.out.println("");
		
		

	}

}
