package io.javabrains.com;

public class FactoryDesignPattern
{
	
					public static void main(String args[])
					{
								BaseThaliRestaurant thalirestaurant = new ThaliRestaurant();
								Thali th= thalirestaurant.createThali("gujarati");
								
					}
}