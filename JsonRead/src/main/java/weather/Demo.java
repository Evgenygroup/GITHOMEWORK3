package weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;

public class Demo {
    public static void main(String[] args) throws Exception {

        String city = "Berlin,de";
        String uRLString = "https://api.openweathermap.org/data/2.5/" +
                "weather?q=" + city + "&units=metric&appid=335838461bf85dd808aef371792bb429";
        ObjectMapper mapper = new ObjectMapper();
        WeatherForecast temperature = mapper.readValue(new URL(uRLString), WeatherForecast.class);

        System.out.println("Temperature in " + city + " = " + temperature);

    }
}
