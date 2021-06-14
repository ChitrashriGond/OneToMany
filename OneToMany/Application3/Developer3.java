class Developer3{
	String name;
	String email;
	Address3[] addresses;
	
	
	public Developer3(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	void initDeveloper3(Address3[] addresses){
		this.addresses=addresses;
	}
	
	void displayDeveloper3(){
		System.out.println("Developer name"+" "+this.name);
		System.out.println("email"+" "+this.email);
		System.out.println("Address"+" "+this.addresses);
	}
}