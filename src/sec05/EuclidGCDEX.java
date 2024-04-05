package sec05;

import java.util.Scanner;

public class EuclidGCDEX {

	static int gcd(int x, int y) {
		if(y == 0)
			return x;
		else
			return gcd(y, x%y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 정수의 최소 공배수를 구합니다.");
		int x = stdIn.nextInt();
		System.out.print("정수를 입력하세요.");
		int y = stdIn.nextInt();
		
		int result = x * y / gcd(y, x%y);
		
		System.out.println("최소 공배수는 : " +result+"입니다");
	}

}
