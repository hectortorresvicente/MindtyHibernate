package com.mindty.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mindty.modelos.Usuario;


public class CursoEM extends EntityManager {

	private static CursoEM instance = null;

	public static final CursoEM getInstance() {
		if (instance == null)
			instance = new CursoEM();
		return instance;
	}

	protected CursoEM() {
		super();
	}

	public List<Usuario> getListaUsuarios() {
		List<Usuario> usuarios = null;
		try {
			/* Hibernate */

			Session session = factory.openSession();

			Transaction t = session.beginTransaction();
			usuarios = session.createQuery("FROM Employee", Usuario.class).getResultList();

			t.commit();
			session.close();
			/* Hibernate */
		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuarios;
	}

	public boolean save(Usuario usr) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		session.save(usr);

		t.commit();
		session.close();

		return true;

	}

}
