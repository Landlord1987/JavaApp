package HomeWork1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte aa = 1;
        short bb = 130;
        int cc = 33000;
        long dd = 50000;

        String text = "ѕривет";
        Boolean key = true;

        float e = 24.45f;
        double f = 45.65;

        char A = 'a';

        float a, b, c, d;
        Scanner console = new Scanner(System.in);
        System.out.println("¬ведите a: "); a = console.nextFloat();
        System.out.println("¬ведите b: "); b = console.nextFloat();
        System.out.println("¬ведите c: "); c = console.nextFloat();
        System.out.println("¬ведите d: "); d = console.nextFloat();

        float res = myMethod(a,b,c,d);
        System.out.println("–езультат: " + res);

        int y,z;
        System.out.println("¬ведите y: "); y = console.nextInt();
        System.out.println("¬ведите z: "); z = console.nextInt();

        boolean res2 = myMethod2(y,z);
        System.out.println("Ёто " + res2 + " ,что результат y+z лежит в пределах от 10 до 20");


    }

    static float myMethod (float a, float b, float c, float d){
        return a * (b + (c/d));
    }

    static boolean myMethod2(int y, int z){
        return (y + z) >= 10 && (y + z) <= 20;
    }

}