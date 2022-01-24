package day03;
// 프로그래밍에서 2개의 변수 값을 교환하기
public class Ex08Swap {
	public static void main(String[] args) {
		// int number1, number2 선언
		int number1, number2;
		// number1에 20 저장
		number = 20;
		// number2에 50 저장
		number2 = 50;
		
		// number1의 값을 임시로 보관할 int 변수 temp
		int temp;
		
		// number1의 현재 값을 temp에 저장
		temp = number1;
		
		// number1에 number2의 현재 값 저장
		number1 = number2;
		
		// number2에 temp의 현재값 저장
		number2 = temp;
		
		// number1과 number2 출력
		System.out.println(number1);
		System.out.println(number2);
		
	}

}
