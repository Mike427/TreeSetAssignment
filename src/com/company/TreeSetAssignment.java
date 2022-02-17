package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a String: ");
        String inputString = scanner.nextLine();

        String[] token = inputString.split(" ");
        TreeSet<String> stringTree = new TreeSet<>(Arrays.asList(token));

        System.out.print(stringTree);
    }
}
