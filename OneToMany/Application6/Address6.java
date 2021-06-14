class Address6{
  String street;
  int doorNo;
  Country6 country;
  
  
  public Address6( String street,int doorNo){
	  this.street=street;
	  this.doorNo=doorNo;
	  
  }
  
  void initCountry6(Country6 country){
	  this.country=country;
  }
  
  void displayAddress6(){
	  System.out.println("Street name"+" "+this.street);
	  System.out.println("DoorNo"+" "+this.doorNo);
	  //if(country!=null){
		 // for(int i=0;i<country.length;i++){
	  System.out.println(this.country.name);
		  //}
  //}
  }
}