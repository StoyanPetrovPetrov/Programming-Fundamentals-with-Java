package Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resurs = scanner.nextLine();
        Map<String,Integer> resources = new LinkedHashMap<>();
        while (!resurs.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resources.containsKey(resurs)){
                resources.put(resurs,quantity);
            }else {
                resources.put(resurs , resources.get(resurs) + quantity);
            }




            resurs = scanner.nextLine();
        }
        resources.forEach((k,v) -> System.out.printf("%s -> %d%n",k,v));
    }
}
