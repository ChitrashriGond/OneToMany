class StateTester1{
	public static void main(String[]args){
		
		State1 state1=new State1("STATE-X","CAPITAL-X");
		State1 state2=new State1("STATE-Y","CAPITAL-Y");
		
		State1 states[]={state1,state2};
		
		state1.displayState1();
		state2.displayState1();
		
	/////////////////////////////////////////////////	
		
		Country1 country=new Country1("INDIA",1);
		country.initStates(states);
		country.displayCountry();
		
	///////////////////////////////////////////////////
Address1 address1 = new Address1("KHB Joyida", 5);
		address1.initCountry1(country);
		address1.displayAddress1();
		
		Address1 address2 = new Address1("KHB Yallapur", 9);
		address2.initCountry1(country);
		address2.displayAddress1();
		
		Address1[] addresses = {address1, address2};
/////////////////////////////////////////////////////////////

    Developer1 dev1=new Developer1("Ravi","r@gmail.com");
	Developer1 dev2=new Developer1("Shashi","s@gmail.com");
	dev1.displayDeveloper1();
	dev2.displayDeveloper1();
	Developer1[] developers={dev1,dev2};
	
	////////////////////////////////////////////////////////////////
	
	Application1 app=new Application1("Amazon",2.3f);
	app.initDeveloper(dev1);
	app.initDeveloper(dev2);
	app.displayApplication1();
	

		
}
}