package com.aprendendoJpa;

import com.aprendendoJpa.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class exemplo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Clientes-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //Como consultar um objeto
        /*Cliente cliente = entityManager.find(Cliente.class,1);
        System.out.println(cliente.getNome());*/

        //Como fazer inserção
        /*Cliente cliente = new Cliente();
        cliente.setNome("thayná carla");

        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();*/

        //Como Remover um objeto do banco
        Cliente cliente = entityManager.find(Cliente.class,1);

        entityManager.getTransaction().begin();
        entityManager.remove(cliente);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
