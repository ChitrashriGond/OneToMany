class Developer5{
	String name;
	String email;
	Address5[] addresses;
	
	
	public Developer5(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	void initDeveloper5(Address5[] addresses){
		this.addresses=addresses;
	}
	
	void displayDeveloper5(){
		System.out.println("Developer name"+" "+this.name);
		System.out.println("email"+" "+this.email);
		System.out.println("Address"+" "+this.addresses);
	}
}