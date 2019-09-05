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

/**
 * MatchOfZeDay generated by hbm2java
 */
@Entity
@Table(name = "match_of_ze_day", catalog = "championschallengeproject")
public class MatchOfZeDay implements java.io.Serializable {

	private int idMatchOfTheDay;
	private Integer match1;
	private Integer match2;
	private Set<StatsPlayers> statsPlayerses = new HashSet<StatsPlayers>(0);
	private Set<ResultsUsers> resultsUserses = new HashSet<ResultsUsers>(0);

	public MatchOfZeDay() {
	}

	public MatchOfZeDay(int idMatchOfTheDay) {
		this.idMatchOfTheDay = idMatchOfTheDay;
	}

	public MatchOfZeDay(int idMatchOfTheDay, Integer match1, Integer match2, Set<StatsPlayers> statsPlayerses,
			Set<ResultsUsers> resultsUserses) {
		this.idMatchOfTheDay = idMatchOfTheDay;
		this.match1 = match1;
		this.match2 = match2;
		this.statsPlayerses = statsPlayerses;
		this.resultsUserses = resultsUserses;
	}

	@Id

	@Column(name = "id_match_of_the_day", unique = true, nullable = false)
	public int getIdMatchOfTheDay() {
		return this.idMatchOfTheDay;
	}

	public void setIdMatchOfTheDay(int idMatchOfTheDay) {
		this.idMatchOfTheDay = idMatchOfTheDay;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "matchOfZeDay")
	public Set<StatsPlayers> getStatsPlayerses() {
		return this.statsPlayerses;
	}

	public void setStatsPlayerses(Set<StatsPlayers> statsPlayerses) {
		this.statsPlayerses = statsPlayerses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "matchOfZeDay")
	public Set<ResultsUsers> getResultsUserses() {
		return this.resultsUserses;
	}

	public void setResultsUserses(Set<ResultsUsers> resultsUserses) {
		this.resultsUserses = resultsUserses;
	}

}
