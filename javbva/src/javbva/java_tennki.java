package javbva;

import java.util.Random;
import java.util.Scanner;

public class java_tennki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//スキャナー処理
		Scanner sc = new Scanner(System.in);
		
		//ランダム処理
		String[] tennkis = {"晴れ","雨","くもり","雪",};
		Random r = new Random();
		String tennki = tennkis[r.nextInt(4)];
		
		
		//入力枠
		System.out.println("お住まいの地域は？");
		String input_name = sc.nextLine();
		
		//出力
		System.out.println(input_name+"の今日の天気は"+tennki+"です");
		
	}
}
