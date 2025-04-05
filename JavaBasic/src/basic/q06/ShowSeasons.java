package basic.q06;

public class ShowSeasons {
	public static void main(String[] args) {
		int month = new java.util.Random().nextInt(14);
		switch (month) {
		case 12: // 12月
		case 1: // 1月
		case 2: // 2月
			System.out.println(month + "月は冬です。");
			break;
		case 3: // 3月
		case 4: // 4月
		case 5: // 5月
			System.out.println(month + "月は春です。");
			break;
		case 6: // 6月
		case 7: // 7月
		case 8: // 8月
			System.out.println(month + "月は夏です。");
			break;
		case 9: // 9月
		case 10: // 10月
		case 11: // 11月
			System.out.println(month + "月は秋です。");
			break;
		default:
			System.out.println(month + "月は存在しないです。");
			break;
		}
	}
}