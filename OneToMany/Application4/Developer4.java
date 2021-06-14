class Developer4{
	String name;
	String email;
	Address4[] addresses;
	
	
	public Developer4(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	void initDeveloper4(Address4[] addresses){
		this.addresses=addresses;
	}
	
	void displayDeveloper4(){
		System.out.println("Developer name"+" "+this.name);
		System.out.println("email"+" "+this.email);
		System.out.println("Address"+" "+this.addresses);
	}
}