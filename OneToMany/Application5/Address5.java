class Address5{
  String street;
  int doorNo;
  Country5 country;
  
  
  public Address5( String street,int doorNo){
	  this.street=street;
	  this.doorNo=doorNo;
	  
  }
  
  void initCountry5(Country5 country){
	  this.country=country;
  }
  
  void displayAddress5(){
	  System.out.println("Street name"+" "+this.street);
	  System.out.println("DoorNo"+" "+this.doorNo);
	  //if(country!=null){
		 // for(int i=0;i<country.length;i++){
	  System.out.println(this.country.name);
		  //}
  //}
  }
}