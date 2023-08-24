package br.com.fiap;

import br.com.fiap.domain.entity.Advogado;
import br.com.fiap.domain.entity.Estado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Estado estado = new Estado();
        estado.
                setNome("São Paulo").
                setSigla("SP");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist( estado );

        manager.getTransaction().commit();

        manager.close();
        factory.close();
    }
}