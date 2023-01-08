package com.SpringAllCrudOperation.user.model;

import com.SpringAllCrudOperation.contact.model.UserContact;
import com.SpringAllCrudOperation.vehicles.model.Vehicles;
import io.swagger.models.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name ="user_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String age;
    private String address;

    @OneToOne(cascade=CascadeType.ALL)
    private Vehicles vehicles;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    //@OneToMany(cascade = CascadeType.ALL)
    private List<UserContact> userContacts;

}
