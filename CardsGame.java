package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(firstPlayer);
        Collections.reverse(secondPlayer);
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            int firstCard = firstPlayer.get(firstPlayer.size() - 1);
            int secondCard = secondPlayer.get(secondPlayer.size() -1);
            if (firstCard > secondCard){
                firstPlayer.add(0,firstCard);
                firstPlayer.add(0,secondCard);

            }else if (secondCard > firstCard){
                secondPlayer.add(0,secondCard);
                secondPlayer.add(0,firstCard);

            }
            firstPlayer.remove(firstPlayer.size() - 1);
            secondPlayer.remove(secondPlayer.size() - 1);

        }
        int sum = 0;
        String name = "";
        if (!firstPlayer.isEmpty()){
            for (int card : firstPlayer){
                sum += card;
            }
            name = "First";
        }else {
            for (int card : secondPlayer){
                sum += card;
            }
            name = "Second";
        }
        System.out.printf("%s player wins! Sum: %d", name, sum);





    }
}
