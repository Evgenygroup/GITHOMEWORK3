package de.telran;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import telran.UserRepository;
import telran.UserService;;


@RunWith(SpringRunner.class)
public class UserServiceTest {

    private UserService service;
    @MockBean
    private  UserRepository  repo;
    @Before
    public void setUp(){service=new UserService();}

    @Test
    public  void testGetUserById(){}


}
