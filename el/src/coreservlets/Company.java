package coreservlets;

public class Company {
  private String companyName, business, companyName1, business1;

  public Company(String companyName, String business, String companyName1, String business1) {
    this.companyName = companyName;
    this.business = business;
    this.companyName1 = companyName1;
    this.business1 = business1;
  }

  public String getCompanyName() { 
	  return(companyName); 
  }

  public void setCompanyName(String newCompanyName) {
    companyName = newCompanyName;
  }

  public String getBusiness() { 
	  return(business); 
  }

  public void setBusiness(String newBusiness) {
    business = newBusiness;
  }
  
  public String getCompanyName1() { 
	  return(companyName1); 
  }

  public void setCompanyName1(String newCompanyName1) {
    companyName1 = newCompanyName1;
  }

  public String getBusiness1() { 
	  return(business1); 
  }

  public void setBusiness1(String newBusiness1) {
    business1 = newBusiness1;
  }
}
