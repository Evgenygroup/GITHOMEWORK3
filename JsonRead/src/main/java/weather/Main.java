package weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String city = "Berlin,de";

        ForecasterService forecasterService =
                new ForecasterService(new ReadFromInternet(new ObjectMapper()));

        forecasterService.readWeather(city, System.out::println);
    }
}
