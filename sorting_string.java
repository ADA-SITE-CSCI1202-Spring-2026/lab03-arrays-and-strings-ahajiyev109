package week05;

import java.util.Scanner;
import java.util.Arrays;

public class sorting_string {
   public static String sort_s(String s){
      char[] arr = s.toCharArray();
      Arrays.sort(arr);
      return new String(arr);
   }
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      System.out.println(sort_s(s));
   }
}
