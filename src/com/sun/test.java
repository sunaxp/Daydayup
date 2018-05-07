package com.sun;

import java.util.*;

/**
 * @author sunqian
 * @date 2018.05.07
 * @content java编程思想三章
 */
public class test {

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 34;
        t2.level = 56;
        System.out.println("1:t1.level:" + t1.level + ",t2.level:" + t2.level);
        t2 = t1;
        System.out.println("1:t1.level:" + t1.level + ",t2.level:" + t2.level);
    }
}

class Tank {
    int level;
}
