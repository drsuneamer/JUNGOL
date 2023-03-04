package ex0303;

import java.util.Scanner;

public class jungol_561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] arr = sc.nextLine().split(" ");
        int max = 0;
        int min = 10000;

        for (String a : arr) {
            int n = Integer.parseInt(a);
            if (n < 100 && n > max) max = n;
            if (n > 100 && n < min) min = n;
        }

        // 해당하는 수가 없는 경우
        if (max == 0) max = 100;
        if (min == 10000) min = 100;
        System.out.println(max + " " + min);
    }
}
