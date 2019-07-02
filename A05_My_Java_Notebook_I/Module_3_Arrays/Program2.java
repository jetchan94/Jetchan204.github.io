public class Program2 {
    public static void main(String[ ] args) {
	int[][] sample = {{1, 2, 3}, {4, 5, 6}};
	//System.out.println(sample);
	
	int x = sample[1][0];	// 2nd array, 1st element = 4
	System.out.println(x);	// Outputs 4

	int[][] myArr = {{1, 2, 3}, {4}, {5, 6, 7}};
	myArr[0][2] = 42;
	int x1 = myArr[1][0]; 	// 4
	System.out.println(x1);	// 2nd array, 1st element = 4
	
	}
}