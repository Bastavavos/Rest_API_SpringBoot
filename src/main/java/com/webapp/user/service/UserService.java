package com.webapp.user.service;

import com.webapp.user.dao.UserDao;
import com.webapp.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserService {

    UserDao dao;
    private final RestTemplate restTemplate;
    public List<User> getAll() {
        return dao.findAll();
    }
    public User getById(int id) {
        return dao.findById(id);
    }
    public void deleteUser(User User) {
        dao.delete(User);
    }
    public void deleteAll(){
        dao.deleteAll();
    }

    @Autowired
    public UserService(UserDao userDao, RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.dao = userDao;
    }

    public User createUser(User User) {
        checkLicense(User.getLicenseNumber());
        return dao.save(User);
    }

    public User updateUser(User User) {
        checkLicense(User.getLicenseNumber());
        return dao.save(User);
    }

    public void checkLicense(String licenseNumber){
        if (!licenseNumber.matches("^[a-zA-Z0-9]{9}$")) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE, "406 - License format not acceptable"
            );
        }

        Boolean isValid = restTemplate.getForObject("http://LICENSE/licenses/" + licenseNumber, Boolean.class);
        if (isValid == null || !isValid ) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "400 - Invalid license"
            );
        }
    }
}
