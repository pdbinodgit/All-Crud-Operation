package com.SpringAllCrudOperation.user.service;

import com.SpringAllCrudOperation.user.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    public User saveValues(User user);
    public Page<User> getAllValues(int page,int offset);
    public User getById(int id);
    public User getByName(String name);

    public List<User> getByAge(String age);

    public List<User> getByAgeGreaterThan25();

    public String deleteValue(int id);
    public User update(User user);

}
