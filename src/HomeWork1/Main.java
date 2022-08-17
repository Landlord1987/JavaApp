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

        System.out.println("Результат: " + myMethod(a,b,c,d));

        int y,z;
        System.out.println("Введите y: "); y = console.nextInt();
        System.out.println("Введите z: "); z = console.nextInt();

        System.out.println("Это " + myMethod2(y,z) + " ,что результат y+z лежит в пределах от 10 до 20");

        int w;
        System.out.println("Введите w: "); w = console.nextInt();

        myMethod3(w);

        int h;
        System.out.println("Введите h: "); h = console.nextInt();
        System.out.println(myMethod4(h));


        System.out.println("Введите Ваше имя: "); String name = console.next();
        myMethod5(name);

        System.out.println("Для определения принадлежности к високосному году, введите год: "); short year = console.nextShort();
        leapYear(year);
    }

    static float myMethod (float a, float b, float c, float d){
        return a * (b + (c/d));
    }

    static boolean myMethod2(int y, int z){
        return (y + z) >= 10 && (y + z) <= 20;
    }

    static void myMethod3 (int w){
        if (w >= 0) {System.out.println("Число положительное");}
        else System.out.println("Число отрицательное");
    }

    static boolean myMethod4 (int h){
        return h < 0;
    }

    static void myMethod5 (String name) {
        System.out.println("Привет, " + name);
    }

    static void leapYear (short year){
        if (year%400 == 0) {
            System.out.println("Год високосный");
        } else if (year%100 == 0){
            System.out.println("Год невисокосный");
        } else if (year%4 == 0) {
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
    }
}

