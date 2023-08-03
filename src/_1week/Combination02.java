package _1week;

public class Combination02 {// 백트래킹
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };// 조합을 만들 배열
		boolean[] visited = new boolean[arr.length];// 조합에 뽑혔는지를 확인하기 위한 배열

		comb1(arr, visited, 0, 1);// 1개 고르기
	}

	static void comb1(int[] arr, boolean[] visited, int start, int r) {// start : 기준
		if (r == 0) {
			print1(arr, visited);
			return;
		} else {
			for (int i = start; i < arr.length; i++) {// start보다 작으면 뽑을 후보에서 제외, start보다 크면 뽑을 후보가 된다.
				visited[i] = true;
				comb1(arr, visited, i + 1, r - 1);
				visited[i] = false;
			}
		}
	}

	static void print1(int[] arr, boolean[] visited) {
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}