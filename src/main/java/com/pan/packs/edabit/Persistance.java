package com.pan.packs.edabit;

public class Persistance {

    public static void main(String[] args) {

        System.out.println(additivePersistence(58));
        System.out.println(additivePersistence(123456));
        System.out.println(additivePersistence(60));
        System.out.println(multiplicativePersistence(77));
        System.out.println(multiplicativePersistence(123456));
        System.out.println(multiplicativePersistence(415));

    }

    public static int additivePersistence(int n) {

        if(n<10)
            return 0;

        int sum;
        do {
            sum = 0;
            while(n>0) {
                int digit = n % 10;
                sum += digit;
                n = n / 10;
            }
            n=sum;
        }while(sum>10);

        return sum;
    }

    public static int multiplicativePersistence(long n) {

        if(n<10)
            return 0;

        int mult;
        do {
            mult = 1;
            while(n>0) {
                long digit = n % 10;
                mult *= digit;
                n = n / 10;
            }
            n=mult;
        }while(mult>10);

        return mult;
    }
}
