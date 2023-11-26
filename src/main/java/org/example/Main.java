package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String str = "abcd";

        StringReverser reverser = new StringReverser();

        var result = reverser.reverse(str);

        System.out.println(result);

        String str2 = "(1+2)<>=3";

        Balanced_Expresstion Balance = new Balanced_Expresstion();

        var isBalanced = Balance.Balanced_check(str2);

        System.out.println(isBalanced);


    }
}