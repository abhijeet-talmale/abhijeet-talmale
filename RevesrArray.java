import java.util.Scanner;

/*6:Write a program which read aaray of 5 elements and print reverse array.*/

public class RevesrArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Result is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nReverse Array is=");
		for(int i=arr.length-1;i>=0;i--) {
	         System.out.print(+arr[i] + "  ");
		}
	}

}
