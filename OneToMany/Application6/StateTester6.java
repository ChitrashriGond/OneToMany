class StateTester6{
	public static void main(String[]args){
		
		State6 state1=new State6("STATE-H","CAPITAL-O");
		State6 state2=new State6("STATE-N","CAPITAL-P");
		
		State6 states[]={state1,state2};
		
		state1.displayState6();
		state2.displayState6();
		
	/////////////////////////////////////////////////	
		
		Country6 country=new Country6("America",7);
		country.initStates(states);
		country.displayCountry();
		
	///////////////////////////////////////////////////
Address6 address1 = new Address6("KHB Bhatkal", 1);
		address1.initCountry6(country);
		address1.displayAddress6();
		
		Address6 address2 = new Address6("KHB Honnavar", 5);
		address2.initCountry6(country);
		address2.displayAddress6();
		
		Address6[] addresses = {address1, address2};
/////////////////////////////////////////////////////////////

    Developer6 dev1=new Developer6("Mahesh","m@gmail.com");
	Developer6 dev2=new Developer6("Suresh","s@gmail.com");
	dev1.displayDeveloper6();
	dev2.displayDeveloper6();
	Developer6[] developers={dev1,dev2};
	
	////////////////////////////////////////////////////////////////
	
	Application6 app=new Application6("Amazon",2.3f);
	app.initDeveloper(dev1);
	app.initDeveloper(dev2);
	app.displayApplication6();
	

		
		//app.displayDeveloperName();
		//app.displayDeveloperAddressSize();
		//application.displayDeveloperCountryStateSize();*/
}
}