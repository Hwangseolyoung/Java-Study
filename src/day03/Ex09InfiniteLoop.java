package day03;
// 무한 반복문(Infinite Loop)

// 무한 반복문은 반복 여부를 결정하는 조건식이 
// 항상 true가 나와서 
// 반복문 자체가 종료되지 않고 영원히 반복되는 것을 
// 무한 반복문이라고 한다.!

// 무한 반복문은 for 반복문으로도 만들 수 있고
// while 반복문으로도 만들 수 있지만
// 비교적 만들기 쉬운 while 반복문으로 무한 반복문을 만드는 
// 3가지 방법을 알아보자

public class Ex09InfiniteLoop {
	public static void main(String[] args) {
		// 무한 반복문 1번/
		// 조건식이 true가 나왔는데
		// 반복되는 동안 조건식에서 사용된 변수의 값이 변하지 않을 경우
		
		// int 변수 number 선언 및 4로 초기화
		int number = 4;
		
		// number가 0보다 클 동안 "while 반복문!"을 출력한다.
		// while (number > 0 ) {
		
		// 무한 반복문 2번.
		// 항상 결과값이 true가 나오는 조건식을 만들어준다.
		// while ( 0 == 0 ) {
		
		// 무한 반복문 3번.
		// 조건식도 사용하지 않고 true를 그대로 넣어준다.
		while (true) {
			System.out.println("while 반복문!");
		}
		
		// 단, 무한 반복문 이후에 코드가 존재하면 에러가 발생된다.
		// 왜냐하면 무한 반복문은 해당 코드블락이 계속 반복해서 실행되기 때문에
		// 그 코드 블락을 당연히 끝낼 수 없고
		// 따라서 그 이후의 코드는 "Unreachable code" 즉 도달할 수 없는 코드가 되기 때문이다.
		
		// System.out.println("프로그램 종료!");
	}

}
