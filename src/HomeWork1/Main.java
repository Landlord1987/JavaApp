package HomeWork1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte aa = 1;
        short bb = 130;
        int cc = 33000;
        long dd = 50000;

        String text = "������";
        Boolean key = true;

        float e = 24.45f;
        double f = 45.65;

        char A = 'a';

        float a, b, c, d;
        Scanner console = new Scanner(System.in);
        System.out.println("������� a: "); a = console.nextFloat();
        System.out.println("������� b: "); b = console.nextFloat();
        System.out.println("������� c: "); c = console.nextFloat();
        System.out.println("������� d: "); d = console.nextFloat();

        System.out.println("���������: " + myMethod(a,b,c,d));

        int y,z;
        System.out.println("������� y: "); y = console.nextInt();
        System.out.println("������� z: "); z = console.nextInt();

        System.out.println("��� " + myMethod2(y,z) + " ,��� ��������� y+z ����� � �������� �� 10 �� 20");

        int w;
        System.out.println("������� w: "); w = console.nextInt();

        myMethod3(w);

        int h;
        System.out.println("������� h: "); h = console.nextInt();
        System.out.println(myMethod4(h));


        System.out.println("������� ���� ���: "); String name = console.next();
        myMethod5(name);

        System.out.println("��� ����������� �������������� � ����������� ����, ������� ���: "); short year = console.nextShort();
        leapYear(year);
    }

    static float myMethod (float a, float b, float c, float d){
        return a * (b + (c/d));
    }

    static boolean myMethod2(int y, int z){
        return (y + z) >= 10 && (y + z) <= 20;
    }

    static void myMethod3 (int w){
        if (w >= 0) {System.out.println("����� �������������");}
        else System.out.println("����� �������������");
    }

    static boolean myMethod4 (int h){
        return h < 0;
    }

    static void myMethod5 (String name) {
        System.out.println("������, " + name);
    }

    static void leapYear (short year){
        if (year%400 == 0) {
            System.out.println("��� ����������");
        } else if (year%100 == 0){
            System.out.println("��� ������������");
        } else if (year%4 == 0) {
            System.out.println("��� ����������");
        } else System.out.println("��� �� ����������");
    }
}

