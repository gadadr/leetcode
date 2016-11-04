package _001_020;

public class OJ_012_IntegerToRoman {
	public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 999) {
            sb.append('M');
            num-=1000;
        }
        if (num > 899) {
            sb.append("CM");
            num-=900;
        }
        if (num > 499) {
            sb.append("D");
            num-=500;
        }
        if (num > 399) {
            sb.append("CD");
            num-=400;
        }
        while (num > 99) {
            sb.append('C');
            num-=100;
        }
        if (num > 89) {
            sb.append("XC");
            num-=90;
        }
        if (num > 49) {
            sb.append("L");
            num-=50;
        }
        if (num > 39) {
            sb.append("XL");
            num-=40;
        }
        while (num > 9) {
            sb.append('X');
            num-=10;
        }
        if (num == 9) {
            sb.append("IX");
            num-=9;
        }
        if (num > 4) {
            sb.append("V");
            num-=5;
        }
        if (num == 4) {
            sb.append("IV");
            num-=4;
        }
        while (num > 0) {
            sb.append('I');
            num-=1;
        }
        return sb.toString();
    }
}
