class Address7{
  String street;
  int doorNo;
  Country7 country;
  
  
  public Address7( String street,int doorNo){
	  this.street=street;
	  this.doorNo=doorNo;
	  
  }
  
  void initCountry7(Country7 country){
	  this.country=country;
  }
  
  void displayAddress7(){
	  System.out.println("Street name"+" "+this.street);
	  System.out.println("DoorNo"+" "+this.doorNo);
	  //if(country!=null){
		 // for(int i=0;i<country.length;i++){
	  System.out.println(this.country.name);
		  //}
  //}
  }
}