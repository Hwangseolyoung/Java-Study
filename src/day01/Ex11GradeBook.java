package day01;

// 여러분들이 직접 변수를 만들어서 
// 다음과 같이 출력되게 프로그램을 작성해보세요
// 결과))))
// 이름
// 김철수
// 번호
// 13
// 국어
// 80
// 영어
// 80
// 수학
// 81
// 총점
// 241
// 평균
// 80.3
// 재학중
// true
public class Ex11GradeBook {
	public static void main(String[] args) {
		// 1. 변수의 선언과 값 저장
		// 이름
		String name = "김철수";

		// 번호
		int bunho = 13;

		// 국어
		int korean = 80;

		// 영어
		int english = 80;

		// 수학
		int math = 81;

		// 총점
		int sum = 241;

		// 평균
		double average = 80.3;

		// 재학중
		boolean register = true;

		// 2. 출력
		// 이름 출력
		System.out.println("이름");
		System.out.println(name);

		// 번호 출력
		System.out.println("번호");
		System.out.println(bunho);

		// 국어 출력
		System.out.println("국어");
		System.out.println(korean);

		// 영어 출력
		System.out.println("영어");
		System.out.println(english);

		// 수학 출력
		System.out.println("수학");
		System.out.println(math);

		// 총점 출력
		System.out.println("총점");
		System.out.println(sum);

		// 평균 출력
		System.out.println("평균");
		System.out.println(average);

		// 재학중 출력
		System.out.println("재학중");
		System.out.println(register);
	}
}
