package weather;

import observerpattern.Observable;
import observerpattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Sina Jahan
 * Date: 12-11-03
 */
public class WeatherData implements Observable<Data> {
    private List<Observer<Data>> observers;
    Data data;

    public WeatherData() {
        observers = new ArrayList<Observer<Data>>();
    }

    @Override
    public void add(Observer<Data> observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer<Data> observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer<Data> observer : observers) {
            observer.update(data);
        }
    }


}
