package day02;
// 사용자로 부터

import java.util.Scanner;

public class Ex07GradeBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("번호: ");
		int bunho = scanner.nextInt();

		System.out.print("이름: ");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.print("국어: ");
		int korean = scanner.nextInt();

		System.out.print("영어: ");
		int english = scanner.nextInt();

		System.out.print("수학: ");
		int math = scanner.nextInt();

		int sum = korean + english + math;

		double average = (double) sum / 3;

		System.out.printf("번호: %03d번 이름: %s\n", bunho, name);
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
		System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);

}
}
