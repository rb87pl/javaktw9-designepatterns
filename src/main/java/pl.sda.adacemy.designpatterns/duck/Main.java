package pl.sda.adacemy.designpatterns.duck;

import pl.sda.adacemy.designpatterns.duck.singleton.FarmerEagerSingleton;

public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.swim();
        mallardDuck.quack();
        mallardDuck.fly();


        Duck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.swim();
        rubberDuck.quack();

        DuckEgg.Builder builder = new DuckEgg.Builder();
        builder.setYolkWeight(28D);
        DuckEgg egg = builder.bulid();
        System.out.println(egg);

        Fodder.Builder fodderBuilder = Fodder.builder(500,500);
       Fodder fodder = fodderBuilder
                .minerals(true)
                .triticaleGrams(321)
                .build();


      // FarmerEagerSingleton singleton1 = FarmerEagerSingleton.getInstance();
      // System.out.println(singleton1.hashCode());
      // singleton1.addDuck(mallardDuck);

      // FarmerEagerSingleton singleton2 = FarmerEagerSingleton.getInstance();
      // System.out.println(singleton2.hashCode());
      // System.out.println(singleton2.getAllDucks().size());

        //odpalenie sigletona

        FarmerEagerSingleton farmer = FarmerEagerSingleton.getInstance();
        farmer.askVet();
        System.out.println("===========");
        farmer.askVet();


    }




}
