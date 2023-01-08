package com.SpringAllCrudOperation.user.serviceImpl;

import com.SpringAllCrudOperation.contact.model.UserContact;
import com.SpringAllCrudOperation.contact.repository.UserContactRepository;
import com.SpringAllCrudOperation.user.model.User;
import com.SpringAllCrudOperation.user.repository.UserRepository;
import com.SpringAllCrudOperation.user.service.UserService;
import com.SpringAllCrudOperation.vehicles.model.Vehicles;
import com.SpringAllCrudOperation.vehicles.repository.VehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.util.List;

@Service
public class UserserviceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private VehiclesRepository vehiclesRepository;
    @Autowired
    private UserContactRepository userContactRepository;

    @Override
    public User saveValues(User user) {

        UserContact userContact=new UserContact();
       // System.out.println(userContact);

//        UserContact user1 =userContactRepository.findById(userContact.getId()).orElse(null);
//
//        user.setUserContacts(user1);
        return userRepository.save(user);
    }


    @Override
    public Page<User> getAllValues(int offset, int page) {
//        User user=new User();
//        Vehicles vehicles=vehiclesRepository.findById(user.getVehicles().getId()).orElse(null);


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


        Vehicles vehicles=new Vehicles();
            user1.setName(user.getName());
            user1.setAge(user.getAge());
            user1.setAddress(user.getAddress());
            user1.setVehicles(user.getVehicles());

            UserContact userContact=new UserContact();
            user1.setUserContacts(user.getUserContacts());
           // user1.getUserContacts(user.getUserContacts());
            return userRepository.save(user1);
        }




    }



