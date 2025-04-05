package basic.q05;

public class FizzBuzz {
	public static void main(String[] args) {
		// 1 から 100 までの整数をループ
		for (int i = 1; i <= 100; i++) {
			// 3 と 5 の倍数の場合、"FizzBuzz" を表示
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			// 3 の倍数の場合、"Fizz" を表示
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			// 5 の倍数の場合、"Buzz" を表示
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			// それ以外の場合は、数値は整数で表示
			else {
				System.out.println(i);
			}
		}
	}
}
