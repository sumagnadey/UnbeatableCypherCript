import java.math.*;

class XorOfHexStr{
    public static String xorHex(String a, String b){
    //     char[] chars = new char[a.length()];
    //     for (int i = 0; i < chars.length; i++) {
    //         chars[i] = toHex(fromHex(a.charAt(i)) ^ fromHex(b.charAt(i)));
    //     }
    //     return new String(chars);
    // }
    // private static int fromHex(char c) {
    //     if (c >= '0' && c <= '9') {
    //         return c - '0';
    //     }
    //     if (c >= 'A' && c <= 'F') {
    //         return c - 'A' + 10;
    //     }
    //     if (c >= 'a' && c <= 'f') {
    //         return c - 'a' + 10;
    //     }
    //     throw new IllegalArgumentException();
    // }
    
    // private static char toHex(int nybble) {
    //     if (nybble < 0 || nybble > 15) {
    //         throw new IllegalArgumentException();
    //     }
    //     return "0123456789ABCDEF".charAt(nybble);
    // }
    
        BigInteger i1 = new BigInteger(a, 16);
        BigInteger i2 = new BigInteger(b, 16);
        BigInteger res = i1.xor(i2);
        String s3 = res.toString(16);
        return s3;
    }
    // public static void main(String[] args){
    //     System.out.println(xorHex("abcd1", "2314abc"));
    // }
}