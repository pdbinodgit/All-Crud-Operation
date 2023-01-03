package com.SpringAllCrudOperation.user.repository;

import com.SpringAllCrudOperation.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

// @Query("From support_tb s where s.ticketStatus= :ticketStatus and s.user.id= :id")
//    Page<Support> findByStatusOrderByIdDesc(@Param("ticketStatus") TicketStatus ticketStatus,
//                                            @Param("id") int user, Pageable pageable);
        User findByName(String name);

        Page<User> findAllByOrderByIdDesc(Pageable pageable);

        @Query("From user_tb where age=:age")
        List<User> findAllByAgeOrderByIdDesc(@Param("age") String age);

        @Query("From user_tb u where u.age>=25")
        List<User> findAllByAge();

}