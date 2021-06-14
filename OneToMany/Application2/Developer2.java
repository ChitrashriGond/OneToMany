class Developer2{
	String name;
	String email;
	Address2[] addresses;
	
	
	public Developer2(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	void initDeveloper2(Address2[] addresses){
		this.addresses=addresses;
	}
	
	void displayDeveloper2(){
		System.out.println("Developer name"+" "+this.name);
		System.out.println("email"+" "+this.email);
		System.out.println("Address"+" "+this.addresses);
	}
}