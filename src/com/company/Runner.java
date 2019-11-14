package com.company;

public class Runner extends Thread {

   private int number = 1;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(getName() +" took the stick");
        if (getNumber() - 1 == 5) {
            System.out.println("Runner 5 is finished");
            System.out.println(getName()+" run to Runner 4");
        }else if (getNumber()==1){
            System.out.println(getName()+" ran to Runner "+getNumber());
            System.out.println("Runner "+getNumber()+" took the stick");
        }else {
            System.out.println(getName()+" ran to Runner "+getNumber());
        }
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }


    }




