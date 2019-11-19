package weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecast {

    private Weather[] weather;
    private Temperature main;


    public WeatherForecast() {
    }

    public WeatherForecast(Weather[] weather, Temperature main) {
        this.weather = weather;
        this.main = main;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public void setMain(Temperature main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return main + "," + Arrays.toString(weather);
    }
}
