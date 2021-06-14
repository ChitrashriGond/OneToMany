class Address8{
  String street;
  int doorNo;
  Country8 country;
  
  
  public Address8( String street,int doorNo){
	  this.street=street;
	  this.doorNo=doorNo;
	  
  }
  
  void initCountry8(Country8 country){
	  this.country=country;
  }
  
  void displayAddress8(){
	  System.out.println("Street name"+" "+this.street);
	  System.out.println("DoorNo"+" "+this.doorNo);
	  //if(country!=null){
		 // for(int i=0;i<country.length;i++){
	  System.out.println(this.country.name);
		  //}
  //}
  }
}