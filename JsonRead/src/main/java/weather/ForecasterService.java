package weather;
import java.io.IOException;
import java.util.function.Consumer;

public class Demo {

    public void readWeather(String str, ReadFrom read, Consumer<String> print) throws IOException {

        WeatherForecast temperature = read.readFrom(str);

      print.accept("Temperature in the chosen city is  " + temperature);


    }
}
