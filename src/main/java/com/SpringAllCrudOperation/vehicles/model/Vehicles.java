package com.SpringAllCrudOperation.vehicles.model;

import com.SpringAllCrudOperation.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "vehicles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

 

    //    @ManyToOne
//    @JoinColumn(referencedColumnName = "id")
//    private User user;

}
