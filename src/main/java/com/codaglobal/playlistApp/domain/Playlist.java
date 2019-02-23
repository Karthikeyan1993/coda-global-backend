package com.codaglobal.playlistApp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Playlist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rank;

	private String name;
	private String artists;
	private double danceability;
	private double energy;
	private int key;
	private double loudness;
	private int mode;
	private double speechiness;
	private double acousticness;
	private double instrumentalness;
	private double liveness;
	private double valence;
	private double tempo;
	private long duration_ms;
	private int time_signature;

	public long getRank() {
		return rank;
	}

	public void setRank(long rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtists() {
		return artists;
	}

	public void setArtists(String artists) {
		this.artists = artists;
	}

	public double getDanceability() {
		return danceability;
	}

	public void setDanceability(double danceability) {
		this.danceability = danceability;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public double getLoudness() {
		return loudness;
	}

	public void setLoudness(double loudness) {
		this.loudness = loudness;
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public double getSpeechiness() {
		return speechiness;
	}

	public void setSpeechiness(double speechiness) {
		this.speechiness = speechiness;
	}

	public double getAcousticness() {
		return acousticness;
	}

	public void setAcousticness(double acousticness) {
		this.acousticness = acousticness;
	}

	public double getInstrumentalness() {
		return instrumentalness;
	}

	public void setInstrumentalness(double instrumentalness) {
		this.instrumentalness = instrumentalness;
	}

	public double getLiveness() {
		return liveness;
	}

	public void setLiveness(double liveness) {
		this.liveness = liveness;
	}

	public double getValence() {
		return valence;
	}

	public void setValence(double valence) {
		this.valence = valence;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public long getDuration_ms() {
		return duration_ms;
	}

	public void setDuration_ms(long duration_ms) {
		this.duration_ms = duration_ms;
	}

	public int getTime_signature() {
		return time_signature;
	}

	public void setTime_signature(int time_signature) {
		this.time_signature = time_signature;
	}

	@Override
	public String toString() {
		return "playlist [rank=" + rank + ", name=" + name + ", artists=" + artists + ", danceability=" + danceability
				+ ", energy=" + energy + ", key=" + key + ", loudness=" + loudness + ", mode=" + mode + ", speechiness="
				+ speechiness + ", acousticness=" + acousticness + ", instrumentalness=" + instrumentalness
				+ ", liveness=" + liveness + ", valence=" + valence + ", tempo=" + tempo + ", duration_ms="
				+ duration_ms + ", time_signature=" + time_signature + "]";
	}

}
