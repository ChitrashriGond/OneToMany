class Address1{
  String street;
  int doorNo;
  Country1 country;
  
  
  public Address1( String street,int doorNo){
	  this.street=street;
	  this.doorNo=doorNo;
	  
  }
  
  void initCountry1(Country1 country){
	  this.country=country;
  }
  
  void displayAddress1(){
	  System.out.println("Street name"+" "+this.street);
	  System.out.println("DoorNo"+" "+this.doorNo);
	  //if(country!=null){
		 // for(int i=0;i<country.length;i++){
	  System.out.println(this.country.name);
		  //}
  //}
  }
}