package weather;

import observerpattern.Observable;
import observerpattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Knows about the weather.
 * User: Sina Jahan
 * Date: 12-11-03
 */
public class WeatherData implements Observable<Data> {
    private List<Observer<Data>> observers;
    private Data data;

    public WeatherData() {
        observers = new ArrayList<Observer<Data>>();
    }

    @Override
    public final void add(final Observer<Data> observer) {
        observers.add(observer);
    }

    @Override
    public final void remove(final Observer<Data> observer) {
        observers.remove(observer);
    }

    public final void notifyObservers() {
        for (Observer<Data> observer : observers) {
            observer.update(data);
        }
    }


}
