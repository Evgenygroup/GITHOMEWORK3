package weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class ReadFromInternet implements ReadFrom {
    private static ObjectMapper mapper;

    public ReadFromInternet(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public Weather readFrom(String city) throws IOException {

        String uRLString = "https://api.openweathermap.org/data/2.5/" +
                "weather?q=" + city + "&units=metric&appid=335838461bf85dd808aef371792bb429";
        return mapper.readValue(new URL(uRLString), Weather.class);

    }


}
