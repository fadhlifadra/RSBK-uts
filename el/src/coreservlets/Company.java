package coreservlets;

public class Company {
  private String companyName, business, jk, kj;

  public Company(String companyName, String business, String jk, String kj) {
    this.companyName = companyName;
    this.business = business;
    this.jk = jk;
    this.kj = kj;
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
  
  public String getjk() { 
	  return(jk); 
  }

  public void setJk(String newjk) {
    jk = newjk;
  }

  public String getkj() { 
	  return(kj); 
  }

  public void setKj(String newkj) {
    kj = newkj;
  }
}
