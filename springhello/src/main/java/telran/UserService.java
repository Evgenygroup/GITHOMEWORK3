package telran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    @Autowired
    private UserRepository repository;

    public  void  addUser(User user){
        repository.save(user);
    }

    public User getUserById (Long id){
        return  repository.findById(id).get();
    }

    public  List<User>getAllUsers(){
        return  repository.findAll();
    }

    public void deleteUserById (Long id){repository.deleteById(id);}

    public  User findByFirstName (String name){return  repository.findByFirstName(name);}

}
