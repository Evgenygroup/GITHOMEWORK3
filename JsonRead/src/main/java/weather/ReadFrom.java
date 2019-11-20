package weather;

import java.io.IOException;

public interface ReadFrom {
    WeatherForecast readFrom(String str) throws IOException;

}
