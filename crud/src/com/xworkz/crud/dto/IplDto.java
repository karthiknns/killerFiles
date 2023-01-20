package com.xworkz.crud.dto;

public class IplDto extends AbstractAuditDto {

	private String teamName;
	private String captanName;
	private String viceCaptan;
	private boolean ownerAlive;
	private double purse;
	private int wins;
	private int defeats;

	public IplDto() {
		System.out.println("constructer from iplDto");
	}

	@Override
	public String toString() {
		return "IplDto [teamName=" + teamName + ", captanName=" + captanName + ", viceCaptan=" + viceCaptan
				+ ", ownerAlive=" + ownerAlive + ", purse=" + purse + ", wins=" + wins + ", defeats=" + defeats + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptanName() {
		return captanName;
	}

	public void setCaptanName(String captanName) {
		this.captanName = captanName;
	}

	public String getViceCaptan() {
		return viceCaptan;
	}

	public void setViceCaptan(String viceCaptan) {
		this.viceCaptan = viceCaptan;
	}

	public boolean isOwnerAlive() {
		return ownerAlive;
	}

	public void setOwnerAlive(boolean ownerAlive) {
		this.ownerAlive = ownerAlive;
	}

	public double getPurse() {
		return purse;
	}

	public void setPurse(double purse) {
		this.purse = purse;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}

}
