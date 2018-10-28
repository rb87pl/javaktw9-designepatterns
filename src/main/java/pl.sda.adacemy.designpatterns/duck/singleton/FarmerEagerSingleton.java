package pl.sda.adacemy.designpatterns.duck.singleton;

import pl.sda.adacemy.designpatterns.duck.Duck;
import pl.sda.adacemy.designpatterns.duck.veterinary.ContactToVet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class FarmerEagerSingleton {

    private static final  FarmerEagerSingleton INSTANCE
            = new FarmerEagerSingleton();

    private List<Duck> ducks;
    private ContactToVet contactToVet;

    private FarmerEagerSingleton() {
        System.out.println(new Date() + " - Farmer is initializing");
        ArrayList<Duck> notSyncedList = new ArrayList<>();

        ducks = Collections.synchronizedList(notSyncedList);
        contactToVet = new ContactToVet();
        System.out.println(new Date() + " - Farmer is initialized");

    }

    public void askVet() {
        contactToVet.callVet();
    }

    public boolean addDuck(Duck duck) {
        return   ducks.add(duck);
    }

    public boolean removeDuck (Duck duck) {
        return ducks.remove(duck);
    }

    public List<Duck> getAllDucks () {
        return new ArrayList<>(ducks); // kopia listy z kaczkami
    }


    public static FarmerEagerSingleton getInstance() {
        return INSTANCE;
    }
}
