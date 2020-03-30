public class HexStrToStr{
    public static String hexStrtoS(String str) {
        String result = new String();
        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i=i+2) {
        String st = ""+charArray[i]+""+charArray[i+1];
        char ch = (char)Integer.parseInt(st, 16);
        result = result + ch;
        }
        return result;
    }
}