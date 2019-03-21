package com.example.experiment01.demo.com.example.experiment01.repository;

import com.example.experiment01.demo.com.example.experiment01.entity.Address;
import com.example.experiment01.demo.com.example.experiment01.entity.User;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@org.springframework.stereotype.Repository
@Transactional
public class UserRepository {

    @PersistenceContext
    private EntityManager em ;

    public void addUserAdderss(){
        User user = new User("Han");
        em.persist(user);

        Address address1 = new Address("412");
        address1.setUser(user);
        em.persist(address1);

        Address address2 = new Address("312");
        address2.setUser(user);
        em.persist(address2);
    }
}
