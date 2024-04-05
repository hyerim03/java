package sec05;

import java.util.Scanner;

public class FactorialEx {

	static int factorial(int n) {
		int result = 1;
		for(int i = n; i >0; i--) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		int x = stdIn.nextInt();
		
		System.out.println(x+"의 팩토리얼은"+factorial(x));
	}

}
