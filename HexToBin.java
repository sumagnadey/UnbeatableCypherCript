class HexToBin{
   public static String hexToBin(String plainText) 
        { 
            String binary = ""; 
            Long num; 
            String binary4B; 
            int n = plainText.length(); 
            for (int i = 0; i < n; i++) { 
    
                num = Long.parseUnsignedLong( 
                    plainText.charAt(i) + "", 16); 
                binary4B = Long.toBinaryString(num); 
    
                // each value in hexadecimal is 4 bits in binary. 
                binary4B = "0000" + binary4B; 
    
                binary4B = binary4B.substring(binary4B.length() - 4); 
                binary += binary4B; 
            } 
            return binary.toUpperCase(); 
        } 
    }