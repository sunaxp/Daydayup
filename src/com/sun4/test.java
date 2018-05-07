package com.sun4;

public class test {
    static int result = 0;

    static void compare(int resvalue, int target) {
        if (resvalue > target)
            result = +1;
        else if (resvalue < target)
            result = -1;
        else
            result = 0;
    }

    public static void main(String[] args) {
        compare(10, 3);
        System.out.println(result);
        compare(2, 4);
        System.out.println(result);
        compare(5, 5);
        System.out.println(result);

    }
}
