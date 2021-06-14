class Country7{
	String name;
	int code;
	State7[] states;
	
	public Country7(String name,int code){
		this.name=name;
		this.code=code;
		
	}
	void initStates(State7[] states){
		this.states=states;
		
	}
	void displayCountry(){
		System.out.println("Country"+" "+this.name);
		System.out.println("Code"+" "+this.code);
		if(this.states!=null)
		{
			System.out.println("size Of States: "+this.states.length );
		
		for(int i=0; i<this.states.length;i++)
		{
			System.out.println(this.states[i].name);
		}
		}
	}
}