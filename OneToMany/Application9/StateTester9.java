class StateTester9{
	public static void main(String[]args){
		
		State9 state1=new State9("STATE-A","CAPITAL-A");
		State9 state2=new State9("STATE-B","CAPITAL-B");
		
		State9 states[]={state1,state2};
		
		state1.displayState9();
		state2.displayState9();
		
	/////////////////////////////////////////////////	
		
		Country9 country=new Country9("INDIA",1);
		country.initStates(states);
		country.displayCountry();
		
	///////////////////////////////////////////////////
Address9 address1 = new Address9("KHB Bhatkal", 1);
		address1.initCountry9(country);
		address1.displayAddress9();
		
		Address9 address2 = new Address9("KHB Honnavar", 5);
		address2.initCountry9(country);
		address2.displayAddress9();
		
		Address9[] addresses = {address1, address2};
/////////////////////////////////////////////////////////////

    Developer9 dev1=new Developer9("Mahesh","m@gmail.com");
	Developer9 dev2=new Developer9("Suresh","s@gmail.com");
	dev1.displayDeveloper9();
	dev2.displayDeveloper9();
	Developer9[] developers={dev1,dev2};
	
	////////////////////////////////////////////////////////////////
	
	Application9 app=new Application9("Amazon",2.3f);
	app.initDeveloper(dev1);
	app.initDeveloper(dev2);
	app.displayApplication9();
	

		
		//app.displayDeveloperName();
		//app.displayDeveloperAddressSize();
		//application.displayDeveloperCountryStateSize();*/
}
}