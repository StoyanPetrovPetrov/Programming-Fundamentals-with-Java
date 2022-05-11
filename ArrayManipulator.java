package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer ::parseInt).toArray();
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] data = line.split(" ");
            String command = data[0];
            switch (command){
                case "exchange":
                    int index = Integer.parseInt(data[1]);
                    break;
                case "max":
                    if (data[1].equals("even")){

                    }else {

                    }
                    break;
                case "min":
                    if (data[1].equals("even")){

                    }else {

                    }
                    break;
                case "first":
                    if (data[2].equals("even")){

                    }else {
                        
                    }
                    break;
                case "last":
                    if (data[2].equals("even")){

                    }else {

                    }
                    break;

            }


            line = scanner.nextLine();
        }
    }
}
