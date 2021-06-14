class StateTester5{
	public static void main(String[]args){
		
		State5 state1=new State5("STATE-I","CAPITAL-I");
		State5 state2=new State5("STATE-J","CAPITAL-J");
		
		State5 states[]={state1,state2};
		
		state1.displayState5();
		state2.displayState5();
		
	/////////////////////////////////////////////////	
		
		Country5 country=new Country5("INDIA",1);
		country.initStates(states);
		country.displayCountry();
		
	///////////////////////////////////////////////////
Address5 address1 = new Address5("KHB Bhatkal", 1);
		address1.initCountry5(country);
		address1.displayAddress5();
		
		Address5 address2 = new Address5("KHB Honnavar", 5);
		address2.initCountry5(country);
		address2.displayAddress5();
		
		Address5[] addresses = {address1, address2};
/////////////////////////////////////////////////////////////

    Developer5 dev1=new Developer5("Mahesh","m@gmail.com");
	Developer5 dev2=new Developer5("Suresh","s@gmail.com");
	dev1.displayDeveloper5();
	dev2.displayDeveloper5();
	Developer5[] developers={dev1,dev2};
	
	////////////////////////////////////////////////////////////////
	
	Application5 app=new Application5("Amazon",2.3f);
	app.initDeveloper(dev1);
	app.initDeveloper(dev2);
	app.displayApplication5();
	

		
		//app.displayDeveloperName();
		//app.displayDeveloperAddressSize();
		//application.displayDeveloperCountryStateSize();*/
}
}