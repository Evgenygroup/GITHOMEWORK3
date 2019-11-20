package weather;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String city = "Berlin,de";
        String uRLString = "https://api.openweathermap.org/data/2.5/" +
                "weather?q=" + city + "&units=metric&appid=335838461bf85dd808aef371792bb429";
        
        ReadFrom read = new ReadFromInternet();
        ForecasterService forecasterService = new ForecasterService();

        forecasterService.readWeather(uRLString, read, System.out::println);
    }
}
