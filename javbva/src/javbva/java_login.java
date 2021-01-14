package javbva;

import java.util.Scanner;

public class java_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner login = new Scanner(System.in); //ログインID
		Scanner sc_next = new Scanner(System.in); //もう一度ログインor新規登録
		String[] next_login = {"もう一度ログイン","新規登録"};
		
		
	
		System.out.println("ログインIDを入力してください> ");
		int input_text =  login.nextInt();   //ログインID = input_text
		
		System.out.println(input_text + "が入力されました");
		
		int id = 12345;
		
		if(id == input_text) {
			System.out.println("ログイン成功");
			
		}else{
			System.out.println("ログインに失敗しました");
			System.out.println(next_login[0]+"する場合は「0」を入力。");
			System.out.println(next_login[1]+"する場合は「1」を入力してください");
			int input_number = sc_next.nextInt();
			System.out.println(input_number+"を入力しました。");
			
			System.out.println(next_login[input_number]+"画面に切替ります。");
			//next_login[input_number]で出力させたい
			
		}

	}

}
