package com.kingsoft.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kingsoft.demo.modo.UserInputImpl;
import com.kingsoft.demo.modo.Entry;
import com.kingsoft.demo.modo.Estimations;



@Controller
public class Controller2 {
	private List<Entry>listOfEntries=new ArrayList<Entry>();
	private double noWiningTrades;
	private double noLosingTrades;
	
	@PostMapping("/estimate")
	public String getEstimations(@ModelAttribute UserInputImpl userInput,Model model) {
		
		
		model.addAttribute("userInput",userInput);
		doMath(userInput);
		model.addAttribute("listOfEntries",listOfEntries);
		model.addAttribute("estimations",getEstimations());
		return "estimations_page";
	}

	private void doMath(UserInputImpl userInput) {
		Entry e = new Entry();
		// TODO Auto-generated method stub
	if(userInput.getInitialBalance()<userInput.getTargetedAmount()) {
	    e=new Entry(userInput.getInitialBalance());//set initial balance
		e.setLotsize(e,userInput);//calculate  lotsise and  set it
		e.setnoWins(userInput);
		e.setnoLoss(userInput);
		e.setW$L();
		e.setRiskReward(e,userInput);
		e.setNetProfit(e,userInput);
		e.setNewBalanceCalculations(e);
		e.setNewBalance(e);
		listOfEntries.add(e);
		userInput.setInitialBalance(e.getNewBalance());
      	doMath(userInput);
		
		}

     noWiningTrades=e.getnoWins();
 	 noLosingTrades=e.getnoLoss();
	 userInput.setInitialBalance(listOfEntries.get(0).getInitialBalance()); 
	
	
		
		
	}
	
	private Estimations getEstimations() {
		Estimations estimations=new Estimations();
        estimations.setFinalBalance(listOfEntries);
		estimations.setNoDays(listOfEntries.size());
		estimations.setTotalNoTrades(listOfEntries.size());
		estimations.setNoMonths(estimations);
		estimations.setNoWinTrades(listOfEntries,noWiningTrades);
		estimations.setNoLossTrades(listOfEntries, noLosingTrades);
	
		return estimations;
		
	}
     @GetMapping("/backToHomePage")
          public String backHomePage() {
	      return "redirect:/";
}
}
