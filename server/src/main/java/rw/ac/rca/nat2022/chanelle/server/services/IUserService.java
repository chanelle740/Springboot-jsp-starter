package rw.ac.rca.nat2022.chanelle.server.services;

import rw.ac.rca.nat2022.chanelle.server.models.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUsers();

    User save(User user);

    User getLoggedInUser();
}
