package codingTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ponketmon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("박사님의 폰켓몬 갯수: ");
		int cnt = sc.nextInt();
		int[] ponketmon = new int[cnt];
		for(int i=0; i<sc.nextInt(); i++) {
			System.out.print("폰켓몬 입력: ");
			ponketmon[i] = sc.nextInt();
		}
		
		System.out.println(get_ponketmon(ponketmon));
	}
	public static int get_ponketmon(int[] poketmon) {
		Set<Integer> setPoketmon = new HashSet<>();
		for(int e : poketmon) {
			setPoketmon.add(e);
		}
		if(setPoketmon.size() >= (poketmon.length/2)){
			return poketmon.length /2;
		}
		else {
			return setPoketmon.size();
		}
	}

}
