package pl.sda.adacemy.designpatterns.duck.strategy;

public class Floating implements Swimming {
    @Override
    public void swim() {
        System.out.println("I'm floating");
    }
}
