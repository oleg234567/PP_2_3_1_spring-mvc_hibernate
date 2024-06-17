package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
     List<User> getAllUsers();

     User showUser(int id);

     void save(User user);

     void updateUser(User user);

     void deleteUser(int id);

}
