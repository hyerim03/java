package sec05;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		if (n > 0)

			return n * factorial(n - 1);
		else
			return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���");
		int x = stdIn.nextInt();
		
		System.out.println(x+"�� ���丮����"+factorial(x));
	}

}
