package sec05;

import java.util.Scanner;

public class Recur {

	static void recur(int n) {
		if(y == 0)
			return x;
		else
			return gcd(y, x%y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���.");
		int x = stdIn.nextInt();
		
		int result = x * y / gcd(y, x%y);
		
		System.out.println("�ּ� ������� : " +result+"�Դϴ�");
	}

}
