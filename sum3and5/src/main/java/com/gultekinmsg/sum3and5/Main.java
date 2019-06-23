package com.gultekinmsg.sum3and5;

public class Main {
    public static void main(String[] args) {

        int total = 0;
        int times = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i%3 ==0 && i %5 == 0){
                System.out.println(i + " met the condition");
                total += i;
                times++;
                if (times == 5){
                    break;
                }
            }
        }
        System.out.println(total);
    }
}
