package day03;
// ����(Validation)

import java.util.Scanner;

public class Ex04Validation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����: ");
		int score = scanner.nextInt();
		
		System.out.println("�� ������ �ȵ� ���");
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80 ) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		System.out.println("------------------------\n");
		
		// �� �����ϱ� 1��
		// ���ǽ��� ��Ȯ�ϰ� ���
		
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80 && score <= 89) {
			System.out.println("B");
		} else if (score >= 70 && score <= 79) {
			System.out.println("C");
		} else if (score >= 60 && score <= 69) {
			System.out.println("D");
		} else if (score >= 0 && score <= 59) {
			System.out.println("F");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		// �̷��� ��Ȯ�� ���ǽ����� ����� ���ϴ� �����
		// �ַ� �Է°��� �ùٸ� ������ ���ӵ��� ���� ��� ����� �ȴ�.
		
		System.out.println("------------------------\n");
		
		System.out.println("���� �Է� ���� �ùٸ� ��ü ������ ���ϴ��� üũ�ϱ�");
		
		if (score >= 0 && score <= 100) {
			// �Էµ� ������ �ùٸ� �����̹Ƿ�
			// ����� ����ϴ� if�� ����
			
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80 ) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else if (score >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} else {
			// �Էµ� ������ �ùٸ��� �ʴ� �����̹Ƿ�
			// ��� �޼����� ���
			System.out.println("�߸��� ������ �����Դϴ�.");
		}
		
		System.out.println("------------------------\n");
	}

}
