package ChatBot;

import java.util.Scanner;

class ChatBot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hello! My name is Aboba.\n" +
                "I was created in 2021.\n"+
                "Please, remind me your name.");
        String myString  = input.next();
        System.out.println("What a great name you have, " + myString);

        // closing the scanner object
        input.close();
    }
}