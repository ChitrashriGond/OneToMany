class Address4{
  String street;
  int doorNo;
  Country4 country;
  
  
  public Address4( String street,int doorNo){
	  this.street=street;
	  this.doorNo=doorNo;
	  
  }
  
  void initCountry4(Country4 country){
	  this.country=country;
  }
  
  void displayAddress4(){
	  System.out.println("Street name"+" "+this.street);
	  System.out.println("DoorNo"+" "+this.doorNo);
	  //if(country!=null){
		 // for(int i=0;i<country.length;i++){
	  System.out.println(this.country.name);
		  //}
  //}
  }
}