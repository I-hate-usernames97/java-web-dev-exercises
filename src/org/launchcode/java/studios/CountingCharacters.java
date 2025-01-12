package org.launchcode.java.studios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        HashMap<Character, Integer> total = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a phrase");
        String myString = input.nextLine();
//        String myString = ("If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.");

        for ( char i : myString.toLowerCase().toCharArray()){
          if (total.containsKey(i)){
              total.put(i, total.get(i) + 1);
          } else {
              total.put(i, 1);
          }
        }

        for (Map.Entry<Character, Integer> characters : total.entrySet()) {
            System.out.println(characters.getKey() + ": " + characters.getValue() );
        }
    }
}
