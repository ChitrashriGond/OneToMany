class StateTester3{
	public static void main(String[]args){
		
		State3 state1=new State3("STATE-E","CAPITAL-E");
		State3 state2=new State3("STATE-F","CAPITAL-F");
		
		State3 states[]={state1,state2};
		
		state1.displayState3();
		state2.displayState3();
		
	/////////////////////////////////////////////////	
		
		Country3 country=new Country3("ENGLAND",2);
		country.initStates(states);
		country.displayCountry();
		
	///////////////////////////////////////////////////
Address3 address1 = new Address3("KHB Gokarna", 1);
		address1.initCountry3(country);
		address1.displayAddress3();
		
		Address3 address2 = new Address3("KHB Bhatkal", 5);
		address2.initCountry3(country);
		address2.displayAddress3();
		
		Address3[] addresses = {address1, address2};
/////////////////////////////////////////////////////////////

    Developer3 dev1=new Developer3("Nagesh","n@gmail.com");
	Developer3 dev2=new Developer3("Ramesh","r@gmail.com");
	dev1.displayDeveloper3();
	dev2.displayDeveloper3();
	Developer3[] developers={dev1,dev2};
	
	////////////////////////////////////////////////////////////////
	
	Application3 app=new Application3("Flipcart",1.5f);
	app.initDeveloper(dev1);
	app.initDeveloper(dev2);
	app.displayApplication3();
	

		
		//app.displayDeveloperName();
		//app.displayDeveloperAddressSize();
		//application.displayDeveloperCountryStateSize();*/
}
}