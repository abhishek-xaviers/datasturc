package dsa;

public class Min_Max_Array {
	int[] arr;
	int min;
	int max;

	public void getMinMax(int[] comparr, int len) {

		if (len == 1) {
			min = comparr[0];
			max = comparr[0];
		} else {
			if(comparr[0] < comparr[1]) {
				min = comparr[0];
				max = comparr[1];
			}else {
				min = comparr[1];
				max = comparr[0];
			}

			for (int i = 2; i < comparr.length; i++) {
				if (comparr[i] > max) {
					max = comparr[i];
				} else if (comparr[i] < min) {
					min = comparr[i];
				}

			}
		}

		System.out.println("Maximum Element is : " + max);
		System.out.println("Minimum Element is : " + min);

	}

	public static void main(String[] args) {
		Min_Max_Array myobj = new Min_Max_Array();
		myobj.arr = new int[] {91, 1, 88, 4 };
		int l = 4;
		myobj.getMinMax(myobj.arr, l);

	}

}
