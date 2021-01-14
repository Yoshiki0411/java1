package javbva;

import java.util.Random;
import java.util.Scanner;

public class java_jankenn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] hands = {0 , 1 , 2};
	    Random r = new Random();
	    int  hand =   hands[r.nextInt(3)];
	    
		System.out.println("ジャンケンゲームが始まるよ！");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("名前を入力してください！！");
		String input_text = sc.nextLine();
		System.out.println(input_text + "さんですね！");
		System.out.println("では、ジャンケンをやってみよう！");
		
		Scanner number = new Scanner(System.in);  //　input_number =　ユーザー（ジャンケンんの手）
		System.out.println("半角でグーなら「０」、チョキなら「１」、パーなら「２」を入力してください！");
		System.out.println("ジャンケンポン");
		int input_number =  number.nextInt();
		
	    String [] lsp = {"グー","チョキ","パー"};
	    System.out.println("僕は"+lsp[hand]+"を出したよ");   //　 hand　= 相手の手
	    
	    int x =input_number;
		//勝ちの場合
		if (x==0 && hand==1 || x==1 && hand==2 || x==2 && hand==0) {
			System.out.println(input_text+"さんの勝ちです！");	

		//負けの場合
		}else if (x==0 && hand==2 || x==1 && hand==0 || x==2 && hand==1) {
			System.out.println(input_text+"さんの負けです！");
			
		//あいこの場合	
		}else if(x==hand || x==hand || x==hand) {
			System.out.println(input_text+"さん。あいこです");
			
		}
			
	}
}
