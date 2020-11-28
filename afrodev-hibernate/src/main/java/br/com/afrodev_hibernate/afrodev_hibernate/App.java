package br.com.afrodev_hibernate.afrodev_hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.afrodev.hibernate.models.Personalidade;
import br.com.afrodev.hibernate.models.Pessoa;
import br.com.afrodev.hibernate.models.Sexo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("afrodev");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Pessoa p = new Pessoa();
		p.setNome("Janaína Cristina");
		p.setIdade(38);
		p.setSexo(Sexo.FEMININO);
		ArrayList<Personalidade> personalidades = new ArrayList<>();
		personalidades.add(new Personalidade("Extrovertido"));
		personalidades.add(new Personalidade("tímido"));
		personalidades.add(new Personalidade("proativa"));
		for (int i = 0; i < personalidades.size(); i++) {
			em.persist(personalidades.get(i));

		}
		p.setPersonalidades(personalidades);
		em.persist(p);
		// p.setIdade(40);
		em.getTransaction().commit();

		Query q = em.createQuery("SELECT p FROM Pessoa p where p.nome = :pNome", Pessoa.class);

		q.setParameter("pNome", "Allana");
		List<Pessoa> pessoas = q.getResultList();

		for (Pessoa pessoa : pessoas) {
			System.out.println(p);
		}

		em.close();

	}
}
