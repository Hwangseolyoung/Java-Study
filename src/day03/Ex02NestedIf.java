package day03;
// 중첩 if문

// 한개의 if문 block 안에
// 새로운 if문이 또 들어가는 형태가 된다. 

// int 변수 number가 양의 정수이면
// "양의 정수입니다."가 출력되고, 그 외에는 "양의 정수가 아닙니다."가 출력되는 프로그램.
// 단, number가 한자리 양의 정수이면 위의 메세지에 추가로 "한자리 양의 정수 입니다."가 출력된다.

public class Ex02NestedIf {
	public static void mian(String[] args) {
		int number = -61;
		
		if (number > 0) {
			System.out.println("양의 정수입니다.");
			
			if (number < 10) {
				System.out.println("한자리 양의 정수입니다.");
			}
			
		} else {
			System.out.println("양의 정수가 아닙니다.");
		}
	}

}
