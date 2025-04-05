package basic.q08;

import java.util.Scanner;

public class InputProduct {
	public static void main(String[] args) {
		// Scanneの作成
		Scanner scanner = new Scanner(System.in);
		// 商品名を入力
		System.out.println("商品名を入力してください：");
		// 商品名の入力を取得
		String productname = scanner.nextLine();
		// 価格を入力
		System.out.println("価格を入力してください：");
		// 価格の入力を取得
		int price = scanner.nextInt();
		System.out.println("商品名は" + productname + "です。価格は" + price + "円です。");
		scanner.close();
	}

}