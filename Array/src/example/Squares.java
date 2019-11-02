package example;

public class Squares {

	public static void main(String[] args) {
		int[] squares = new int[5];

		for (int i = 0; i < squares.length; i++) {
			squares[i] = i * i;
		}

		for (int i = 0; i < squares.length; i++) {
			System.out.println(squares[i]);
		}
	}

}
