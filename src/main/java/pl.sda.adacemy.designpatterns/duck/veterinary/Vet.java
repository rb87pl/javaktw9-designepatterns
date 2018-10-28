package pl.sda.adacemy.designpatterns.duck.veterinary;

import java.util.Date;

public class Vet {

    public Vet () {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void  answerPhone() {

        System.out.println(new Date()+"Oh hai");
    }
}
