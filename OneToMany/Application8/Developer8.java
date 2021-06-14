class Developer8{
	String name;
	String email;
	Address8[] addresses;
	
	
	public Developer8(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	void initDeveloper8(Address8[] addresses){
		this.addresses=addresses;
	}
	
	void displayDeveloper8(){
		System.out.println("Developer name"+" "+this.name);
		System.out.println("email"+" "+this.email);
		System.out.println("Address"+" "+this.addresses);
	}
}