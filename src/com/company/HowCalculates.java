package com.company;

public class HowCalculates {

    static double sin(double x){
        return Math.sin(x);
    }

    public static void main(String[] args) {
        //byte b = 3;
	    int a = 5 / 3;
	    System.out.println(a);

        int b = 5 % 3;
        System.out.println(b);

        double c = 1 / 3.;
        System.out.println(String.format("%.2f", c));

//        int d = 2 / 0;
//        System.out.println(d);

        double d = 2. / 0;
        System.out.println(d);

        double e = d * 0;
        System.out.println(e);

        System.out.println(Double.isInfinite(d));

        double g = 1. / 2 / Math.sin(Math.PI / 2);
        System.out.println(g);
    }
}
