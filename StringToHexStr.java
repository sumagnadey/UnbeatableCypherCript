class StringToHexStr{

    private static byte[] strByte(String pass){
        byte[] bytArr = pass.getBytes();
        return bytArr;
    }
    private static String bytHexString(byte[] bytArr){
        StringBuilder str = new StringBuilder();
        for (byte b : bytArr) {
            str.append(Integer.toHexString(b).toUpperCase());
        }
        return str.toString();
    }
    public static String strToHexStr(String pass){
        byte[]bytArr = strByte(pass);
        String hexPass = bytHexString(bytArr);
        return hexPass;
    }
    public static void main(String[] args) {
        String str = "password";
        System.out.println(strToHexStr(str));
        // System.out.println(HexToBin.hexToBin(strToHexStr(str)));
        //HexStrToStr.hexStrtoS("123456abcd132536");
        //System.out.println(HexStrToStr.hexStrtoS(BinToHex.binToHex(HexToBin.hexToBin(strToHexStr(str)))));
    }
}