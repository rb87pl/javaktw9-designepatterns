package pl.sda.adacemy.designpatterns.duck.strategy;

public class StandardQuacking implements Quacking {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
