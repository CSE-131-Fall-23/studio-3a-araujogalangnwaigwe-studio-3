package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		boolean[] values = new boolean[n];
		Arrays.fill(values, true);
		
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (values[i]) {
				for (int j = i * i; j < n; j += i) {
					values[j] = false;
				}
			}
		}
		
		for (int i = 2; i < n; i++) {
			if (values[i]) {
				System.out.println(i);
			}
		}
	}

}
