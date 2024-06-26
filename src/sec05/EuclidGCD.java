package sec05;

import java.util.Scanner;

public class EuclidGCD {
	//최대 공약수를 구하여 반환
	static int gcd(int x, int y) {
		if(y == 0) 
			return x;
		else
			return gcd(y, x%y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 정수의 최대 공약수를 구합니다.");
		int x = stdIn.nextInt();
		System.out.print("정수를 입력하세요.");
		int y = stdIn.nextInt();
		
		System.out.println("최대 공약수는 : " + gcd(x, y)+"입니다");
	}

}
