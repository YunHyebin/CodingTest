package codingTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringOfNumbersAndWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String s = sc.next();
		System.out.println("정답: " + solution(s));
	}
	
	public static int solution(String s) {
		HashMap<String, String> patterns = new HashMap<String, String>();
		patterns.put("zero", "0");
		patterns.put("one", "1");
		patterns.put("two", "2");
		patterns.put("three", "3");
		patterns.put("four", "4");
		patterns.put("five", "5");
		patterns.put("six", "6");
		patterns.put("seven", "7");
		patterns.put("eight", "8");
		patterns.put("nine", "9");
		
		for(Map.Entry<String, String> pair : patterns.entrySet()){
			System.out.println("테스트 키: " + pair.getKey());
			System.out.println("테스트 값: " + pair.getValue());
			s = s.replaceAll(pair.getKey(), pair.getValue());
		}
		return Integer.parseInt(s);
	}

}
