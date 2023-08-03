package _1week;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2309 {
	public static void main(String[] args) {
		int[] arr = new int[9];
		boolean[] visit = new boolean[9];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		comb(arr, visit, 0, 7);
	}

	static void comb(int[] arr, boolean[] visit, int start, int r) {
		if (r == 0) {
			if(add(arr, visit) == 100) {
				Arrays.sort(arr);
				for (int i : arr) {
					System.out.print(i + " ");
				} 
			}
			return;
		} else {
			for (int i = start; i < arr.length; i++) {
				visit[i] = true;
				comb(arr, visit, i + 1, r - 1);
				visit[i] = false;
			}
		}
	}

	static int add(int[] arr, boolean[] visit) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (visit[i] == true) {
				sum += arr[i];
			}
		}
		return sum;
	}
}