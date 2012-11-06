package observerpattern;

/**
 * User: Sina Jahan
 * Date: 12-11-03
 */
public interface Observer<T> {
    void update(T data);
}
