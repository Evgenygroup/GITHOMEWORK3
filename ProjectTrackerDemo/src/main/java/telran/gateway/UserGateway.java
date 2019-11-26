package telran.gateway;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import telran.model.Token;
import telran.model.User;

public class UserGateway {

    private static String USER_REGISTER_URL = "http://localhost:8080/user/register";
    private static String USER_LOGIN_URL = "http://localhost:8080/user/login";

    RestTemplate rest;

    public UserGateway(RestTemplate rest) {
        this.rest = rest;
    }

    public void register(User user) {
        HttpEntity<User> request = new HttpEntity(user);
        rest.exchange(USER_REGISTER_URL, HttpMethod.POST, request, Void.class);

    }

    public Token login(User user) {
        HttpEntity<User> request = new HttpEntity(user);
        ResponseEntity<Token> token = rest.exchange(USER_LOGIN_URL, HttpMethod.POST, request, Token.class);

        return token.getBody();

    }
}
