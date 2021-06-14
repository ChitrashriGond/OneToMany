class Address10{
  String street;
  int doorNo;
  Country10 country;
  
  
  public Address10( String street,int doorNo){
	  this.street=street;
	  this.doorNo=doorNo;
	  
  }
  
  void initCountry10(Country10 country){
	  this.country=country;
  }
  
  void displayAddress10(){
	  System.out.println("Street name"+" "+this.street);
	  System.out.println("DoorNo"+" "+this.doorNo);
	  //if(country!=null){
		 // for(int i=0;i<country.length;i++){
	  System.out.println(this.country.name);
		  //}
  //}
  }
}