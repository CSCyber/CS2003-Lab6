/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-a00120a modeling language!*/



// line 2 "model.ump"
// line 31 "model.ump"
public class Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Customer Attributes
  private String name;
  private Account account;
  private int age;
  private String address;
  private String gender;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Customer(String aName, Account aAccount, int aAge, String aAddress, String aGender)
  {
    name = aName;
    account = aAccount;
    age = aAge;
    address = aAddress;
    gender = aGender;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setAccount(Account aAccount)
  {
    boolean wasSet = false;
    account = aAccount;
    wasSet = true;
    return wasSet;
  }

  public boolean setAge(int aAge)
  {
    boolean wasSet = false;
    age = aAge;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setGender(String aGender)
  {
    boolean wasSet = false;
    gender = aGender;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public Account getAccount()
  {
    return account;
  }

  public int getAge()
  {
    return age;
  }

  public String getAddress()
  {
    return address;
  }

  public String getGender()
  {
    return gender;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "age" + ":" + getAge()+ "," +
            "address" + ":" + getAddress()+ "," +
            "gender" + ":" + getGender()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "account" + "=" + (getAccount() != null ? !getAccount().equals(this)  ? getAccount().toString().replaceAll("  ","    ") : "this" : "null");
  }
}