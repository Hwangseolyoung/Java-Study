package day03;

import java.util.Scanner;

// 사용자로 부터 키와 몸무게를 입력받아서
// BMI 계산해보기
public class Ex07BmiChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 키 입력
		System.out.println("키: ");
		double height = scanner.nextDouble();
		
		while (height > 2.72 || height <= 0) {
			// 잘못된 키이므로 다시 입력받는다.
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("키: ");
			height = scanner.nextDouble();
		}
		
		// 몸무게 입력
		System.out.println("몸무게: ");
		double weight = scanner.nextDouble();
		
		while (weight > 635 || weight <= 0) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("몸무게: ");
			weight = scanner.nextDouble();
		}
		
		// BMI 계산
		double bmi = weight / height / height;
		
		// 결과 출력
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		
	}

}

