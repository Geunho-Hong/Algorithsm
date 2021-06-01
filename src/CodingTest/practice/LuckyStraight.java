package CodingTest.practice;

import java.util.Scanner;

public class LuckyStraight {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int length = line.length();
        int midLength = line.length() / 2;

        String[] startLine = line.substring(0,midLength).split("");
        String[] endLine = line.substring(midLength,length).split("");

        int startValue = 0;
        int endValue = 0;

        for(String s1 : startLine) {
            startValue += Integer.parseInt(s1);
        }

        for(String s2 : endLine) {
            endValue += Integer.parseInt(s2);
        }

        if(startValue == endValue) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }

        System.out.println("TEST : " +  + ('1' - 48));

    }
}
