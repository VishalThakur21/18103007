import java.util.Scanner;
public class Compare {
  public static void main(String[] args) {
    
        String str1=null;
        String str2=null;
        
        Scanner SC=new Scanner(System.in);
        
        System.out.print("Enter string1: ");
        str1=SC.nextLine();

        System.out.print("Enter string2: ");
        str2=SC.nextLine(); 
    
    System.out.print("\nCompairing firstString ("+str1+") to the secondString ("+str2+") returns: ");
    System.out.println(compareString(str1, str2));
    
    
  }
  
  
  public static int compareString(String str, String argumentString) {
    
    int lim= Math.min(str.length(), argumentString.length());
    
    int k=0;
    while(k<lim) {
      if(str.charAt(k)!= argumentString.charAt(k)) {
        return (int) str.charAt(k)- argumentString.charAt(k);
      }
      k++;
    }
    return str.length() - argumentString.length();
  }
}