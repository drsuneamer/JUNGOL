package ex0303;

import java.util.Scanner;

public class jungol_564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ans = new int[26];
        while (true) {
            char a = sc.next().charAt(0);
            if (a < 'A' || a > 'Z') break;
            else ans[(char)a - 65]++;
        }

        for (int i = 0; i < 26; i++) {
            if (ans[i] != 0) {
                System.out.println((char)(i + 65) + " : " + ans[i]);
            }
        }
    }
}
