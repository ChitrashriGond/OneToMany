class StateTester8{
	public static void main(String[]args){
		
		State8 state1=new State8("STATE-c","CAPITAL-c");
		State8 state2=new State8("STATE-D","CAPITAL-D");
		
		State8 states[]={state1,state2};
		
		state1.displayState8();
		state2.displayState8();
		
	/////////////////////////////////////////////////	
		
		Country8 country=new Country8("Aprica",8);
		country.initStates(states);
		country.displayCountry();
		
	///////////////////////////////////////////////////
Address8 address1 = new Address8("Navait colony Bhatkal", 1);
		address1.initCountry8(country);
		address1.displayAddress8();
		
		Address8 address2 = new Address8("KHB Honnavar", 5);
		address2.initCountry8(country);
		address2.displayAddress8();
		
		Address8[] addresses = {address1, address2};
/////////////////////////////////////////////////////////////

    Developer8 dev1=new Developer8("Soumya","s@gmail.com");
	Developer8 dev2=new Developer8("Ramya","r@gmail.com");
	dev1.displayDeveloper8();
	dev2.displayDeveloper8();
	Developer8[] developers={dev1,dev2};
	
	////////////////////////////////////////////////////////////////
	
	Application8 app=new Application8("Instagram",2.3f);
	app.initDeveloper(dev1);
	app.initDeveloper(dev2);
	app.displayApplication8();
	

		
		//app.displayDeveloperName();
		//app.displayDeveloperAddressSize();
		//application.displayDeveloperCountryStateSize();*/
}
}