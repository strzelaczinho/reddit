
package CHALLENGE_39_INTERMEDIATE_KEPLEKAR_NUMBER;


public class Kaprekar{
	public static void main(String[] args){
		for(long i=1;i<1000000;i++){
			                 isKaprekarNum(i);
                                        
		}
	}
     
	public static boolean isKaprekarNum(long num){
		boolean isKaprekar = false;
                
		String sqr = ""+(num*num);
		int length = sqr.length();
		int mid = length/2;
		long tmp1=0,tmp2=0;
		String tmp1Str,tmp2Str;
		for(int i=mid;i>=0;i--){
			tmp1Str = sqr.substring(0,i);
			tmp2Str = sqr.substring(i,length);
			tmp1 = convertStrToLong(tmp1Str);			
			tmp2 = convertStrToLong(tmp2Str);
			if(num == tmp1+tmp2){
				System.out.println(num+"="+tmp1Str+"+"+tmp2Str);
				System.out.println("----------------------");
				isKaprekar =  true;
				break;
			}
		}
		return isKaprekar;
	}
	public static long convertStrToLong(String str){
		long rtrn = 0;
		try{
			rtrn = Long.parseLong(str);
		}catch(NumberFormatException e){
			//hide it under carpet and return 0
		}
		return rtrn;
	}
 
}
