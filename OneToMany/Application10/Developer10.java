class Developer10{
	String name;
	String email;
	Address10[] addresses;
	
	
	public Developer10(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	void initDeveloper10(Address10[] addresses){
		this.addresses=addresses;
	}
	
	void displayDeveloper10(){
		System.out.println("Developer name"+" "+this.name);
		System.out.println("email"+" "+this.email);
		System.out.println("Address"+" "+this.addresses);
	}
}