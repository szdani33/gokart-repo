package hu.daniels.gokart.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pilot.class)
public abstract class Pilot_ {

	public static volatile SingularAttribute<Pilot, String> nickName;
	public static volatile SingularAttribute<Pilot, String> fullName;
	public static volatile SingularAttribute<Pilot, Integer> id;
	public static volatile SetAttribute<Pilot, Heat> heats;

}

