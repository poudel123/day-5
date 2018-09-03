package com.capgemini.day5;


public class Television 
{

	static String state;
	static int volume;
	static int channel;
	boolean power;



	public Television(int volume, int channel) {
		
		this.volume=volume;
		this.channel=channel;
	}

	public static String findState(boolean power)
	{
		if(power==true)
		{
			state="on";
			return state;
		}
		else
		{
			state="off";
			return state;
		}
	
	}
	public static String findPower(boolean powerCheck)
	{
		if(powerCheck==true)
		{
			return "on";
		}
		else
		{
			return "off";
		}
	}
	
	
	public static int changeVolume()
	{
		volume=++volume;
		return volume;
	}
	
	

	public static int changeChannel() {
		channel=++channel;
		return channel;
		
	}
}
