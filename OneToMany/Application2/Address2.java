class Address2{
  String street;
  int doorNo;
  Country2 country;
  
  
  public Address2( String street,int doorNo){
	  this.street=street;
	  this.doorNo=doorNo;
	  
  }
  
  void initCountry2(Country2 country){
	  this.country=country;
  }
  
  void displayAddress2(){
	  System.out.println("Street name"+" "+this.street);
	  System.out.println("DoorNo"+" "+this.doorNo);
	  //if(country!=null){
		 // for(int i=0;i<country.length;i++){
	  System.out.println(this.country.name);
		  //}
  //}
  }
}