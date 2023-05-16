package codingTest;

import java.util.Scanner;

public class Babbling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("말할 것 같은 발음의 개수: ");

		String[] babbling = new String[sc.nextInt()];

		for (int i = 0; i < babbling.length; i++) {
			System.out.print("발음 입력 (영어로): ");
			babbling[i] = sc.next();
		}
		System.out.println("실제 발음 수: " + solution(babbling));

	}

	public static int solution(String[] babblings) {
		String[] words = {"aya", "ye", "woo", "ma"};
		int answer = 0;

		for(int i=0; i<babblings.length; i++) {
			babblings[i] = babblings[i].replaceFirst("aya", "X");
			babblings[i] = babblings[i].replaceFirst("ye", "X");
			babblings[i] = babblings[i].replaceFirst("woo", "X");
			babblings[i] = babblings[i].replaceFirst("ma", "X");
			System.out.println("결과: " + babblings[i]);
			if (babblings[i].equals("X".repeat(babblings[i].length()))) {
				answer++;
			}
		}
		return answer;
	}
}
