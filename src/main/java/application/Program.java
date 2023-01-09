package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		
//		em.getTransaction().begin(); // necessario para quando se for fazer uma operação de modificação no bd
//		em.persist(p1);
//		em.persist(p2);
//		em.getTransaction().commit();

		Pessoa p1 = em.find(Pessoa.class, 1);
		System.out.println(p1);
		// em.remove(p); p-> precisa ser uma entidade criada ou buscada no bd, precisa do getTransation
	}

}
