package day02;
// �Ҵ翬����

// �Ҵ� �����ڴ� �������� ���� ���� ������ ������ �� ���Ǵ� �������̴�.
// =, +=, -= -, *=, /=, %=, ++, -- �� �����Ѵ�.

public class Ex02Operator02 {
	public static void main(String[] args) {
		// int ���� number ����
		int number;
		
		// number�� 20�� �����ض�
		number = 20;
		System.out.println("number ���� ��: " + number);
		
		// +=
		// +=�� ���� ������ ���� ���� ������ ���� ���� �������
		// �ٽ� ���� ������ �����ϴ� �������̴�.
		
		// number�� ���� ���� 5�� ���� ������� �ٽ� number�� �����ض�
		number += 5;
		System.out.println("number ���� ��: " + number);
		
		// -=
		// -=�� ���� ������ ���� ���� ������ ���� �� �������
		// �ٽ� ���� ������ �����ϴ� �������̴�.
		
		// number�� ���� ���� 6�� �� ������� �ٽ� number�� �����ض�
		number -=6;
		System.out.println("number ���� ��: " + number);
		
		// *=
		// *=�� ���� ������ ���� ���� ������ ���� ���� �������
		// �ٽ� ���� ������ �����ϴ� �������̴�.
		
		// number�� ���� ���� 4�� ���� ������� �ٽ� number�� �����ض�
		number *= 4;
		System.out.println("number ���� ��: " + number);
		
		// /=
		// /=�� ���� ������ ���� ���� ������ ���� ���� ����
		// �ٽ� ���� ������ �����ϴ� �������̴�.
		
		// number�� ���� ���� 3�� ���� ���� �ٽ� number�� �����ض�
		number /= 3;
		System.out.println("number ���� ��: " + number);
		
		// %=
		// %=�� ���� ������ ���� ���� ������ ���� ���� �������� 
		// �ٽ� ���� ������ �����ϴ� �������̴�.
		
		// number�� ���� ���� 6�� ���� �������� �ٽ� number�� �����ض�
		number %= 6;
		System.out.println("number ���� ��: " + number);
		
		// ++, --
		// ++�� --�� �� Ư���� �����ڷν�,
		// Ư�� ������ ���� ��Ȯ�� 1�� ��ȭ��Ų��.
		// ++�� �ش� ������ ���� 1 ������Ű��
		// --�� 1 ���ҽ�Ų��.
		
		// ��, �տ� �ٳ� �ڿ� �ٳĿ� ����
		// ����Ǵ� ������ �ٲ�� �ȴ�.
		System.out.println("++number: " + ++number);
		System.out.println("number�� ���� ��: " + number);
		// ++Ȥ�� --�� ������ �տ� ���� ������
		// ���� ����(����)�����ڶ�� �ϸ�
		// �ش� �ٿ��� ���� ���� ����Ǵ� �ڵ� �׷쿡 ���ϰ� �ȴ�.
		// �� ���� System.out.println("++number: " + ++number)�� ���
		// 1. ++number�� ����Ǽ� number�� ���簪�� 1���� 2�� ����
		// 2. "++number: " �̶�� String �� �ڿ� number�� ���� ���� ����Ǽ�
		// "++number: 2" �� �������
		// 3. System.out.println()�� "++number: 2"�� ���.
		
		System.out.println("number++: " + number++);
		System.out.println("number�� ���� ��: " + number);
		// ++, --�� ������ �ڿ� ���� ������
		// ���� ����(����)�����ڶ�� �ϸ�
		// �ش� �ٿ��� ���� �������� ����Ǵ� �ڵ� �׷쿡 ���ϰ� �ȴ�.
		// �� ���� System.out.println("number++: " + number++)�� ���
		// 1. "number++: "�̶�� String �� �ڿ� number�� ���� ���� ����Ǽ�
		// "number++: 2" �� �������
		// 2. System.out.println()�� "number++: 2"�� ���.
		// 3. number++�� ����Ǽ� number�� ���� ���� 2���� 3���� 1 �����ȴ�.
				
		
	}

}