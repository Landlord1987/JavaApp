package HomeWork1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte aa = 1;
        short bb = 130;
        int cc = 33000;
        long dd = 50000;

        String text = "Привет";
        Boolean key = true;

        float e = 24.45f;
        double f = 45.65;

        char A = 'a';

        float a, b, c, d;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите a: "); a = console.nextFloat();
        System.out.println("Введите b: "); b = console.nextFloat();
        System.out.println("Введите c: "); c = console.nextFloat();
        System.out.println("Введите d: "); d = console.nextFloat();

        float res = myMethod(a,b,c,d);
        System.out.println("Результат: " + res);


    }

    static float myMethod (float a, float b, float c, float d){
        return a * (b + (c/d));
    }

}