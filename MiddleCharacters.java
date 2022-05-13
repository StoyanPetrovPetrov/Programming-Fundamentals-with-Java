package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printMidlleChar(text);
    }
    public static void printMidlleChar(String text){
        if (text.length() % 2 == 0){
            System.out.print(text.charAt(text.length() / 2 -1));
            System.out.print(text.charAt(text.length() / 2 ));
        }else {
            System.out.print(text.charAt(text.length() / 2 ));
        }
    }
}
