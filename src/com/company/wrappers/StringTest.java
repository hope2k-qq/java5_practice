package com.company.wrappers;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "wasd";
        String str2 = new String("wasd");
        char data[] = {'w','a','s','d'};
        String str3 = new String(data);
        String str4 = new String(str1.getBytes());
        StringBuilder builder = new StringBuilder("wasd");
        String str5 = builder.toString();

        String str6 = "Orange,Apple,Pomegranate,Pear";
        String[] fruits = str6.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String longestFruit = "";
        for (String fruit : fruits) {
            String lowerCaseFruit = fruit.toLowerCase();
            if (lowerCaseFruit.length() > longestFruit.length()) {
                longestFruit = lowerCaseFruit;
            }
        }
        System.out.println("\n" + longestFruit);

        System.out.println();
        for (String fruit : fruits) {
            String abbreviated = fruit.substring(0, Math.min(fruit.length(), 3));
            System.out.println(abbreviated);
        }

        String str7 = "   I_new_line      ";
        String trimStr7 = str7.trim();
        String result = trimStr7.replace('_',' ');
        System.out.println("\n" + result);

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("You entered: " + text);
        if(text.startsWith("Запуск")){
            System.out.println("Starting process");
        }
        if(text.endsWith("завершен")){
            System.out.println("Process completed");
        }
        if(text.toLowerCase().contains("ошибка")){
            System.out.println("An error has occurred");
        }

        StringBuilder builder2 = new StringBuilder();
        builder2.append(str1);
        builder2.append(str2);
        builder2.append(str3);
        builder2.append(str4);
        builder2.append(str5);
        builder2.append(str6);
        builder2.append(longestFruit);
        builder2.append(result);
    }
}
