package HomeWork1;

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

        System.out.println("–езультат: " + myMethod(a,b,c,d));

        int y,z;
        System.out.println("¬ведите y: "); y = console.nextInt();
        System.out.println("¬ведите z: "); z = console.nextInt();

        System.out.println("Ёто " + myMethod2(y,z) + " ,что результат y+z лежит в пределах от 10 до 20");

        int w;
        System.out.println("¬ведите w: "); w = console.nextInt();

        myMethod3(w);

        int h;
        System.out.println("¬ведите h: "); h = console.nextInt();
        System.out.println(myMethod4(h));


    }

    static float myMethod (float a, float b, float c, float d){
        return a * (b + (c/d));
    }

    static boolean myMethod2(int y, int z){
        return (y + z) >= 10 && (y + z) <= 20;
    }

    static void myMethod3 (int w){
        if (w >= 0) {System.out.println("„исло положительное");}
        else System.out.println("„исло отрицательное");
    }

    static boolean myMethod4 (int h){
        return h < 0;
    }

}