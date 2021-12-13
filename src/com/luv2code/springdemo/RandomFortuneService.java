package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

    String[] arr;

    public RandomFortuneService() {
        this.arr = new String[]{"good luck", "bad luck", "indifferent luck"};
    }

    @Override
    public String getFortune() {
        int idx = (int)(Math.random() * 100) % arr.length;
        return arr[idx];
    }
}
