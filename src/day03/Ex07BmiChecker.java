package day03;

import java.util.Scanner;

// ����ڷ� ���� Ű�� �����Ը� �Է¹޾Ƽ�
// BMI ����غ���
public class Ex07BmiChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Ű �Է�
		System.out.println("Ű: ");
		double height = scanner.nextDouble();
		
		while (height > 2.72 || height <= 0) {
			// �߸��� Ű�̹Ƿ� �ٽ� �Է¹޴´�.
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("Ű: ");
			height = scanner.nextDouble();
		}
		
		// ������ �Է�
		System.out.println("������: ");
		double weight = scanner.nextDouble();
		
		while (weight > 635 || weight <= 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("������: ");
			weight = scanner.nextDouble();
		}
		
		// BMI ���
		double bmi = weight / height / height;
		
		// ��� ���
		if (bmi < 18.5) {
			System.out.println("��ü��");
		} else if (bmi < 23) {
			System.out.println("����ü��");
		} else if (bmi < 25) {
			System.out.println("��ü��");
		} else {
			System.out.println("��");
		}
		
	}

}

