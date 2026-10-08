package edu.course.lab01;

import static java.awt.SystemColor.text;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0 || i * i >= number) {
                return true;
            }
        }
        return false;
    }
    public static boolean isPalindrome(String text) {
        if (text.length()==0) {
            throw new IllegalArgumentException();
        }
        for (int i=0;i<text.length()/2;i++){
            if (text.charAt(text.length()-1-i) != text.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static double average(int[] values){
        if (values.length == 0) {
            throw new IllegalArgumentException();
        }
        int res = 0;
        for(int i = 0; i<(values.length); i++){
            res = values[i]+res;
        }
        return (double) res/values.length;
    }
    public static double max(int[] values){
        if (values.length==0){
            throw new IllegalArgumentException();
        }
        double max = Double.MIN_VALUE;
        for (int i =0;i<(values.length); i++){
            if (values[i]>max){
                max=values[i];
            }
        }
        return max;
    }
    public static double min(int[] values){
        if (values.length==0){
            throw new IllegalArgumentException();
        }
        double min = Double.MAX_VALUE;
        for (int i =0;i<(values.length); i++){
            if (values[i]<min){
                min=values[i];
            }
        }
        return min;
    }
}
