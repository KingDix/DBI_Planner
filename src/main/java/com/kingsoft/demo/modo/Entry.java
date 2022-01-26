package com.kingsoft.demo.modo;

import java.text.DecimalFormat;

public class Entry {
private double initialBalance;
private double Lotsize;
private String W$L;
private String riskReward;
private double NetProfit;
private double newBalance;
private String newBalanceCalculation;
private double noWins;
private double noLoss;
private static final DecimalFormat df = new DecimalFormat("0.00");
public Entry(double initialBalance, double lotsize, String w$l, String riskReward, double netProfit,double noWins,double noLoss) {
	this.initialBalance = initialBalance;
	Lotsize = lotsize;
	W$L = w$l;
	this.riskReward = riskReward;
	NetProfit = netProfit;
	this.noWins=noWins;
	this.noLoss=noLoss;
	
}
public Entry() {
	
	// TODO Auto-generated constructor stub
}
public Entry(double initialBalance2) {
	// TODO Auto-generated constructor stub
	this.initialBalance=initialBalance2;
}
public double getInitialBalance() {
	 return Math.round(initialBalance * 100.0) / 100.0;
	//return initialBalance;
}
public void setInitialBalance(double initialBalance) {
	this.initialBalance = initialBalance;
}
public double getLotsize() {
	 return Math.round(Lotsize * 100.0) / 100.0;
	//return Lotsize;
}
public void setLotsize(Entry e,UserInputImpl userInput) {
	Lotsize=(e.getInitialBalance())*((userInput.getRiskPercentage()/100)/userInput.getStopLoss());
	
}
public String getW$L() {
	return W$L;
}
public void setW$L() {
	
	W$L =getnoWins()+"W"+getnoLoss()+"L";
}
//private double getnoLoss(UserInputImpl userInput) {
//	// TODO Auto-generated method stub
//	//return (100-userInput.getWinRate())/10;
//	 return Math.round(((100-userInput.getWinRate())/10) * 100.0) / 100.0;
//	 
//	
//}
//private double getnoWins(UserInputImpl userInput) {
//	// TODO Auto-generated method stub
//	//return userInput.getWinRate()/10;
//	 return Math.round((userInput.getWinRate()/10) * 100.0) / 100.0;
//
//}
public void  setnoWins(UserInputImpl userInput) {
	noWins=((userInput.getWinRate()/10) * 100.0) / 100.0;
	
}
public void setnoLoss(UserInputImpl userInput) {
	noLoss=(((100-userInput.getWinRate())/10) * 100.0) / 100.0;
	
}
public double  getnoWins() {
	return noWins;
}
public double getnoLoss() {
	return noLoss;
}
public String getRiskReward() {
	return riskReward;
}
public void setRiskReward(Entry e,UserInputImpl userInput) {
	this.riskReward = getRisk(e,userInput)+"$-"+getReward(e,userInput)+"$";
}
private double getReward(Entry e, UserInputImpl userInput) {
	// TODO Auto-generated method stub
	//return e.getLotsize()*userInput.getTakeProfit();
	 return Math.round((e.getLotsize()*userInput.getTakeProfit()) * 100.0) / 100.0;
	 
}
private double getRisk(Entry e, UserInputImpl userInput) {
	// TODO Auto-generated method stub
//	return e.getLotsize()*userInput.getStopLoss();
	return Math.round((e.getLotsize()*userInput.getStopLoss()) * 100.0) / 100.0;
}
public double getNetProfit() {
	 return Math.round(NetProfit * 100.0) / 100.0;
	//return NetProfit;
}
public void setNetProfit(Entry e,UserInputImpl userInput) {
	
	NetProfit = (e.getReward(e, userInput)*e.getnoWins())-(e.getRisk(e, userInput)*e.getnoLoss());
}
public void setNewBalance(Entry e ) {
	// TODO Auto-generated method stub
	
	newBalance= e.getNetProfit()+e.getInitialBalance();
	
}
public double getNewBalance() {
	// TODO Auto-generated method stub
	 return Math.round(newBalance * 100.0) / 100.0;
	//return     newBalance;
	
}
public void setNewBalanceCalculations(Entry e) {
	// TODO Auto-generated method stub
	newBalanceCalculation=e.getNetProfit()+"+"+e.getInitialBalance();
	
	
}
public String getNewBalanceCalculation() {
	 
	return newBalanceCalculation;
	// TODO Auto-generated method stub
	
}

}
