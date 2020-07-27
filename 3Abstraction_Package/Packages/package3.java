package com.automobile.twowheeler;
import com.automobile.Vehicle;
class Hero extends Vehicle{
	public String getModelName()
	{
		return "Hero Amaze";
	}
	public String getRegistrationNumber()
	{
		return "123abc";
	}
	
	public String getOwnerName()
	{
		return "Mahesh Das";
	}
	public int getSpeed(){
		return 40;
	}
	public void radio(){
		System.out.println("Radio Facilities available here");
	}
}

class Honda extends Vehicle{
	public String getModelName()
	{
		return "Honda 365";
	}
	public String getRegistrationNumber()
	{
		return "456efg";
	}
	
	public String getOwnerName()
	{
		return "Ramesh Raj";
	}
	public int getSpeed(){
		return 50;
	}
	public void cdplayer(){
		System.out.println("cd player Facilities available here");
	}
}
public class Packages3{
	public static void main(String[] args){
		Hero hr = new Hero();
		Honda hn = new Honda();
		System.out.println("Specification of Hero class is ");
		System.out.println("Model Name is "+hr.getModelName());
		System.out.println("Registration Number is "+hr.getRegistrationNumber());
		System.out.println("Owner is "+hr.getOwnerName());
		System.out.println("Speed is "+hr.getSpeed());
		hr.radio();
		
		System.out.println("Specification of Honda class is ");
		System.out.println("Model Name is "+hn.getModelName());
		System.out.println("Registration Number is "+hn.getRegistrationNumber());
		System.out.println("Owner is "+hn.getOwnerName());
		System.out.println("Speed is "+hn.getSpeed());
		hn.cdplayer();
	}
}