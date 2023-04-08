package concurrentModificationExceptionExample;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Temp {
    public static void main(String[] argv) {
        final Observer observer1 = new Observer() {
            public void onChange(Observable observable) {
                System.out.println("observer1");
            }
        };
        final Observer observer2 = new Observer() {
            public void onChange(Observable observable) {
                observable.removeObserver(this);
                System.out.println("observer2");
            }
        };
        final Observable observable = new Observable();
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.notifyChange();
        observable.notifyChange();
        observable.notifyChange();
    }
}

interface Observer {
    void onChange(Observable observable);
}

class Observable {
    //    private final List<Observer> observers = new ArrayList<>();
    private final List<Observer> observers = new CopyOnWriteArrayList<>();
    
    void addObserver(Observer o) {
        observers.add(o);
    }

    void removeObserver(Observer o) {
        observers.remove(o);
    }

    void notifyChange() {
        for (Observer observer : observers) {
            observer.onChange(this);
        }
    }

//    void notifyChange() {
//        for (int i=0; i<observers.size(); i++) {
//            observers.get(i).onChange(this);
//        }
//    }
}

