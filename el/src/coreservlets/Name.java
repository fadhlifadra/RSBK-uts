package coreservlets;

public class Name {
  private String firstName, lastName, firstName1, lastName1;

  public Name(String firstName, String lastName, String firstName1, String lastName1) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.firstName1 = firstName1;
    this.lastName1 = lastName1;
  }
  
  public String getFirstName() {
    return(firstName);
  }
  
  public void setFirstName(String newFirstName) {
    firstName = newFirstName;
  }

  public String getLastName() {
    return(lastName);
  }
  
  public void setLastName(String newLastName) {
    lastName = newLastName;
  }
  public String getFirstName1() {
	    return(firstName1);
	  }
	  
	  public void setFirstName1(String newFirstName1) {
	    firstName1 = newFirstName1;
	  }

	  public String getLastName1() {
	    return(lastName1);
	  }
	  
	  public void setLastName1(String newLastName1) {
	    lastName1 = newLastName1;
	  }
}
