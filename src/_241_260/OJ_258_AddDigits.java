package _241_260;

public class OJ_258_AddDigits {

	public int addDigits(int num) {
		return num % 9 == 0 ? num == 0 ? 0 : 9 : num % 9;
	}
}
