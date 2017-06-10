import java.util.*;

class alph{
	public static void main (String[] args) {
	  Scanner s=new Scanner(System.in);
	  String str=s.next();
	   char c=str.charAt(0);
	   if((64<c||96<c)&& (c<91||c<123))
	    
	    {
	     System.out.println("IS A ALPHABET"); 
	 }else{
	          System.out.println("not A ALPHABET");}
	} 
	 
}
