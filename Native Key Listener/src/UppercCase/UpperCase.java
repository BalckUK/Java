package UppercCase;

import java.util.Scanner;

public class UpperCase {
	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			String str = "";
		
			//ù��° ���ڰ� �빮��, �ҹ���, ������ �������� ���ϱ�
			System.out.print("������ �Է��ϼ��� : ");
			String str1 = scanner.next();
			char ch = str1.charAt(0);
			
			
			if (Character.isUpperCase(ch) == true) {
				System.out.println("isUpperCase : " + ch);
				str = "�빮��";
			} else if (Character.isLowerCase(ch) == true) {
				System.out.println("isLowerCase : " + ch);
				str = "�ҹ���";
			} else if (Character.isDigit(ch) == true) {
				System.out.println("isDigit : " + ch);
				str = "����";
			} else {
				str = "����� �Է��ϼ���";
			}
			System.out.println("ù��° ���ڰ� " + str + "�Դϴ�.");
			
			
		
	}
}
