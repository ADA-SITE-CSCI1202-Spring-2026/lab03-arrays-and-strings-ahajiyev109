package week05;

import java.util.Scanner;
import java.util.Arrays;

public class MixedStrings{
    public static String change(String s) {
        String[] s_n = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String i : s_n){
            
            if (i.length() > 1){
                char b = i.charAt(0);
                char e = i.charAt(i.length() - 1);
                String mid = i.substring(1, i.length() - 1);
                i = e + mid + b;
            }
            res.append(i).append(" ");
        }
        return res.toString().trim();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(change(s));
    }
}

