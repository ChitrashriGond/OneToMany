class State10{
	String name;
	String capitalCityName;
	
	
	public State10(String name,String capitalCityName){
		
		this.name=name;
		this.capitalCityName=capitalCityName;
	}
	
	void displayState10(){
		System.out.println("Invoked State and Capital city");
		System.out.println("State"+" "+this.name);
		System.out.println("capitalCityName"+" "+this.capitalCityName);
	}
	
}