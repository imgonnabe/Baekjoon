package _1week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Ex2309Solution {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[9];// 입력받을 배열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
 
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    a = arr[i];
                    b = arr[j];
                    break;
                }
            }
        }
 
        Arrays.sort(arr);
 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a || arr[i] == b) {
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
