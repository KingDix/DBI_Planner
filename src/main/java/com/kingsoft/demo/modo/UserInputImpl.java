package com.kingsoft.demo.modo;

public class UserInputImpl{
	private double targetedAmount;
	private  double initialBalance;
	private double  takeProfit;
	private double stopLoss;
	private  double winRate;
	private  double riskPercentage;
	public UserInputImpl(double targetedAmount, double initialBalance, double takeProfit, double stopLoss,
			double winRate, double riskPercentage) {
		this.targetedAmount = targetedAmount;
		this.initialBalance = initialBalance;
		this.takeProfit = takeProfit;
		this.stopLoss = stopLoss;
		this.winRate = winRate;
		this.riskPercentage = riskPercentage;
	}
	public UserInputImpl() {
		
		// TODO Auto-generated constructor stub
	}
	public double getTargetedAmount() {
		return targetedAmount;
	}
	public void setTargetedAmount(double targetedAmount) {
		this.targetedAmount = targetedAmount;
	}
	public double getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
	public double getTakeProfit() {
		return takeProfit;
	}
	public void setTakeProfit(double takeProfit) {
		this.takeProfit = takeProfit;
	}
	public double getStopLoss() {
		return stopLoss;
	}
	public void setStopLoss(double stopLoss) {
		this.stopLoss = stopLoss;
	}
	public double getWinRate() {
		return winRate;
	}
	public void setWinRate(double winRate) {
		this.winRate = winRate;
	}
	public double getRiskPercentage() {
		return riskPercentage;
	}
	public void setRiskPercentage(double riskPercentage) {
		this.riskPercentage = riskPercentage;
	}

}
