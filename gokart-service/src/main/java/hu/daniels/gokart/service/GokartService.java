package hu.daniels.gokart.service;

import hu.daniels.gokart.model.Heat;
import hu.daniels.gokart.model.Heat_;
import hu.daniels.gokart.model.Pilot;
import hu.daniels.gokart.model.Pilot_;
import javafx.collections.ObservableList;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import com.sun.javafx.collections.ObservableListWrapper;

@SuppressWarnings("restriction")
public class GokartService {

	private static final String PERSISTENCE_UNIT_NAME = "gokart";
	private EntityManager em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();

	public ObservableList<Heat> loadHeats() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Heat> query = builder.createQuery(Heat.class);

		Root<Heat> heat = query.from(Heat.class);
		Join<Heat, Pilot> pilot = heat.join(Heat_.pilot);

		query.where(builder.equal(pilot.get(Pilot_.nickName), "Dani"));

		TypedQuery<Heat> tq = em.createQuery(query);

		return new ObservableListWrapper<Heat>(tq.getResultList());
	}
}