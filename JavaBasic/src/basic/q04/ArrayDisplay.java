package basic.q04;

public class ArrayDisplay {
	public static void main(String[] args) {
		// 配列を定義し、要素に果物の名前を格納
		String[] fruits = { "りんご", "ばなな", "みかん", "ぶどう", "すいか" };
		// 拡張for文で配列の要素を順番に表示
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
