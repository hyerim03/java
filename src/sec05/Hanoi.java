package sec05;

import java.util.Scanner;

public class Hanoi {
	
	//no개의 원반을 x번 기둥에서 y번 기둥으로 옮긴다
	//no는 옮겨야 할 원반의 개수
	//x는 시작 기둥의 번호
	//y는 목표 기둥의 번호
	static void move(int no, int x, int y) {
		//바닥의 원반을 제외한 그룹(원반[1] ~ 원반[no-1])을
		//시작 기둥에서 중간 기둥으로 옮긴다.
		if(no >1)
			move(no-1, x, 6-x-y);
		
		System.out.printf("원반 [%d]를 %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);
		
		//바닥의 원반을 제외한 그룹(원반[1] ~ 원반 [no-1])을 중간 기둥에서 목표기둥으로 옮긴다
		if(no >1)
			move(no-1, 6-x-y, y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.println("원반의 개수");
		int n = stdIn.nextInt();
		
		//제 1 기둥에 쌓인 n개의 원반을 제 3기둥으로 옮김
		move(n, 1, 3);
		

	}

}
