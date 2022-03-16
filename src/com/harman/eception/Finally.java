package com.harman.eception;

public class Finally {
    public static void main(String[] args) {
        try {
            String x = null;

            System.out.println(x.length());



        } catch (NullPointerException e) {
            System.out.println("It's is not a string");
        } catch (ArithmeticException e) {
            System.out.println("it is a string");
        }
        finally {
            System.out.println("Harman");
        }
    }
}
