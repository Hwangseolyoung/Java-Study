package day02;
// ����ڷ� ����

import java.util.Scanner;

public class Ex07GradeBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("��ȣ: ");
		int bunho = scanner.nextInt();

		System.out.print("�̸�: ");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.print("����: ");
		int korean = scanner.nextInt();

		System.out.print("����: ");
		int english = scanner.nextInt();

		System.out.print("����: ");
		int math = scanner.nextInt();

		int sum = korean + english + math;

		double average = (double) sum / 3;

		System.out.printf("��ȣ: %03d�� �̸�: %s\n", bunho, name);
		System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n", korean, english, math);
		System.out.printf("����: %03d�� ���: %06.2f��\n", sum, average);

}
}
