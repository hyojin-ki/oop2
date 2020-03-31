package quiz;

import java.util.Scanner;


public class OXquiz {
	
	public static void main(String[] args) {
		
		// 한줄의 String이 입력으로 주어진다고 가정하면 각 위치마다 비교 가능
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.next();
		int score = 0;
		int combo = 0;
		
		for(int i=0; i<inputStr.length();i++) {
			if(inputStr.charAt(i)=='O') {
				
				if(combo != 0) {
					combo++;
					score += combo;
				}else {
					score++;
					combo++;
				}
			}else {
				combo = 0;
			}			
		}
		
		System.out.println("score = "+score);
		
		//만약 입력이 Sting[]이라고 한다면 아래와 같이 작성 할 수 있다.
		String[] str1 = {"O", "O", "X", "X", "O", "X", "X", "O", "O", "O"};
		String[] str2 = {"O", "O", "X", "X", "O", "O", "X", "X", "O", "O"};
		String[] str3 = {"O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X"};
		String[] str4 = {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"};
		String[] str5 = {"O", "O", "O", "O", "X", "O", "O", "O", "O", "X", "O", "O", "O", "O", "X"};
		
		int score2 = 0;
		int combo2 =0;
		
		for(int i=0; i<str2.length;i++) {
			if(str2[i].equals("O")) {
				if(combo2 != 0) {
					combo2++;
					score2 += combo2;
				}else {
					combo2++;
					score2++;
				}
				
			}else {
				combo2 = 0;
			}
		}
		
		System.out.println("score="+score2);
		
		
		
	}
}
