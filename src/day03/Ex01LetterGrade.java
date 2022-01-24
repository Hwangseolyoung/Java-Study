package day03;
// 사용자로부터 점수를 입력받아서 등급을 알려주자

import java.util.Scanner;

public class Ex01LetterGrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		int score = scanner.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
