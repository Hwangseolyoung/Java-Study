package day03;
// while 반복문

// while 반복문은
// 특정 조건식이 true가 나오면 코드를 실행시키고
// 다시 조건식을 체크해서 true면 실행, false면 종료의 구조를 가진다.

// while 반복문은 기본적으로 다음 구조를 가진다.
// while(조건식) {
//       조건식이 참일때 실행할 코드
// }

public class Ex05While {
	public static void main(String[] args) {
		// int 변수 number 선언 및 4로 초기화
		int number = 4;
		
		// number가 0보다 클 동안 "while 반복문!"을 출력하고 number를 1 감소시킨다.
		while (number > 0) {
			System.out.println("while 반복문!");
			number--;
		}
	}

}
