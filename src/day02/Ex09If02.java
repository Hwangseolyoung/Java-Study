package day02;

// 1. int ���� number�� �����
import java.util.Scanner;

public class Ex09If02 {
	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		int number = 3;
		
		System.out.println("----------1��----------");
		if (number > 10 ) {
			System.out.println("���ڸ� �����Դϴ�.");
		}
		System.out.println("-----------------------");
		
		System.out.println("----------2��----------");
		if (number % 2 == 1) {	
			System.out.println("Ȧ���Դϴ�.");
		}
		System.out.println("-----------------------");
		
		System.out.println("----------3��----------");
		if (number % 3 != 0) {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		System.out.println("-----------------------");
		
		System.out.println("----------4��----------");
		// 1. ����ڷκ��� ���̸� �Է¹޴´�.
		System.out.println("���̸� �Է����ּ���: ");
		int age = scanner.nextInt();
		// 2. if ���ǹ��� ����Ͽ� ���̰� �̼�����, 
		// �� 19�� �̸��̸� "�̼������Դϴ�."�� ����Ѵ�.
		if (age < 19) {
			System.out.println("�̼����� �Դϴ�.");
		}
		
		System.out.println("-----------------------");
		
		System.out.println("----------5��----------");
		// 1. ����ڷκ��� ���ڸ� �Է¹޴´�.
		System.out.println("���ڸ� �Է����ּ���.");
		int usernumber = scanner.nextInt();
		
		// 2. if ���ǹ��� ����Ͽ� ����ڰ� �Է��� ���ڰ�
		// 10���� ũ�ų� ���� && 99���� �۰ų� ����
		// 2���� ���ǽ��� ��� True�� ������ 
		// "���ڸ� ���� �����Դϴ�."�� ����Ѵ�.
		
		if (number >= 10 && usernumber <= 99) {
			System.out.println("���ڸ� ���� �����Դϴ�.");
		}
		
		System.out.println("-----------------------");
	}
}
