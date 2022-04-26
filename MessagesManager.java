package FinalExam;

import java.util.*;

public class MessagesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        HashMap<String, Integer> uSentMessages = new HashMap<>();
        HashMap<String, Integer> uReceivedMessages = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Statistics")) {
            String[] tokens = input.split("=");

            switch (tokens[0]) {
                case "Add":
                    String username = tokens[1];
                    int sent = Integer.parseInt(tokens[2]);
                    int received = Integer.parseInt(tokens[3]);

                    if (!uSentMessages.containsKey(username)) {
                        uSentMessages.put(username, sent);
                        uReceivedMessages.put(username, received);
                    }
                    break;
                case "Message":
                    String sender = tokens[1];
                    String receiver = tokens[2];

                    if (uSentMessages.containsKey(sender) && uReceivedMessages.containsKey(receiver)) {
                        uSentMessages.put(sender, uSentMessages.get(sender) + 1);
                        uReceivedMessages.put(receiver, uReceivedMessages.get(receiver) + 1);

                        if (uSentMessages.get(sender) + uReceivedMessages.get(sender) >= capacity) {
                            System.out.println(String.format("%s reached the capacity!", sender));
                            uSentMessages.remove(sender);
                            uReceivedMessages.remove(sender);
                        }

                        if (uSentMessages.get(receiver) + uReceivedMessages.get(receiver) >= capacity) {
                            System.out.println(String.format("%s reached the capacity!", receiver));
                            uSentMessages.remove(receiver);
                            uReceivedMessages.remove(receiver);
                        }
                    }
                    break;
                case "Empty":
                    String usernameEmpty = tokens[1];

                    if ("All".equals(usernameEmpty)) {
                        uSentMessages.clear();
                        uReceivedMessages.clear();
                    } else {
                        uSentMessages.remove(usernameEmpty);
                        uReceivedMessages.remove(usernameEmpty);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Users count: %d%n", (uSentMessages.size() + uReceivedMessages.size()) / 2);

        uReceivedMessages.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed().thenComparing(Map.Entry::getKey))
                .forEach(e -> {
                    int sentAndReceivedMessages = uSentMessages.get(e.getKey())
                            + uReceivedMessages.get(e.getKey());
                    System.out.printf("%s - %d%n", e.getKey(), sentAndReceivedMessages);
                });
    }
}