package weather;

import observerpattern.Observer;

/**
 * User: Sina Jahan
 * Date: 12-11-03
 */
public class Display implements Observer<Data> {

    @Override
    public final void update(final Data data) {
        System.out.println(data);
    }
}
