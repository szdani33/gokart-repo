package hu.daniels.gokart.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pilot generated by hbm2java
 */
@Entity
@Table(name = "pilot", catalog = "gokart")
public class Pilot implements java.io.Serializable {
	private static final long serialVersionUID = -7979473478681462023L;

	private Integer id;
	private String fullName;
	private String nickName;
	private Set<Heat> heats = new HashSet<Heat>(0);

	public Pilot() {
	}

	public Pilot(String fullName, String nickName) {
		this.fullName = fullName;
		this.nickName = nickName;
	}

	public Pilot(String fullName, String nickName, Set<Heat> heats) {
		this.fullName = fullName;
		this.nickName = nickName;
		this.heats = heats;
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

	@Column(name = "full_name", nullable = false, length = 50)
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "nick_name", nullable = false, length = 30)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pilot")
	public Set<Heat> getHeats() {
		return this.heats;
	}

	public void setHeats(Set<Heat> heats) {
		this.heats = heats;
	}

}