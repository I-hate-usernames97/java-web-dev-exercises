package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();

        words.add("Write");
        words.add("a");
        words.add("static");
        words.add("method");
        words.add("to");
        words.add("print");
        words.add("out");
        words.add("each");
        words.add("word");
        words.add("in");
        words.add("a");
        words.add("list");
        words.add("that");
        words.add("has");
        words.add("exactly");
        words.add("five");
        words.add("letters");

        ArrayList<Integer> arr = new ArrayList<>();
         for (int i = 0; i < 10; i++){
             arr.add(i);
         }

        System.out.println(sumEven(arr));
        System.out.println(arr);
        System.out.println(anyLettersWords(words));

    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList<String> anyLettersWords(ArrayList<String> words){

        ArrayList<String> word = new ArrayList<>();

        do {
            System.out.println("enter the length of the word you want");
            int length = input.nextInt();
            for (String s : words) {
                if (s.length() == length) {
                    word.add(s);
                }
            }
        }while (word.size() == 0);

        return word;
    }


}
