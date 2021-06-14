class StateTester10{
	public static void main(String[]args){
		
		State10 state1=new State10("STATE-c","CAPITAL-c");
		State10 state2=new State10("STATE-D","CAPITAL-D");
		
		State10 states[]={state1,state2};
		
		state1.displayState10();
		state2.displayState10();
		
	/////////////////////////////////////////////////	
		
		Country10 country=new Country10("INDIA",1);
		country.initStates(states);
		country.displayCountry();
		
	///////////////////////////////////////////////////
Address10 address1 = new Address10("KHB Bhatkal", 5);
		address1.initCountry10(country);
		address1.displayAddress10();
		
		Address10 address2 = new Address10("KHB Honnavar", 9);
		address2.initCountry10(country);
		address2.displayAddress10();
		
		Address10[] addresses = {address1, address2};
/////////////////////////////////////////////////////////////

    Developer10 dev1=new Developer10("Mahesh","m@gmail.com");
	Developer10 dev2=new Developer10("Suresh","s@gmail.com");
	dev1.displayDeveloper10();
	dev2.displayDeveloper10();
	Developer10[] developers={dev1,dev2};
	
	////////////////////////////////////////////////////////////////
	
	Application10 app=new Application10("Amazon",2.3f);
	app.initDeveloper(dev1);
	app.initDeveloper(dev2);
	app.displayApplication10();
	

		
		//app.displayDeveloperName();
		//app.displayDeveloperAddressSize();
		//application.displayDeveloperCountryStateSize();*/
}
}