package day03;

// 사용자로부터 성별, 나이, 신체등급순으로 입력을 받아서
// 신체등급 3이하: 현역
// 신체등급 4: 공익
// 그외: 면제 
// 가 출력되는 프로그램을 작성하시오.
// 단, 성별의 경우 int로 입력을 받아서 1은 남자 2는 여자로 처리합니다.
// 여성의 경우, 추가적인 입력 없이
// "여성에게는 국방의 의무가 부여되지 않습니다" 라는 메시지가 출력되고
// 남성 미성년자의 경우
// "아직 신체등급이 존재하지 않습니다" 라는 메시지가 출력되게 프로그램을 작성하세요.
// 10시 50분까지
import java.util.Scanner;

public class Ex03Army {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 1. 성별을 입력받는다.
		// 1-1. 남성일 경우 나이를 입력받는다.
		// 1-2. 여성일 경우 메시지만 출력해준다.

		// 1-1. 남성일 경우
		// 1-1-1. 성인일 경우, 신체 등급을 입력받는다.
		// 1-1-2. 미성년자일 경우 메시지만 출력해준다.

		// 1-1-1. 남성 성인일 경우
		// 1-1-1-1. 신체등급이 3 이하면 "현역"을 출력해준다.
		// 1-1-1-2. 신체등급이 4면 "공익"을 출력해준다.
		// 1-1-1-3. 신체등급이 그외면 "면제"를 출력해준다.

		// 1. 성별 입력
		System.out.print("성별 (1은 남자 2는 여자): ");
		int gender = scanner.nextInt();

		if (gender == 1) {
			// 남성이므로 나이를 입력 받는다.
			System.out.print("나이: ");
			int age = scanner.nextInt();

			if (age >= 19) {
				// 남성 성인이므로 신체등급을 입력받는다.
				System.out.print("등급: ");
				int category = scanner.nextInt();

				if (category <= 3) {
					System.out.println("현역");
				} else if (category == 4) {
					System.out.println("공익");
				} else {
					System.out.println("면제");
				}

			} else {
				// 남성 미성년자이므로 메시지만 출력
				System.out.println("미성년자에게는 아직 신체등급이 존재하지 않습니다.");

			}

		} else {
			// 여성이므로 메시지만 출력
			System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");

		}

	}
}