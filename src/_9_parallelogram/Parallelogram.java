package _9_parallelogram;

import java.util.Scanner;

public class Parallelogram {

    private static int breadth;
    private static int height;
    private static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();
        if (breadth > 0 && height > 0){
            System.out.println("valid");
            flag = true;
        }else{
            System.out.println("invalid");
            flag = false;
        }


    }

    public static void main(String[] args) { //don't change main body
        if (flag) {
            int area = breadth * height;
            System.out.print(area);
        }
    }
}

