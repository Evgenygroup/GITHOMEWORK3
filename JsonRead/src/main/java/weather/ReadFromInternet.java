package weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.Function;

public class ReadFromInternet implements ReadFrom {

    public WeatherForecast readFrom(String str) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new URL(str), WeatherForecast.class);

    }


}
