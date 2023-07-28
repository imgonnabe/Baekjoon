package dp;

import java.util.Scanner;

public class Ex1463 {
	static int[] dp;// n/2, n-1을 처리하기 싫다면 Integer(참조타입)으로 처리한다. if(dp[n] = null)

	static int min(int n) {
		if (dp[n] == 0 && n != 0 && n != 1) {// n/2, n-1을 처리하기 위해 n이 0,1인 것을 처리해야 한다.
			if (n % 6 == 0) {
				dp[n] = Math.min(min(n - 1), Math.min(min(n / 2), min(n / 3))) + 1;
			} else if (n % 2 == 0) {
				dp[n] = Math.min(min(n / 2), min(n - 1)) + 1;
			} else if (n % 3 == 0) {
				dp[n] = Math.min(min(n / 3), min(n - 1)) + 1;
			} else {
				dp[n] = min(n - 1) + 1;
			}
		}
		return dp[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		dp = new int[n + 1];
		dp[0] = dp[1] = 0;
		System.out.println(min(n));
		sc.close();
	}
}
