class State2{
	String name;
	String capitalCityName;
	
	
	public State2(String name,String capitalCityName){
		
		this.name=name;
		this.capitalCityName=capitalCityName;
	}
	
	void displayState2(){
		System.out.println("Invoked State and Capital city");
		System.out.println("State"+" "+this.name);
		System.out.println("capitalCityName"+" "+this.capitalCityName);
	}
	
}