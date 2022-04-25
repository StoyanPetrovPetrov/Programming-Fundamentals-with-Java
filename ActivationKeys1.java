package FinalExam;

import java.util.Scanner;

public class ActivationKeys1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Generate")){
            String[] comandArr = command.split(">>>");
            switch (comandArr[0]){
                case "Contains":
                    String substring = comandArr[1];
                    if (message.contains(substring)){
                        System.out.printf("%s contains %s%n", message, substring);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String type = comandArr[1];
                    int startIndex = Integer.parseInt(comandArr[2]);
                    int endIndex = Integer.parseInt(comandArr[3]);
                    String subStringFromTo = message.substring(startIndex,endIndex);
                    if(type.equals("Upper")){
                        message = message.replace(subStringFromTo,subStringFromTo.toUpperCase());

                }else if (type.equals("Lower")){
                        message = message.replace(subStringFromTo,subStringFromTo.toLowerCase());
                    }
                    System.out.println(message);
                    break;
                case "Slice":
                    int startIndexToDelete = Integer.parseInt(comandArr[1]);
                    int endIndexToDelete = Integer.parseInt(comandArr[2]);
                    String subStringFromToDelete = message.substring(startIndexToDelete,endIndexToDelete);
                    message = message.replace(subStringFromToDelete,"");
                    System.out.println(message);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", message);
    }
}
