package example;

public class Reverse {

	public static void main(String[] args) {
		int[] reverse = new int[10];
		
		for (int i = reverse.length -1; i !=0; i--) {
			reverse[reverse.length-i-1] = i;
		}
		
		for (int i = 0; i < reverse.length; i ++) {
			System.out.println(reverse[i]);
		}

	}

}
