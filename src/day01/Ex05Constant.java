package day01;
// 상수(Constant)

// 프로그래밍에서의 상수는 
// 변수처럼 값을 저장할 수 있는 공간을 뜻하지만
// 변수와는 다르게 한번 값이 저장이되면(=초기화가 되면) 
// 더이상 값을 변경할 수 없는 공간을 상수라고 한다.

// 상수의 선언방법
// final 데이터타입 상수이름

public class Ex05Constant {
	public static void main(String[] args) {
		// int 상수 NUMBER 선언
		final int NUMBER;

		// NUMBER에 15 저장
		NUMBER = 15;

		// NUMBER의 현재 값 출력
		System.out.println("NUMBER의 현재 값");
		System.out.println(NUMBER);

		// 이미 15라는 값이 저장되어 있는 상수공간이므로
		// 더이상 새로운 값을 저장할 수 없다!
		// NUMBER = 30;
		// NUMBER = 15;
	}
}
