package com.pan.packs.edabit;

// Watson likes to challenge Sherlock's math ability. He will provide a starting and ending
// value describing a range of integers. Sherlock must determine the number of square integers
// within that range, inclusive of the endpoints (note that a square integer is an integer
// which is the square of an integer, e.g. 1, 4, 9, 16, 25, 36, 49).

public class SherlockAndSquares {

    public static void main(String[] args) {

        System.out.println(squares(1, 1000000000));
    }

    public static int squares(int a, int b) {

        int c = (int) Math.floor(Math.sqrt(b));
        int d = (int) Math.ceil(Math.sqrt(a));
        return c-d+1;
    }
}
