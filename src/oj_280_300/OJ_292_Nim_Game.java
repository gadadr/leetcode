package oj_280_300;

public class OJ_292_Nim_Game {

	public boolean canWinNim(int n) {
        return (n > 3 && n%4 == 0) ? false : true;
    }
}
