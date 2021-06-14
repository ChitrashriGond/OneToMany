class Developer1{
	String name;
	String email;
	Address1[] addresses;
	
	
	public Developer1(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	void initDeveloper1(Address1[] addresses){
		this.addresses=addresses;
	}
	
	void displayDeveloper1(){
		System.out.println("Developer name"+" "+this.name);
		System.out.println("email"+" "+this.email);
		System.out.println("Address"+" "+this.addresses);
	}
}