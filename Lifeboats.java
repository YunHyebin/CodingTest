package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Lifeboats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("살려야 할 사람들 인원: ");
		int[] people = new int[sc.nextInt()];
		System.out.println("사람들 몸무게 입력: ");
		for(int i=0; i<= people.length; i++) {
			people[i] = sc.nextInt();
		}
		System.out.println("구명보트의 무게 제한: ");
		int limit = sc.nextInt();
		
		System.out.println("필요한 최소 구명보트의 갯수: " + solution(people, limit));
	}
	
	static public int solution(int[] people, int limit) {
		Arrays.sort(people);
		int answer = 0, idxF = 0;
		int idxB = people.length -1;
		while(idxF <= idxB) {
			if(people[idxF] + people[idxB] <= limit) {
				idxF++;
			}
			idxB--;
			answer++;
		}
		return answer;
	}	
}
