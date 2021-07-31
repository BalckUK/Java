package UppercCase;

import java.util.Scanner;

public class UpperCase {
	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			String str = "";
		
			//첫번째 글자가 대문자, 소문자, 숫자중 무엇인지 구하기
			System.out.print("문장을 입력하세요 : ");
			String str1 = scanner.next();
			char ch = str1.charAt(0);
			
			
			if (Character.isUpperCase(ch) == true) {
				System.out.println("isUpperCase : " + ch);
				str = "대문자";
			} else if (Character.isLowerCase(ch) == true) {
				System.out.println("isLowerCase : " + ch);
				str = "소문자";
			} else if (Character.isDigit(ch) == true) {
				System.out.println("isDigit : " + ch);
				str = "숫자";
			} else {
				str = "제대로 입력하세요";
			}
			System.out.println("첫번째 글자가 " + str + "입니다.");
			
			
		
	}
}
