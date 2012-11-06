package weather;

import observerpattern.Observer;
import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * User: Sina Jahan
 * Date: 12-11-03
 */
public class WeatherDataTest {
    @Test
    public void observerShouldGetNotifiedTest() {
        WeatherData wData = new WeatherData();
        Observer<Data> observer = mock(Display.class);
        wData.add(observer);
        wData.notifyObservers();
        verify(observer, times(1)).update(null);

    }


}
