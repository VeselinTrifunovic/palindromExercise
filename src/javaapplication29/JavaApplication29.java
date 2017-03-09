package javaapplication29;

import java.util.Scanner;

public class JavaApplication29 {

    public static void main(String[] args) {

        String original = "";
        String suprotno = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite originalnu riječ : ");
        original = scan.nextLine().replaceAll(" ", "");

        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            suprotno = suprotno + original.charAt(i);
        }
        if (original.equals(suprotno)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Nije palindrom");
        }
    }

}
