package swichcase;

import java.util.Scanner;

public class switch9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        function(31,1);

    }
    public static void function(int day, int month) {
//  day < 1 || day > 31 || month < 1 || month > 12
        if (day < 0 || day > 32 || month < 1 || month > 12) {
            System.out.println("bunday kun mavjud emas");
        } else {
            //albatta day 1..31,  month 1..12
            switch (month) {
                case 1 ->{
                    day++;
                    System.out.println((day) + "-yanvar");

                }

                case 3 ->{
                    day++;

                    System.out.println(day + "-mart");}
                case 5 -> {
                    day++;

                    System.out.println(day + "-may");
                }
                case 7 -> {
                    day++;

                    System.out.println(day + "-iyul");
                }
                case 8 -> {
                    day++;

                    System.out.println(day + "-avgust");
                }
                case 10 -> {
                    day++;

                    System.out.println(day + "-oktyabr");
                }
                case 12 -> {
                    day++;

                    System.out.println(day + "-dekabr");
                }
                case 2 -> {
                    if (day <= 28)
                        System.out.println(day + "-fevral");
                    else System.out.println("bunday kun mavjud emas");
                }
                case 4 -> {
                    day++;

                    if (day < 31) System.out.println(day + "-aprel");
                    else System.out.println("bunday kun mavjud emas");
                }
                case 6 -> {
                    day++;

                    if (day < 31) System.out.println(day + "-iyun");
                    else System.out.println("bunday kun mavjud emas");
                }
                case 9 -> {
                    day++;

                    if (day < 31) System.out.println(day + "-sentyabr");
                    else System.out.println("bunday kun mavjud emas");
                }
                case 11 -> {
                    day++;

                    if (day < 31) System.out.println(day + "-noyabr");
                    else System.out.println("bunday kun mavjud emas");
                }

            }
        }
    }

}
