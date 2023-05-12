package Practice_30_days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            String email = sc.next();
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                list.add(name);
            }
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
