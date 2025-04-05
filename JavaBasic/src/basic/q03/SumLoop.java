package basic.q03;

public class SumLoop {
	public static void main(String[] args) {
		int sum = 0; // 総和を格納する変数
		// 1 から 100 までの整数を足し合わせる
		for (int i = 1; i <= 100; i++) {
			sum += i; // i を sum に加算
		}
		// 結果を表示
		System.out.println(sum);

	}
}
