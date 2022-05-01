package ExamPreparation;

import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] targets = nextIntArrey(scanner);
        String command = scanner.nextLine();
        int totalShot = 0;
        while (!command.equals("End")) {
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets %d ->",totalShot);
        printArrey(targets);

    }

    private static void printArrey(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length -1) {
                System.out.println(" ");
            }
            
        }
    }

    private static int[] nextIntArrey(Scanner scanner) {
        String[] intAssString = scanner.nextLine().split("\\s+");
        int[] arrey = new int[intAssString.length];
        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = Integer.parseInt(intAssString[i]);
        }
        return arrey;
    }

}
