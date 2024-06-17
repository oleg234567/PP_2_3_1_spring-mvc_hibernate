package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

     List<User> getAllUsers();

     User showUser(int id);

     void save(User user);

     void updateUser(User user);

     void deleteUser(int id);
}
