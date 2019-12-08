package telran.gateway;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import telran.model.*;

public class ItemGateway {
    private static String ITEM_CREATE_ITEM_URL = "http://localhost:8080/items/create";
    private static String ITEM_GET_ITEMS_URL = "http://localhost:8080/items/all";

    private RestTemplate rest;

    public ItemGateway(RestTemplate rest) {
        this.rest = rest;
    }

    public void itemCreate(Item item, Token token) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", token.getToken());
        HttpEntity<Item> request = new HttpEntity(item, headers);

        rest.exchange(ITEM_CREATE_ITEM_URL, HttpMethod.POST, request, Void.class);
    }

    public ItemReturn[] itemsGet(Token token) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", token.getToken());
        HttpEntity<HttpHeaders> httpHeadersHttpEntity = new HttpEntity<>(headers);

        ResponseEntity<ItemReturn[]> itemReturn = rest.exchange(ITEM_GET_ITEMS_URL,
                HttpMethod.GET,
                httpHeadersHttpEntity,
                ItemReturn[].class);

        for (ItemReturn ir : itemReturn.getBody())
            System.out.println(ir);

        return itemReturn.getBody();
    }


    public HttpStatus itemDelete(String id, Token token) {

        String ITEM_DELETE_ITEM_URL = "http://localhost:8080/items/delete/" + id;

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", token.getToken());
        HttpEntity<HttpHeaders> httpHeadersHttpEntity = new HttpEntity<>(headers);

        ResponseEntity<Void> exchange = rest.exchange(ITEM_DELETE_ITEM_URL,
                HttpMethod.DELETE,
                httpHeadersHttpEntity,
                Void.class);

        return exchange.getStatusCode();

    }


}
