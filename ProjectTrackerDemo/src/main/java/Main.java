
import org.springframework.web.client.RestTemplate;
import telran.gateway.UserGateway;
import telran.model.Token;
import telran.model.User;

public class Main {

    public static void main(String[] args) {
        RestTemplate rest =new RestTemplate();
        UserGateway gateway =new UserGateway(rest);
      //  gateway.register(createtestUser());
      Token login=gateway.login(createtestUser());
        System.out.println(login);

    }

    private  static User createtestUser(){
        return  new User ("test","test",
                "ivan","petrov","test");
    }

}
