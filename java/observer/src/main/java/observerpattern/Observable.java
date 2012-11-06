package observerpattern;

/**
 * User: Sina Jahan
 * Date: 12-11-03
 */
public interface Observable<T> {
    void add(Observer<T> observer);
    void remove(Observer<T> observer);
    void notifyObservers();
}
