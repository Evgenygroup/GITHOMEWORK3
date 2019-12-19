package telran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class UserController {

    @Autowired
    private  UserService userService;

    @RequestMapping(path="/users",method  =POST)
    public  void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(path="/users/{id}",method = GET)
    public User getUserById (@PathVariable long id){
        return  userService.getUserById(id);
    }

    @RequestMapping(path="/users",method = GET)
    public List<User> getAllUsers (){
        return userService.getAllUsers();
    }

    @RequestMapping(path="/users/{id}",method = DELETE)
    public void deleteUserById (@PathVariable long id){userService.deleteUserById(id); }

    @RequestMapping (path = "/users/search",method = GET)
    public  User findByName(@RequestParam(name="first_name") String firstName){
      return   userService.findByFirstName(firstName);
    }



}
