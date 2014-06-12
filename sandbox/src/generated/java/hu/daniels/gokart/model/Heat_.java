package hu.daniels.gokart.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Heat.class)
public abstract class Heat_ {

	public static volatile SingularAttribute<Heat, Date> date;
	public static volatile SingularAttribute<Heat, Integer> bestLap;
	public static volatile SingularAttribute<Heat, Integer> heatNumber;
	public static volatile SingularAttribute<Heat, BigDecimal> topSpeed;
	public static volatile SingularAttribute<Heat, Pilot> pilot;
	public static volatile SingularAttribute<Heat, Integer> kartNumber;
	public static volatile SingularAttribute<Heat, Integer> laps;
	public static volatile SingularAttribute<Heat, Integer> id;

}

