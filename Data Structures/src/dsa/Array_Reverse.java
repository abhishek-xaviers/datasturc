
package dsa;

public class Array_Reverse {

	public Array_Reverse() {

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5,7};
		int length = arr.length-1;
		int temp;

		for (int i : arr) {
			System.out.print(i + " ");

		}
		
		int j = 0;
		while(j < length) {
			temp = arr[j];
			arr[j] = arr[length];
			arr[length] = temp;
			
			j++;
			length--;
		}
		
		System.out.println("Reverse Array");
		for (int i : arr) {
			System.out.print(i + " ");

		}

	}

}
