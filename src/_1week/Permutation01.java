package _1week;

public class Permutation01 {
	public static void swap(int[] list, int i, int j) {// 자리 바꾸기
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

	public static void print1(int[] arr) {
		for (int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static void permutation(int[] arr, int depth) {
		if (depth == arr.length - 1) {
			print1(arr);
		}

		for (int i = depth; i < arr.length; i++) {
			swap(arr, depth, i);
			permutation(arr, depth + 1);
			swap(arr, depth, i);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3 };
		permutation(arr, 0);
	}
}