package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "(?<symbols>@#+)(?<name>[A-Z][a-zA-Z0-9]{4,}[A-Z])(?<symbols2>@#+)";
        String numberRegex = "\\d";
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(input);
            Pattern num = Pattern.compile(numberRegex);
            Matcher numMatch = num.matcher(input);
            StringBuilder grup = new StringBuilder();
            if (m.find()){
                String product = m.group("name");
                for (int j = 0; j < product.length(); j++) {
                    if (numMatch.find()){
                        int number = Integer.parseInt(numMatch.group());
                        grup.append(number);
                    }
                    
                }
                if (grup.length() == 0){
                    grup.append("00");
                }
                System.out.println("Product group: "+grup.toString());
            }else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
