class Developer6{
	String name;
	String email;
	Address6[] addresses;
	
	
	public Developer6(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	void initDeveloper6(Address6[] addresses){
		this.addresses=addresses;
	}
	
	void displayDeveloper6(){
		System.out.println("Developer name"+" "+this.name);
		System.out.println("email"+" "+this.email);
		System.out.println("Address"+" "+this.addresses);
	}
}