class Application8{

 String name;
 float version;
 Developer8 developer;

public Application8( String name,float version){
	this.name=name;
	this.version=version;	
}
   void initDeveloper(Developer8 developer){
	   
	this.developer=developer;
}

void displayApplication8(){
	System.out.println("AppName"+" "+this.name);
	System.out.println(this.version);
//for(int i=0;i<)
	System.out.println(this.developer.name);

}
void displayDeveloperAddressSize()
	{
		if(this.developer.addresses!=null){
		System.out.println("DeveloperAddressSize: "+this.developer.addresses.length);
		}
	}
	void displayDeveloperCountryStateSize()
	{
		if(this.developer.addresses!=null)
		{
			for(int s=0; s<this.developer.addresses.length;s++)
			{
				Address8 address =developer.addresses[s];
				String street = address.street ;
				Country8 country = address.country;
				State8[] states = country.states;
				System.out.println("SizeOfStates: "+states.length);
				//System.out.println("*************"+states.states.length);
			}
		}
	}
	void displayDeveloperAddressStreet()
	{
		if(this.developer.addresses!=null)
		{
			for(int r=0; r<this.developer.addresses.length; r++)
			{
				Address8 address = developer.addresses[r];
				String street = address.street;
				System.out.println("Street: "+street);
			}
		}
	}
	void displayDeveloperCountry()
	{
		if(this.developer.addresses!=null)
		{
			for(int f=0; f<this.developer.addresses.length; f++)
			{
				Address8 address= developer.addresses[f];
				Country8 country = address.country;
				System.out.println("CountryName: "+country.name);
				System.out.println("CountryCode: "+country.code);
			}
		}
	}
	void displayDeveloperCityName()
	{
		if(this.developer.addresses!=null)
		{
			for(int j=0; j<this.developer.addresses.length; j++)
			{
				Address8 address = developer.addresses[j];
				Country8 country = address.country;
				State8[] states = country.states;
				for(int index=0; index<states.length; index++)	
				{ 
					State8 state =states[index];
					String capitalCityName = state.capitalCityName;
					System.out.println("CapitalCityName: "+capitalCityName);
				}
				
			}
		}
	}
	
	
}
