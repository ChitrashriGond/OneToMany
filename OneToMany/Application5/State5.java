class State5{
	String name;
	String capitalCityName;
	
	
	public State5(String name,String capitalCityName){
		
		this.name=name;
		this.capitalCityName=capitalCityName;
	}
	
	void displayState5(){
		System.out.println("Invoked State and Capital city");
		System.out.println("State"+" "+this.name);
		System.out.println("capitalCityName"+" "+this.capitalCityName);
	}
	
}