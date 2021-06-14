class StateTester7{
	public static void main(String[]args){
		
		State7 state1=new State7("STATE-c","CAPITAL-c");
		State7 state2=new State7("STATE-D","CAPITAL-D");
		
		State7 states[]={state1,state2};
		
		state1.displayState7();
		state2.displayState7();
		
	/////////////////////////////////////////////////	
		
		Country7 country=new Country7("INDIA",1);
		country.initStates(states);
		country.displayCountry();
		
	///////////////////////////////////////////////////
Address7 address1 = new Address7("KHB Bhatkal", 1);
		address1.initCountry7(country);
		address1.displayAddress7();
		
		Address7 address2 = new Address7("KHB Honnavar", 5);
		address2.initCountry7(country);
		address2.displayAddress7();
		
		Address7[] addresses = {address1, address2};
/////////////////////////////////////////////////////////////

    Developer7 dev1=new Developer7("Mahesh","m@gmail.com");
	Developer7 dev2=new Developer7("Suresh","s@gmail.com");
	dev1.displayDeveloper7();
	dev2.displayDeveloper7();
	Developer7[] developers={dev1,dev2};
	
	////////////////////////////////////////////////////////////////
	
	Application7 app=new Application7("Amazon",2.3f);
	app.initDeveloper(dev1);
	app.initDeveloper(dev2);
	app.displayApplication7();
	

		
		//app.displayDeveloperName();
		//app.displayDeveloperAddressSize();
		//application.displayDeveloperCountryStateSize();*/
}
}