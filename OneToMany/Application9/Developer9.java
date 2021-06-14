class Developer9{
	String name;
	String email;
	Address9[] addresses;
	
	
	public Developer9(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	void initDeveloper9(Address9[] addresses){
		this.addresses=addresses;
	}
	
	void displayDeveloper9(){
		System.out.println("Developer name"+" "+this.name);
		System.out.println("email"+" "+this.email);
		System.out.println("Address"+" "+this.addresses);
	}
}