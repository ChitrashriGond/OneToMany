class Application4{

 String name;
 float version;
 Developer4 developer;

public Application4( String name,float version){
	this.name=name;
	this.version=version;	
}
   void initDeveloper(Developer4 developer){
	   
	this.developer=developer;
}

void displayApplication4(){
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
				Address4 address =developer.addresses[s];
				String street = address.street ;
				Country4 country = address.country;
				State4[] states = country.states;
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
				Address4 address = developer.addresses[r];
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
				Address4 address= developer.addresses[f];
				Country4 country = address.country;
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
				Address4 address = developer.addresses[j];
				Country4 country = address.country;
				State4[] states = country.states;
				for(int index=0; index<states.length; index++)	
				{ 
					State4 state =states[index];
					String capitalCityName = state.capitalCityName;
					System.out.println("CapitalCityName: "+capitalCityName);
				}
				
			}
		}
	}
	
	
}
