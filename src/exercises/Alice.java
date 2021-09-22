package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String passage = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a term to find and press ENTER.");
        String term = scan.nextLine();
        //System.out.println(passage.contains(term));
        int index = passage.indexOf(term);
        int length = term.length();
        System.out.println("index: "+index);
        System.out.println("length: "+length);
        System.out.println("new passage: ");
        System.out.println(passage.substring(0,index)+passage.substring(index+length));
    }
}
