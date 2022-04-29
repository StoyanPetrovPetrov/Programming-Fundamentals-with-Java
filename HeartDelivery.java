package ExamPreparation;

import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] houses = nextIntArrey(scanner);
        int currentPosition = 0;
        String command = scanner.nextLine();
        while (command.equals("Love!")) {
            command = scanner.nextLine();

        }
        int faild = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != 0) {
                faild++;
            }

        }
        System.out.printf("Cupid's last position was %d.%n", currentPosition);
        if (faild > 0) {
            System.out.printf("Cupid has failed %d places.%n", faild);
        } else {
            System.out.println("Mission was successful.");
        }


    }


    private static int[] nextIntArrey(Scanner scanner) {
        String[] intAssString = scanner.nextLine().split("@");
        int[] arrey = new int[intAssString.length];
        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = Integer.parseInt(intAssString[i]);
        }
        return arrey;
    }
}


