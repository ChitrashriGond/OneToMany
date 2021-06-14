class Developer7{
	String name;
	String email;
	Address7[] addresses;
	
	
	public Developer7(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	void initDeveloper7(Address7[] addresses){
		this.addresses=addresses;
	}
	
	void displayDeveloper7(){
		System.out.println("Developer name"+" "+this.name);
		System.out.println("email"+" "+this.email);
		System.out.println("Address"+" "+this.addresses);
	}
}