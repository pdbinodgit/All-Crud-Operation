package com.SpringAllCrudOperation.user.serviceImpl;

import com.SpringAllCrudOperation.user.model.User;
import com.SpringAllCrudOperation.user.repository.UserRepository;
import com.SpringAllCrudOperation.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserserviceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveValues(User user) {
        return userRepository.save(user);
    }


    @Override
    public Page<User> getAllValues(int offset, int page) {
        return userRepository.findAll(PageRequest.of(page,offset));
    }


    @Override
    public User getById(int id) {

           return userRepository.findById(id).orElse(null);
    }

    @Override
    public User getByName(String name) {
        return userRepository.findByName(name) ;
    }

    @Override
    public List<User> getByAge(String age) {
        return userRepository.findAllByAgeOrderByIdDesc(age);
    }

    @Override
    public List<User> getByAgeGreaterThan25() {
        return userRepository.findAllByAge();
    }

    @Override
    public String deleteValue(int id) {
        userRepository.deleteById(id);
        return "deleted";
    }

    @Override
    public User update(User user){
        User user1=userRepository.findById(user.getId()).orElse(null);

            user1.setName(user.getName());
            user1.setAge(user.getAge());
            user1.setAddress(user.getAddress());
            return userRepository.save(user1);
        }




    }



