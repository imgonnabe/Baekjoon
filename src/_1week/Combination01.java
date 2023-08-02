package _1week;

public class Combination01 {// 조합 경우의 수
	public static void main(String[] args) {
		System.out.println(comb(3, 2));
	}

	public static int comb(int n, int r) {
		if (n == r || r == 0) {// 전체 개수가 뽑는 개수와 같을 때는 경우의 수 1, 뽑는 개수가 0이면 경우의 수 1
			return 1;
		} else {
			return comb(n - 1, r - 1) + comb(n - 1, r);
		}
	}
}
