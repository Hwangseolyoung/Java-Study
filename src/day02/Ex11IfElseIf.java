package day02;
// if - else if ����

// ����, �츮�� �̾Ƴ����� ����� True / False �ΰ����� �����ϴ� ���� �ƴ϶�
// 1�� ���� üũ -> 2�� ���� üũ -> 3�� ���� üũ...
// �̷� ������ �پ��� ����� ó���ؾ��� ���
// �츮�� if - else if ������ ����ؾ� �Ѵ�. 

// if - else if�� ������ ���� ������ ������. 
// if( ���ǽ� 1 ) {
//  ���ǽ� 1�� ���϶� ������ �ڵ�
// } else if ( ���ǽ� 2) {
//   ���ǽ�1�� False�� ���԰�
//   ���ǽ�2�� True�� �������� ������ �ڵ�
//
// } else if( ���ǽ� 3 ) {
//   ���ǽ�1, ���ǽ�2�� Fales�� ���԰�
//   ���ǽ�3dl True�� �������� ������ �ڵ�
// } else {
//   ���� ��� ���ǽ��� False�� ������ �� ������ �ڵ�
// }

public class Ex11IfElseIf {
	public static void main(String[] args) {
		
		int age = 3;
		
		if (age <= 5) {
			System.out.println("�����Դϴ�.");
		} else if (age <= 13) {
			System.out.println("����Դϴ�.");
		} else if (age <= 18) {
			System.out.println("û�ҳ��Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
	}

}
