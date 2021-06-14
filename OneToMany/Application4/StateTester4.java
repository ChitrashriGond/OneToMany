class StateTester4{
	public static void main(String[]args){
		
		State4 state1=new State4("STATE-G","CAPITAL-G");
		State4 state2=new State4("STATE-H","CAPITAL-H");
		
		State4 states[]={state1,state2};
		
		state1.displayState4();
		state2.displayState4();
		
	/////////////////////////////////////////////////	
		
		Country4 country=new Country4("Shrilanka",3);
		country.initStates(states);
		country.displayCountry();
		
	///////////////////////////////////////////////////
Address4 address1 = new Address4("KHB Kumta", 4);
		address1.initCountry4(country);
		address1.displayAddress4();
		
		Address4 address2 = new Address4("KHB Haliyal", 6);
		address2.initCountry4(country);
		address2.displayAddress4();
		
		Address4[] addresses = {address1, address2};
/////////////////////////////////////////////////////////////

    Developer4 dev1=new Developer4("Nagraj","c@gmail.com");
	Developer4 dev2=new Developer4("Chitra","s@gmail.com");
	dev1.displayDeveloper4();
	dev2.displayDeveloper4();
	Developer4[] developers={dev1,dev2};
	
	////////////////////////////////////////////////////////////////
	
	Application4 app=new Application4("Amazon",2.3f);
	app.initDeveloper(dev1);
	app.initDeveloper(dev2);
	app.displayApplication4();
	

		
		//app.displayDeveloperName();
		//app.displayDeveloperAddressSize();
		//application.displayDeveloperCountryStateSize();*/
}
}