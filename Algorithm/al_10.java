package Algorithm;

import java.util.Scanner;

public class al_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        String s1 = sc.next();
        if (s1.equalsIgnoreCase("AM")) {
            System.out.println(h + ":" + m + ":" + s);
        }
        /*
//        String s = sc.nextLine();
//        String sub="";
//        int num = Integer.parseInt(s.substring(0,2));
//        if(s.charAt(8)=='P'){
//            num = num + 12;
//            sub = ((num==24)?"12":num) + s.substring(2,8);
//        }
//        else{
//            if(num==12)
//                sub = "00" + s.substring(2,8);
//            else
//                sub = s.substring(0,8);
//        }
//        System.out.print(sub);
        */
    }
}
