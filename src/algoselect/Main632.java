package algoselect;

import java.util.Scanner;

public class Main632 {
	public static void main(String[] args) {
		// 문자열입력
		// Scanner sc = new Scanner("18 -5 10");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int min = (a < b) ? a : b;
		min = (min < c) ? min : c;

		System.out.println(min);

	}

}
