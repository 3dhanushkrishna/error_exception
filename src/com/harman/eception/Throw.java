package com.harman.eception;

public class Throw {
    public static void main(String[] args) {
        int age = 10;
        if (age < 18) {
            throw new RuntimeException("not eligible for vote");
        } else {
        }

    }
}
