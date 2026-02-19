package week05;
import java.util.Scanner;
import java.util.Arrays;

public class isAnagram {
   public static String sort_s(String s){
      char[] c = s.toCharArray();
      Arrays.sort(c);
      return new String(c);
   }
   public static Boolean check(String s1, String s2){
      if(sort_s(s1).equals(sort_s(s2))){
         return true;
      }
      return false;
   }
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      if(check(s1, s2) == true){
         System.out.println("YES");
      }
      else{
         System.out.println("NO");
      }
   }
}
