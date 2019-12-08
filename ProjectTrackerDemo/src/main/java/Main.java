
import org.springframework.web.client.RestTemplate;
import telran.gateway.ItemGateway;
import telran.gateway.UserGateway;
import telran.model.Item;
import telran.model.Token;
import telran.model.User;

public class Main {

    public static void main(String[] args) {

        RestTemplate rest = new RestTemplate();
        UserGateway gateway = new UserGateway(rest);
        ItemGateway itemGateway = new ItemGateway(rest);

        gateway.register(createtestUser());
        Token login = gateway.login(createtestUser());
        System.out.println(login);
        itemGateway.itemCreate(createTestitem(), login);
        itemGateway.itemsGet(login);
        System.out.println(itemGateway.itemDelete("1", login));

    }

    private static User createtestUser() {
        return new User("test", "test",
                "ivan", "ivanov", "test");
    }

    private static Item createTestitem() {
        return new Item("DoSomething1", "Task");
    }

}
