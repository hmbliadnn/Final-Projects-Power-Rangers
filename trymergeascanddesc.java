package mergelagi;

import java.util.Scanner;

public class trymergeascanddesc {
	static int n=10;


		public static String MergeSort(int[] num, int i, int j) {

		int low = i;

		int high = j;

		if (low >= high) {

		return "0";

		}

		int middle = (low + high) / 2;

		MergeSort(num, low, middle);

		MergeSort(num, middle + 1, high);

		int end_low = middle;

		int start_high = middle + 1;

		while ((low <= end_low) && (start_high <= high)) {

		if (num[low] < num[start_high]) {

		low++;

		}

		else {

		int Temp = num[start_high];

		for (int k = start_high- 1; k >= low; k--) {

		num[k+1] = num[k];

		}

		num[low] = Temp;

		low ++;

		end_low ++;

		start_high ++;

		}

		}
		String nombor = "Ascending: \n";
		for(int q=0; q<num.length; q++) {
			nombor+=Integer.toString(num[q])+" ";
		}
		nombor += "\n\nDescending: \n";
		for(int w=n-1; w>=0; w--) {
			nombor+=Integer.toString(num[w])+" ";
		}
		return nombor;
		
		}
		
}