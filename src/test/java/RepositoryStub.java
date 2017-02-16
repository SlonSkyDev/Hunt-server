package test.java;

import main.java.User;
import main.java.database.AlreadyExistingException;
import main.java.database.UserRepository;

import java.util.ArrayList;

/**
 * Created by Slon on 16.02.2017.
 */
public class RepositoryStub implements UserRepository {
    private ArrayList<User> users = new ArrayList<>();

    public RepositoryStub() {
        users.add(new User("pupok666", "123456", 0));
        users.add(new User("vasil", "qwerty", 0));
    }

    @Override
    public User get(String login, String password) {
        User user = null;
        for(User u: users) {
            if(u.getLogin().equals(login) && u.getPassword().equals(password)) {
                user = u;
            }
        }
        return user;
    }

    @Override
    public User create(User user) throws AlreadyExistingException {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User removeUser(Integer id) {
        return null;
    }

    @Override
    public User getAll() {
        return null;
    }
}
