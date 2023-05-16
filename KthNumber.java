package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KthNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//원본 배열 만들기
		System.out.print("array 배열 원소의 갯수: ");
		int [] array = new int[sc.nextInt()];
		for(int i=0; i<array.length; i++) {
			System.out.print("배열 원소 입력: ");
			array[i] = sc.nextInt();
		}
		
		//구할 k번째 수의 갯수
		System.out.print("구할 k번째 수의 갯수: ");
		int cnt = sc.nextInt();
		int[][] commands = new int[cnt][];
		for(int idx=0; idx<cnt; idx++) {
			System.out.println("명령" + idx+1 + "번");
			int[] temp = new int[3];
			System.out.print("i번째 부터 : ");
			temp[0] = sc.nextInt();
			System.out.print("j번째 까지 : ");
			temp[1] = sc.nextInt();
			System.out.print("k번째 수 : ");
			temp[2] = sc.nextInt();
			commands[idx] = temp;
		}
		
		System.out.println(String.valueOf(solution(array, commands)));

	}
	
	public static int[] solution(int[] array, int[][]cmd) {
		int[] answer = new int[cmd.length];
		
		int cnt = 0;
		for (int[]row : cmd){
			int[] temp = Arrays.copyOfRange(array, row[0]-1, row[1]);
			Arrays.sort(temp);
			answer[cnt] = temp[row[2]-1];
			cnt++;
		}
		
		return answer;
	}

}
