package day02;
// if - else if 구조

// 만약, 우리가 뽑아내야할 결과가 True / False 두가지만 존재하는 것이 아니라
// 1번 조건 체크 -> 2번 조건 체크 -> 3번 조건 체크...
// 이런 식으로 다양한 결과를 처리해야할 경우
// 우리는 if - else if 구조를 사용해야 한다. 

// if - else if는 다음과 같은 구조를 가진다. 
// if( 조건식 1 ) {
//  조건식 1이 참일때 실행할 코드
// } else if ( 조건식 2) {
//   조건식1이 False가 나왔고
//   조건식2가 True가 나왔을때 실행할 코드
//
// } else if( 조건식 3 ) {
//   조건식1, 조건식2가 Fales로 나왔고
//   조건식3dl True가 나왔을때 실행할 코드
// } else {
//   위의 모든 조건식이 False가 나왔을 때 실행할 코드
// }

public class Ex11IfElseIf {
	public static void main(String[] args) {
		
		int age = 3;
		
		if (age <= 5) {
			System.out.println("유아입니다.");
		} else if (age <= 13) {
			System.out.println("어린이입니다.");
		} else if (age <= 18) {
			System.out.println("청소년입니다.");
		} else {
			System.out.println("성인입니다.");
		}
	}

}
