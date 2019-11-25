package weather;

import java.io.IOException;
import java.util.function.Consumer;

public class ForecasterService {
   private ReadFrom read;

    public ForecasterService(ReadFrom read) {
        this.read = read;
    }

    public void readWeather(String str, Consumer<String> print) throws IOException {

        Weather temperature = read.readFrom(str);
        print.accept("Temperature in " +temperature);
    }
}
