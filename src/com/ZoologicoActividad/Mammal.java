package com.ZoologicoActividad;

public class Mammal {
	protected int energyLevel = 100;
	protected int energyLevelBat = 300;
	
	public Mammal(int energyLevel){ //constructor
		this.energyLevel = energyLevel;
		
	}

	
	
	public int displayEnergy() { //Imprime nivel del gorila
		System.out.println("El nivel de la energia es: " + energyLevel);
		return energyLevel; 
	}
	public int displayEnergyBat() {
		System.out.println("El nivel de energia es: " + energyLevelBat);
		return energyLevelBat;
	}

	//Getters and Setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}



}
