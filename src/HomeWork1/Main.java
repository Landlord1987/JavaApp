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

}