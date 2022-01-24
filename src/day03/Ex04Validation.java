package day03;
// 검증(Validation)

import java.util.Scanner;

public class Ex04Validation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수: ");
		int score = scanner.nextInt();
		
		System.out.println("값 검증이 안된 결과");
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80 ) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		System.out.println("------------------------\n");
		
		// 값 검증하기 1번
		// 조건식을 정확하게 잡기
		
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80 && score <= 89) {
			System.out.println("B");
		} else if (score >= 70 && score <= 79) {
			System.out.println("C");
		} else if (score >= 60 && score <= 69) {
			System.out.println("D");
		} else if (score >= 0 && score <= 59) {
			System.out.println("F");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		// 이렇게 정확한 조건식으로 결과를 정하는 방법은
		// 주로 입력값의 올바른 범위가 연속되지 않을 경우 사용이 된다.
		
		System.out.println("------------------------\n");
		
		System.out.println("먼저 입력 값이 올바른 전체 범위에 속하는지 체크하기");
		
		if (score >= 0 && score <= 100) {
			// 입력된 점수가 올바른 점수이므로
			// 결과를 출력하는 if문 실행
			
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80 ) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else if (score >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} else {
			// 입력된 점수가 올바르지 않는 점수이므로
			// 경고 메세지만 출력
			System.out.println("잘못된 형태의 점수입니다.");
		}
		
		System.out.println("------------------------\n");
	}

}
