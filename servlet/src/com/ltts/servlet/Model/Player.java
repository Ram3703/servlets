package com.ltts.servlet.Model;

import java.sql.Date;

public class Player {
	private int Player_Id;
	private String Player_Name;
	private String Player_country;
	private Date DateofBirth;
	private String skill;
	private int teamId;
	
	
	public Player() {
		super();
	}
	
	public Player(int playerId, String playerName, String country) {
		super();
		this.Player_Id = playerId;
		this.Player_Name = playerName;
		this.Player_country = country;
	}
	
	public int getPlayerId() {
		return Player_Id;
	}
	public void setPlayerId(int playerId) {
		this.Player_Id = playerId;
	}
	public String getPlayerName() {
		return Player_Name;
	}
	public void setPlayerName(String playerName) {
		this.Player_Name = playerName;
	}
	public String getCountry() {
		return Player_country;
	}
	public void setCountry(String country) {
		this.Player_country = country;
	}

	@Override
	public String toString() {
		return "Player playerId=" + Player_Id + ", playerName=" + Player_Name + ", country=" + Player_country ;
	}
	
	
}