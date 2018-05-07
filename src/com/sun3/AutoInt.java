package com.sun3;

/**
 * @author sun
 * @content 前缀：先执行运算，再生成值;后缀：先生成值，再执行运算
 */
public class AutoInt {
    public static void main(String[] args) {
        int i = 6;
        System.out.println("i:" + i);//6
        System.out.println("++i:" + ++i);//7
        System.out.println("i++:" + i++);//7
        System.out.println("i:" + i);//8
        System.out.println("--i:" + --i);//7
        System.out.println("i--:" + i--);//7
        System.out.println("i:" + i);//6
    }
}
