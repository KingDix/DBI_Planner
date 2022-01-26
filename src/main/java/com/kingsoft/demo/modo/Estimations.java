package com.kingsoft.demo.modo;

import java.util.List;

public class Estimations {
	private int noDays;
	private String noMonths;
	private int totalNoTrades;
	private int noWinTrades;
	private int noLossTrades;
	private double  finalBalance;
	public Estimations(int noDays, String noMonths, int totalNoTrades, int noWinTrades, int noLossTrades,
			double finalBalance) {
		
		this.noDays = noDays;
		this.noMonths = noMonths;
		this.totalNoTrades = totalNoTrades;
		this.noWinTrades = noWinTrades;
		this.noLossTrades = noLossTrades;
		this.finalBalance = finalBalance;
	}
	
	public Estimations() {
		
		// TODO Auto-generated constructor stub
	}

	public int getNoDays() {
		return noDays;
	}
	public void setNoDays(int entryLength) {
		this.noDays = entryLength*10;
	}
	public String getNoMonths() {
		return noMonths;
	}
	public void setNoMonths(Estimations est) {
		int m=est.getNoDays()/30;
		int d=est.getNoDays()%30;
		this.noMonths =m+"m"+d+"d";
	}
	public int getTotalNoTrades() {
		return totalNoTrades;
	}
	public void setTotalNoTrades(int entryLenth) {
		this.totalNoTrades = entryLenth*10;
	}
	public int getNoWinTrades() {
		return noWinTrades;
	}
	public void setNoWinTrades(List e ,double noWinTrades) {
		this.noWinTrades =(int) (e.size()*noWinTrades);
	}
	public int getNoLossTrades() {
		return noLossTrades;
	}
	public void setNoLossTrades(List e ,double noLossTrades) {
		this.noLossTrades = (int) (e.size()*noLossTrades);
	}
	public double getFinalBalance() {
		return finalBalance;
	}
	public void setFinalBalance(List<Entry> listOfEntries) {
		this.finalBalance=listOfEntries.get(listOfEntries.size()-1).getNewBalance();
		
	}

}
