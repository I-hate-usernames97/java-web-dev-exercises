package exercises;

import java.util.Scanner;

public class SearchTerm {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String sentence = ("Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'");
        sentence = sentence.toLowerCase();
        System.out.println("search for a term:" );
        String searchTerm = input.next().toLowerCase();
        int index = sentence.indexOf(searchTerm);
        int length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = sentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);

    }
}
