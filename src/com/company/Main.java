package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <6 ; i++) {
            Runner runner=new Runner();
            runner.setName("Runner "+ i);
            runner.setNumber(i+1);
            runner.start();
            runner.join();

        }
        for (int i = 5; i >1 ; i--) {
            Runner runner=new Runner();
            runner.setName("Runner "+ i);
            runner.setNumber(i-1);
            runner.start();
            runner.join();


        }

        }
    }


