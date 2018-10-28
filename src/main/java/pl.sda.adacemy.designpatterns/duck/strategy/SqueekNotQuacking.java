package pl.sda.adacemy.designpatterns.duck.strategy;

public class SqueekNotQuacking implements  Quacking{
    @Override
    public void quack() {
        System.out.println("Pisk");
    }
}
