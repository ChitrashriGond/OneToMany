class Country9{
	String name;
	int code;
	State9[] states;
	
	public Country9(String name,int code){
		this.name=name;
		this.code=code;
		
	}
	void initStates(State9[] states){
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