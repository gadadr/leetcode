package _521_540;

public class _537_ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        String[] aC = a.split("\\+");
        String[] bC = b.split("\\+");

        int a1 = Integer.valueOf(aC[0]);
        int a2 = Integer.valueOf(aC[1].substring(0, aC[1].length()-1));
        int b1 = Integer.valueOf(bC[0]);
        int b2 = Integer.valueOf(bC[1].substring(0, bC[1].length()-1));

        int p1 = (a1 * b1) - (a2 * b2);
        int p2 = (a1 * b2) + (a2 * b1);

        return p1 + "+" + p2 + "i";
    }
}
