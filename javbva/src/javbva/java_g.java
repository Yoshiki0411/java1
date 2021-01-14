package javbva;

import java.util.Random;
import java.util.Scanner;

public class java_g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//スキャナー処理
		Scanner sc = new Scanner(System.in);
		
		//ランダム処理
		String[] omikujis = {"大吉","中吉","小吉","凶"};
		Random o = new Random();
		String omikuji = omikujis[o.nextInt(4)];
		
		
		//入力枠
		System.out.println("あなたのお名前は？");
		String input_name = sc.nextLine();
		
		//出力
		System.out.println(input_name+"さんの今日のおみくじの結果は・・・"+omikuji+"です。");
		
		
		
		

	}

}
