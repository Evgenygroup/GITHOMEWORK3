package telran;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    private List<User> users=new ArrayList<>();

    public  void  addUser(User user){
        users.add(user);
    }

    public User getUserById (int id){
        return  users.get(id);
    }

    public  List<User>getAllUsers(){
        return  users;
    }

}
