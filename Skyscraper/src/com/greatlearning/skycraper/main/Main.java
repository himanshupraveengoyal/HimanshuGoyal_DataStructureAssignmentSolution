package com.greatlearning.skycraper.main;
import com.greatlearning.skycraper.service.*;
public class Main {

	public static void main(String[] args) {
		
		int totalFloors=MyConsole.getIntegerValues("Enter the Total No of floors:");
		int[] floorsConstruction=new int[totalFloors]; 
		for (int i = 0; i < totalFloors; i++) {
			floorsConstruction[i]=MyConsole.getIntegerValues("enter the floor size given on day "+ (i+1) + ":");	
		}
		ConstructionOrder constructionOrder=new ConstructionOrder();
		constructionOrder.Construction(floorsConstruction);
		
	}
}