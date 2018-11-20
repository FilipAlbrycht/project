package com.example.costam;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shop");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManagerFactory.close();
        entityManager.close();
    }
}
