package _641_660;

public class _657_RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {
        int[] numbers = new int[128];
        for (char ch : moves.toCharArray()) {
            numbers[ch]++;
        }
        if (numbers['R'] == numbers['L'] && numbers['U'] == numbers['D']) return true;
        else return false;
    }
}
