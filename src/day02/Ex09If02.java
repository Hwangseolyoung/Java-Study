package day02;

// 1. int 변수 number를 만들고
import java.util.Scanner;

public class Ex09If02 {
	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		int number = 3;
		
		System.out.println("----------1번----------");
		if (number > 10 ) {
			System.out.println("한자리 숫자입니다.");
		}
		System.out.println("-----------------------");
		
		System.out.println("----------2번----------");
		if (number % 2 == 1) {	
			System.out.println("홀수입니다.");
		}
		System.out.println("-----------------------");
		
		System.out.println("----------3번----------");
		if (number % 3 != 0) {
			System.out.println("3의 배수가 아닙니다.");
		}
		System.out.println("-----------------------");
		
		System.out.println("----------4번----------");
		// 1. 사용자로부터 나이를 입력받는다.
		System.out.println("나이를 입력해주세요: ");
		int age = scanner.nextInt();
		// 2. if 조건문을 사용하여 나이가 미성년자, 
		// 즉 19세 미만이면 "미성년자입니다."를 출력한다.
		if (age < 19) {
			System.out.println("미성년자 입니다.");
		}
		
		System.out.println("-----------------------");
		
		System.out.println("----------5번----------");
		// 1. 사용자로부터 숫자를 입력받는다.
		System.out.println("숫자를 입력해주세요.");
		int usernumber = scanner.nextInt();
		
		// 2. if 조건문을 사용하여 사용자가 입력한 숫자가
		// 10보다 크거나 같고 && 99보다 작거나 같다
		// 2가지 조건식이 모두 True가 나오면 
		// "두자리 양의 정수입니다."를 출력한다.
		
		if (number >= 10 && usernumber <= 99) {
			System.out.println("두자리 양의 정수입니다.");
		}
		
		System.out.println("-----------------------");
	}
}
