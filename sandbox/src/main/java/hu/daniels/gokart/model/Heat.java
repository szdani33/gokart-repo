package hu.daniels.gokart.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Heat generated by hbm2java
 */
@Entity
@Table(name = "heat", catalog = "gokart")
public class Heat implements java.io.Serializable {
	private static final long serialVersionUID = 5074375251471594707L;

	private Integer id;
	private Pilot pilot;
	private int bestLap;
	private Date date;
	private int kartNumber;
	private int heatNumber;
	private int laps;
	private BigDecimal topSpeed;

	public Heat() {
	}

	public Heat(Pilot pilot, int bestLap, Date date, int kartNumber, int heatNumber, int laps) {
		this.pilot = pilot;
		this.bestLap = bestLap;
		this.date = date;
		this.kartNumber = kartNumber;
		this.heatNumber = heatNumber;
		this.laps = laps;
	}

	public Heat(Pilot pilot, int bestLap, Date date, int kartNumber, int heatNumber, int laps, BigDecimal topSpeed) {
		this.pilot = pilot;
		this.bestLap = bestLap;
		this.date = date;
		this.kartNumber = kartNumber;
		this.heatNumber = heatNumber;
		this.laps = laps;
		this.topSpeed = topSpeed;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pilot_fk", nullable = false)
	public Pilot getPilot() {
		return this.pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	@Column(name = "best_lap", nullable = false)
	public int getBestLap() {
		return this.bestLap;
	}

	public void setBestLap(int bestLap) {
		this.bestLap = bestLap;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "kart_number", nullable = false)
	public int getKartNumber() {
		return this.kartNumber;
	}

	public void setKartNumber(int kartNumber) {
		this.kartNumber = kartNumber;
	}

	@Column(name = "heat_number", nullable = false)
	public int getHeatNumber() {
		return this.heatNumber;
	}

	public void setHeatNumber(int heatNumber) {
		this.heatNumber = heatNumber;
	}

	@Column(name = "laps", nullable = false)
	public int getLaps() {
		return this.laps;
	}

	public void setLaps(int laps) {
		this.laps = laps;
	}

	@Column(name = "top_speed", precision = 5)
	public BigDecimal getTopSpeed() {
		return this.topSpeed;
	}

	public void setTopSpeed(BigDecimal topSpeed) {
		this.topSpeed = topSpeed;
	}

}