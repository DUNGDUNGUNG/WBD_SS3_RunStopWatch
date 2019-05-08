package com.codegym.time;

public class Main {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }

        for (int temp: arr){
            System.out.print(temp + "\t");
        }
        System.out.println();

        sortASC(arr);
        // sap xep gia tri tang dan
        for (int temp: arr){
            System.out.print(temp + "\t");
        }
        System.out.println();

        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());

        System.out.println(stopWatch.getElapsedTime());

    }


    private static void sortASC(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
