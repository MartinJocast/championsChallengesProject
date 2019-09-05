package fr.formation.inti.entities;
// Generated 5 sept. 2019 14:30:50 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ResultsUsers generated by hbm2java
 */
@Entity
@Table(name = "results_users", catalog = "championschallengeproject")
public class ResultsUsers implements java.io.Serializable {

	private int idResultsUsers;
	private Leagues leagues;
	private MatchOfZeDay matchOfZeDay;
	private Integer match1;
	private Integer match2;

	public ResultsUsers() {
	}

	public ResultsUsers(int idResultsUsers, Leagues leagues, MatchOfZeDay matchOfZeDay) {
		this.idResultsUsers = idResultsUsers;
		this.leagues = leagues;
		this.matchOfZeDay = matchOfZeDay;
	}

	public ResultsUsers(int idResultsUsers, Leagues leagues, MatchOfZeDay matchOfZeDay, Integer match1,
			Integer match2) {
		this.idResultsUsers = idResultsUsers;
		this.leagues = leagues;
		this.matchOfZeDay = matchOfZeDay;
		this.match1 = match1;
		this.match2 = match2;
	}

	@Id

	@Column(name = "id_results_users", unique = true, nullable = false)
	public int getIdResultsUsers() {
		return this.idResultsUsers;
	}

	public void setIdResultsUsers(int idResultsUsers) {
		this.idResultsUsers = idResultsUsers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "league_id_league", nullable = false)
	public Leagues getLeagues() {
		return this.leagues;
	}

	public void setLeagues(Leagues leagues) {
		this.leagues = leagues;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "match_of_ze_day_id_match_of_the_day", nullable = false)
	public MatchOfZeDay getMatchOfZeDay() {
		return this.matchOfZeDay;
	}

	public void setMatchOfZeDay(MatchOfZeDay matchOfZeDay) {
		this.matchOfZeDay = matchOfZeDay;
	}

	@Column(name = "match 1")
	public Integer getMatch1() {
		return this.match1;
	}

	public void setMatch1(Integer match1) {
		this.match1 = match1;
	}

	@Column(name = "match 2")
	public Integer getMatch2() {
		return this.match2;
	}

	public void setMatch2(Integer match2) {
		this.match2 = match2;
	}

}