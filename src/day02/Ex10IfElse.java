package day02;
// if-else ����

// if-else ����������
// if ���ǽ��� True�� ������
// if ���ǽĿ� ����� �ڵ� ����� ����ǰ�
// False�� ������
// else�� ����� �ڵ� ����� ����ȴ�. 

// �⺻���� if-else ������ ������ ���� �����. 

// if(���ǽ�) {
//      ���ǽ��� ���϶� ������ �ڵ�
// } else {
//      ���ǽ��� �����϶� ������ �ڵ�
// }

public class Ex10IfElse {
	public static void main(String[] args) {
		// int ���� number ���� �� 5 ����
		int number = -5;
		
		// int  - else ������ ����Ͽ�
		// number�� 0 �̻��̸� "�ڿ����Դϴ�." �� ��µǰ�
		// �� �ܴ� "���� �����Դϴ�." �� ��µǰ� �ڵ带 �ۼ��ϼ���
		if (number >= 0) {
			System.out.println("�ڿ����Դϴ�.");
		} else {
			System.out.println("���� �����Դϴ�.");
		}
	}

}
