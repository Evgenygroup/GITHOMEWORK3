package weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature {
    private  String temp;

    public Temperature() {
    }

    public Temperature(String temp) {
        this.temp = temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return temp ;
    }
}
