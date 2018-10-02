package CHALLENGE_31_EASY_BASE26_LETTERS_OPERATION;

/**
CSGHJ × CBA = FNEUZJA.
 */
public class Klasa {
public static String toAlphabeticRadix(int num) {
    char[] str = Integer.toString(num, 26).toCharArray();
    
    for (int i = 0; i < str.length; i++)
    {
        str[i] += str[i] > '9' ? 10 : 49;
        
       
    }
    return new String(str);
}
public static void main (String[] args)
{   
     int z = fromBase26("ABCD");
    System.out.println(z);
    int sum = fromBase26("CSGHJ") * fromBase26("CBA");
    String sum2 = toAlphabeticRadix(sum);
    System.out.println(sum);
    System.out.println(sum2);

   
}
public static int fromBase26(String number) {
    int s = 0;
    if (number != null && number.length() > 0)
    {
        s = (number.charAt(0) - 'A');
        for (int i = 1; i < number.length(); i++)
        {
            s *= 26;
            s += (number.charAt(i) - 'A');
            
        }
        
    }
    return s;
}
}







