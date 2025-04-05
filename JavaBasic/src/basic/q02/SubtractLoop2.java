package basic.q02;

public class SubtractLoop2 {
	public static void main(String[] args) {
		int num = 100; // 初期値 100
		do {
			System.out.println(num);
			num--; // 1 減算
		} while (num >= 0); // 0 以上の間、繰り返す
	}
}
