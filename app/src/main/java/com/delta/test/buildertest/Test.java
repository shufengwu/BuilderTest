package com.delta.test.buildertest;

/**
 * Created by Shufeng.Wu on 2017/7/12.
 */

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .buildBoard("键盘")
                .buildOS("系统")
                .buildmDisplay("显示器")
                .build();
        System.out.println(computer.toString());
    }
}
