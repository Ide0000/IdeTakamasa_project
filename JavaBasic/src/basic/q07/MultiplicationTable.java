package basic.q07;

public class MultiplicationTable {
	public static void main(String[] args) {
		// 1から9までの掛け算表を表示するための二重ループ
		for (int i = 1; i <= 9; i++) { // 行（1～9）
			for (int j = 1; j <= 9; j++) { // 列（1～9）
				// 掛け算結果を表示
				System.out.print(i * j + "\t"); // タブで区切って表示
			}
			System.out.println(); // 一行が終わったら改行
		}
	}
}
