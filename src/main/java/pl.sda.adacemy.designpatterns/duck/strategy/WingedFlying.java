package pl.sda.adacemy.designpatterns.duck.strategy;

public class WingedFlying implements Flying {


    @Override
    public void fly() {
        System.out.println("I'm using wings and fly");
    }
}
