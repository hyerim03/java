package sec05;

import java.util.Scanner;

public class EuclidGCD {
	//�ִ� ������� ���Ͽ� ��ȯ
	static int gcd(int x, int y) {
		if(y == 0) 
			return x;
		else
			return gcd(y, x%y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ� ������� ���մϴ�.");
		int x = stdIn.nextInt();
		System.out.print("������ �Է��ϼ���.");
		int y = stdIn.nextInt();
		
		System.out.println("�ִ� ������� : " + gcd(x, y)+"�Դϴ�");
	}

}
