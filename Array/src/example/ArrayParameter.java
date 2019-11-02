package example;

public class ArrayParameter {

	public static void tryChanging (int[] numbers, int aNum) {
		numbers[1] = 123;
		aNum = 456;
	}
	
	
	public static void main(String[] args) {
		int[] myNums = {5,8,3};
		System.out.println(myNums[1] + " " + myNums[0]);
		tryChanging(myNums, myNums[0]);
		System.out.println(myNums[1] + " " + myNums[0]);

	}

}
