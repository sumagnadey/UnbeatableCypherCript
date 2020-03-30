import java.util.*;

public class UnbeatableCipherCrypt{
    private String k;
    private String[] P;
    private String[][] S;
    private String password;
    UnbeatableCipherCrypt(String pass) {
        this(pass, "aabb09182736ccdd");
    }
    UnbeatableCipherCrypt(String pass, String k){
        this.S = DataRet.S;
        this.P = DataRet.P;
        this.password = pass;
        this.k = k;
        keyGen();
    }

    private void keyGen() {
        int j = 0;
        for(int i = 0; i < P.length; i++) {
            P[i] =XorOfHexStr.xorHex(P[i], k.substring(j, j + 8));
            System.out.println(P[i]);
            j = (j + 8) % k.length();
        }
    }
    private String f(String left) {
        int s1 = HexToDec.hex2decimal(left.substring(0, 2));
        int s2 = HexToDec.hex2decimal(left.substring(2, 4));
        int s3 = HexToDec.hex2decimal(left.substring(4, 6));
        int s4 = HexToDec.hex2decimal(left.substring(6, 8));

        int res1 = (HexToDec.hex2decimal(S[0][s1]) + HexToDec.hex2decimal((S[1][s2])));
        int res2 = (HexToDec.hex2decimal(S[2][s3]) ^ res1);
        int res = (HexToDec.hex2decimal(S[3][s4]) + res2);

        return Integer.toHexString(res);
    }

    private void round(String left, String right, int i) {
        String xorRight = XorOfHexStr.xorHex(left, P[i]);
        String intermidiateF = f(xorRight);
        String xorLeft = XorOfHexStr.xorHex(intermidiateF, right);
        password = xorRight + xorLeft;
    }
    public String encrypt() {
        for(int i = 0; i < 16; i++) {
            String binPass = HexToBin.hexToBin(StringToHexStr.strToHexStr(password));
            String left = binPass.substring(0, 32);
            String right = binPass.substring(32, 64);
            round(BinToHex.binToHex(left), BinToHex.binToHex(right), i);
        }
        String left = password.substring(0, 4);
        String right = password.substring(4, 8);
        String xorRight = Integer.toHexString(HexToDec.hex2decimal(P[17]) ^ HexToDec.hex2decimal(left));
        String xorLeft = Integer.toHexString(HexToDec.hex2decimal(P[16]) ^ HexToDec.hex2decimal(right));
        password = xorLeft + xorRight;
        return password;
    }
    
}