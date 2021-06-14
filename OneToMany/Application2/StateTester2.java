class StateTester2{
	public static void main(String[]args){
		
		State2 state1=new State2("STATE-c","CAPITAL-c");
		State2 state2=new State2("STATE-D","CAPITAL-D");
		
		State2 states[]={state1,state2};
		
		state1.displayState2();
		state2.displayState2();
		
	/////////////////////////////////////////////////	
		
		Country2 country=new Country2("INDIA",1);
		country.initStates(states);
		country.displayCountry();
		
	///////////////////////////////////////////////////
Address2 address1 = new Address2("KHB Bhatkal", 1);
		address1.initCountry2(country);
		address1.displayAddress2();
		
		Address2 address2 = new Address2("KHB Honnavar", 5);
		address2.initCountry2(country);
		address2.displayAddress2();
		
		Address2[] addresses = {address1, address2};
/////////////////////////////////////////////////////////////

    Developer2 dev1=new Developer2("Mahesh","m@gmail.com");
	Developer2 dev2=new Developer2("Suresh","s@gmail.com");
	dev1.displayDeveloper2();
	dev2.displayDeveloper2();
	Developer2[] developers={dev1,dev2};
	
	////////////////////////////////////////////////////////////////
	
	Application2 app=new Application2("Amazon",2.3f);
	app.initDeveloper(dev1);
	app.initDeveloper(dev2);
	app.displayApplication2();
	

		
		//app.displayDeveloperName();
		//app.displayDeveloperAddressSize();
		//application.displayDeveloperCountryStateSize();*/
}
}