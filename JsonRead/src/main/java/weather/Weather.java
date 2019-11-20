package weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {


    private Temperature main;
    private String name;


    public Weather() {
    }
    public Weather(Temperature main) {
        this.main = main;
    }
    public void setMain(Temperature main) {
        this.main = main;
    }

    public  void setName(String name){this.name=name;}

    @Override
    public String toString() {
        return name + " is "+main;
    }
}
