class BinToHex{
    public static String binToHex(String plainText) 
    { 
  
        long num = Long.parseUnsignedLong(plainText, 2); 
        String hexa = Long.toHexString(num); 
        while (hexa.length() < (plainText.length() / 4)) 
            hexa = "0" + hexa; 
  
        return hexa.toUpperCase(); 
    }
}