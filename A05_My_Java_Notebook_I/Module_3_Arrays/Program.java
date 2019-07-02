public class Program {
    public static void main(String[ ] args) {
	// Array Length
		System.out.println("Array Length:");
		int[] intArr = new int[5];
		System.out.println(intArr.length);
		
	// Sum of all elements in an array using for loop
		System.out.println("\nSum of all elements in an array using for loop:");
		int[] myArr = {6, 42, 3, 7};
		int sum = 0;
		for (int x = 0; x < myArr.length; x++) {
			sum += myArr[x];
		}
		System.out.println(sum);
    }
}