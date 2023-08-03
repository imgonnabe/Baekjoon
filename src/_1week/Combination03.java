package _1week;

public class Combination03 {
	public static void main(String[] args) {// 재귀함수
		int[] arr = { 1, 2, 3 };// 조합을 만들 배열
		boolean[] visited = new boolean[arr.length];// 조합에 뽑혔는지를 확인하기 위한 배열

		comb2(arr, visited, 0, 1);// 1개 고르기
	}

	static void comb2(int[] arr, boolean[] visited, int depth, int r) {// depth는 현재 인덱스
		if (r == 0) {
			print1(arr, visited);
			return;// 빠져나옴
		}
		
		if (depth == arr.length) {
			return;
		} else {
			visited[depth] = true;
			comb2(arr, visited, depth + 1, r - 1);

			visited[depth] = false;
			comb2(arr, visited, depth + 1, r);
		}
	}

	static void print1(int[] arr, boolean[] visited) {
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}