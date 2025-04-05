package basic.q01;

public class SubtractLoop {
	public static void main(String[] args) {
		int num = 100; // 初期値100

		while (num >= 0) { // 0 以上の間、ループを続ける
			System.out.println(num);
			num -= 1; // 1 減算
		}
	}
}