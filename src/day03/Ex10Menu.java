package day03;

// 무한 반복문을 사용하여 프로그램 메뉴화면 만들어보기

import java.util.Scanner;

public class Ex10Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 1번 기능 실행 2. 2번 기능 실행 3. 3번 기능 실행 4. 종료");
			System.out.println("> ");
			int userChoice = scanner.nextInt();
			
			if (userChoice == 1) {
				System.out.println("1번 기능 코드 실행");
			} else if (userChoice == 2) {
				System.out.println("3번 기능 코드 실행");			
			} else if (userChoice == 3) {
				System.out.println("3번 기능 코드 실행");	
			} else if (userChoice == 4) {
				// break 키워드는 반복문 혹은 switch 조건문의 코드 블락을
				// 곧장 종료시키는 키워드이다.
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}
	}
}
