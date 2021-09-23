package com.Sana.Assignement;

import com.Sana.Area;

public class Manager
{
	static void common(Journey j,Vehicule value)
	{
		j.startJourney(value);
	}
	
	public static void main(String[] args)
	{
		common(new Journey(), (Vehicule)new Bus());
		common(new Journey(), (Vehicule)new Car());
		common(new Journey(), (Vehicule)new Bike());
	}

	 
}
