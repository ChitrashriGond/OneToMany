class Address3{
  String street;
  int doorNo;
  Country3 country;
  
  
  public Address3( String street,int doorNo){
	  this.street=street;
	  this.doorNo=doorNo;
	  
  }
  
  void initCountry3(Country3 country){
	  this.country=country;
  }
  
  void displayAddress3(){
	  System.out.println("Street name"+" "+this.street);
	  System.out.println("DoorNo"+" "+this.doorNo);
	  //if(country!=null){
		 // for(int i=0;i<country.length;i++){
	  System.out.println(this.country.name);
		  //}
  //}
  }
}