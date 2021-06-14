class Address9{
  String street;
  int doorNo;
  Country9 country;
  
  
  public Address9( String street,int doorNo){
	  this.street=street;
	  this.doorNo=doorNo;
	  
  }
  
  void initCountry9(Country9 country){
	  this.country=country;
  }
  
  void displayAddress9(){
	  System.out.println("Street name"+" "+this.street);
	  System.out.println("DoorNo"+" "+this.doorNo);
	  //if(country!=null){
		 // for(int i=0;i<country.length;i++){
	  System.out.println(this.country.name);
		  //}
  //}
  }
}