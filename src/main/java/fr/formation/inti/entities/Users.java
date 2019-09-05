package fr.formation.inti.entities;
// Generated 5 sept. 2019 14:30:50 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", catalog = "championschallengeproject", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Users implements java.io.Serializable {

	private int idUser;
	private String email;
	private String password;
	private String pseudo;
	private String role;
	private String securityRequest;
	private Set<Teams> teamses = new HashSet<Teams>(0);
	private Set<LeaguesHaveUsers> leaguesHaveUserses = new HashSet<LeaguesHaveUsers>(0);

	public Users() {
	}

	public Users(int idUser, String email, String password, String pseudo, String role, String securityRequest) {
		this.idUser = idUser;
		this.email = email;
		this.password = password;
		this.pseudo = pseudo;
		this.role = role;
		this.securityRequest = securityRequest;
	}

	public Users(int idUser, String email, String password, String pseudo, String role, String securityRequest,
			Set<Teams> teamses, Set<LeaguesHaveUsers> leaguesHaveUserses) {
		this.idUser = idUser;
		this.email = email;
		this.password = password;
		this.pseudo = pseudo;
		this.role = role;
		this.securityRequest = securityRequest;
		this.teamses = teamses;
		this.leaguesHaveUserses = leaguesHaveUserses;
	}

	@Id

	@Column(name = "id_user", unique = true, nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@Column(name = "email", unique = true, nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "pseudo", nullable = false, length = 45)
	public String getPseudo() {
		return this.pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	@Column(name = "role", nullable = false, length = 45)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Column(name = "security_request", nullable = false, length = 45)
	public String getSecurityRequest() {
		return this.securityRequest;
	}

	public void setSecurityRequest(String securityRequest) {
		this.securityRequest = securityRequest;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Teams> getTeamses() {
		return this.teamses;
	}

	public void setTeamses(Set<Teams> teamses) {
		this.teamses = teamses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<LeaguesHaveUsers> getLeaguesHaveUserses() {
		return this.leaguesHaveUserses;
	}

	public void setLeaguesHaveUserses(Set<LeaguesHaveUsers> leaguesHaveUserses) {
		this.leaguesHaveUserses = leaguesHaveUserses;
	}

}