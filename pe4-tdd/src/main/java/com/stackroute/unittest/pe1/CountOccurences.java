package com.stackroute.unittest.pe1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOccurences
{
    public static int countOccurrences(String str, char ch) {

        Matcher matcher = Pattern.compile(String.valueOf(ch))
                .matcher(str);

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        return counter;
    }

    public static void main(String[] args)
    {
        String str = "Java is java again java again";
        char ch = 'a';

        System.out.println("Character " + ch + " occurs " + countOccurrences(str, ch) + " times.");
    }
}