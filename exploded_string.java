package week05;

import java.util.Scanner;

public class exploded_string {
   public static String explode(String S){
      StringBuilder sb = new StringBuilder();
      for(int len = 0; len < S.length(); len++){
         for(int i = 0; i <= len; i++){
            sb.append(S.charAt(i));
         }
      }
      return (sb.toString());
   }
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      System.out.println(explode(s));
      
   }
}
