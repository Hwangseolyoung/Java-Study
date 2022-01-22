package day02;
// 논리 연산자

// 논리 연산자는 boolean값에 대한 연산을 한다.

// &&: 왼쪽과 오른쪽이 모두 true일 때에만 결과값이 true가 된다.
// ||: 왼쪽과 오른쪽 중 하나라도 true이면 결과값이 true가 된다.
// !: true는 false로 false는 true로 연산한다.

public class Ex04Operator04 {
	public static void main(String[] args) {
		// 1. &&
		System.out.println("1. &&");
		System.out.println("true && true: " + (true && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("false && true: " + (false && true));
		System.out.println("false && false: " + (false && false));

		// 2. ||
		System.out.println("2. ||");
		System.out.println("true || true: " + (true || true));
		System.out.println("true || false: " + (true || false));
		System.out.println("false || true: " + (false || true));
		System.out.println("false || false: " + (false || false));

		// 3. !
		System.out.println("3. !");
		System.out.println("!true: " + (!true));
		System.out.println("!false: " + (!false));
		
		// int 값이 0 이하 10이하 인지 체크하는 코드
		// 우리가 수학에서 배웠던것은?
		// 0 <= x <= 10
		int x = 6;
		// System.out.println("0 <= x <= 10: " + (0 <= x <= 10));
		// 위 코드는 먼저 0 <= x 를 비교하여 boolean의 결과값이 나오게 되는데
		// boolean의 값은 int와 비교할 수 없으므로 에러가 발생한다.
		
		// 즉, 번위의 값을 체크한다고 한다면
		// x가 특정값 보다 크다 그리고 특정값보다 작다가 모두 true가 나올 때에만
		// 결과값이 true가 나오게 논리 연산자를 만들어 주어야 한다.
		System.out.println("0 <= x && x <= 10: " + (0 <= x && x <= 10));
		
	}

}
