package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        TreeMap<Character, Integer> symbols = new TreeMap<>();
        int currentCharCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!symbols.containsKey(currentChar)){
                symbols.put(currentChar, 1);
            } else {
                currentCharCount = symbols.get(currentChar);
                symbols.put(currentChar, ++currentCharCount);
            }
        }

        for (Map.Entry<Character, Integer> entry : symbols.entrySet()){
            System.out.printf("%s: %d time/s%n",entry.getKey(), entry.getValue());
        }
    }
}
