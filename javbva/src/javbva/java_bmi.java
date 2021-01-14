package javbva;

import java.util.Scanner;

public class java_bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//スキャナー処理＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
		Scanner sc_n = new Scanner(System.in);
		Scanner sc_h = new Scanner(System.in);
		Scanner sc_w = new Scanner(System.in);
		
		
		//出力処理＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
		System.out.println("あなたのお名前は？");
		String input_name = sc_n.nextLine();
		
		System.out.println("あなたの身長は？（単位：m）");
		double input_height = sc_h.nextDouble();
		
		System.out.println("あなたの体重は？");
		double input_weight = sc_w.nextDouble();
		
		
		//メソッド関係＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
		profile(input_name , input_height , input_weight);  //基本プロフィール（名前、身長、体重）
		
		double bmi = hw(input_height , input_weight);  //BMI数値
		System.out.println("BMI数値は"+bmi+"です。");
		
		String judgment = j(bmi);  //判定結果
		System.out.println(input_name+"さん。");
		System.out.println("あなたの肥満度は"+judgment+"です。");
		
	}
	//プロフィールメソッド＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
	public static void profile(String name , double height , double weight) {  
		System.out.println(name+"さんの体重は"+height+"mで、体重は"+weight+"キロですね。");	
	}
	
	//BMI計算メソッド＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
	public static double hw(double h , double w) {
		return w / (h * h) ;
	}
	
	//判定メソッド＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
	public static String j(double b) {
		if(b<18.5) {			return "低体重";
		}else if(b>18.5 && b<25) {
			return "普通";
		}else {
			return "肥満";
		}
	}
}
