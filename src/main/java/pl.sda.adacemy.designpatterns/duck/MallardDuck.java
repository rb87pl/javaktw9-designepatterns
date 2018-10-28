package pl.sda.adacemy.designpatterns.duck;


import pl.sda.adacemy.designpatterns.duck.strategy.Flying;
import pl.sda.adacemy.designpatterns.duck.strategy.Quacking;
import pl.sda.adacemy.designpatterns.duck.strategy.StandardQuacking;
import pl.sda.adacemy.designpatterns.duck.strategy.StandardSwimming;
import pl.sda.adacemy.designpatterns.duck.strategy.Swimming;
import pl.sda.adacemy.designpatterns.duck.strategy.WingedFlying;

import java.util.Random;

public class MallardDuck implements Duck {

    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;



    public MallardDuck(){
        quackingStrategy = new StandardQuacking();
        flyingStrategy = new WingedFlying();
        swimmingStrategy = new StandardSwimming();
    }

    @Override
    public void quack() {
        quackingStrategy.quack();

    }

    @Override
    public void swim() {
        swimmingStrategy.swim();

    }

    @Override
    public void fly() {
       flyingStrategy.fly();
    }

    @Override
    public Integer totalEggsLaid() {
        return new Random().nextInt(100);
    }

    @Override
    public Integer age() {
        return new Random().nextInt(1000) + 10; // nie mniej niż 10
    }
}
