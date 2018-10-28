package pl.sda.adacemy.designpatterns.duck.strategy;

public class StandardSwimming implements Swimming {
    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
