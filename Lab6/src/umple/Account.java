/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-a00120a modeling language!*/


import java.util.*;

// line 11 "model.ump"
// line 36 "model.ump"
public class Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account Attributes
  private int account_num;
  private double account_balance;
  private int totalOrders;
  private List<Order> previousOrders;
  private String password;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Account(int aAccount_num, double aAccount_balance, int aTotalOrders, String aPassword)
  {
    account_num = aAccount_num;
    account_balance = aAccount_balance;
    totalOrders = aTotalOrders;
    previousOrders = new ArrayList<Order>();
    password = aPassword;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAccount_num(int aAccount_num)
  {
    boolean wasSet = false;
    account_num = aAccount_num;
    wasSet = true;
    return wasSet;
  }

  public boolean setAccount_balance(double aAccount_balance)
  {
    boolean wasSet = false;
    account_balance = aAccount_balance;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalOrders(int aTotalOrders)
  {
    boolean wasSet = false;
    totalOrders = aTotalOrders;
    wasSet = true;
    return wasSet;
  }

  public boolean addPreviousOrder(Order aPreviousOrder)
  {
    boolean wasAdded = false;
    wasAdded = previousOrders.add(aPreviousOrder);
    return wasAdded;
  }

  public boolean removePreviousOrder(Order aPreviousOrder)
  {
    boolean wasRemoved = false;
    wasRemoved = previousOrders.remove(aPreviousOrder);
    return wasRemoved;
  }

  public boolean setPassword(String aPassword)
  {
    boolean wasSet = false;
    password = aPassword;
    wasSet = true;
    return wasSet;
  }

  public int getAccount_num()
  {
    return account_num;
  }

  public double getAccount_balance()
  {
    return account_balance;
  }

  public int getTotalOrders()
  {
    return totalOrders;
  }

  public Order getPreviousOrder(int index)
  {
    Order aPreviousOrder = previousOrders.get(index);
    return aPreviousOrder;
  }

  public Order[] getPreviousOrders()
  {
    Order[] newPreviousOrders = previousOrders.toArray(new Order[previousOrders.size()]);
    return newPreviousOrders;
  }

  public int numberOfPreviousOrders()
  {
    int number = previousOrders.size();
    return number;
  }

  public boolean hasPreviousOrders()
  {
    boolean has = previousOrders.size() > 0;
    return has;
  }

  public int indexOfPreviousOrder(Order aPreviousOrder)
  {
    int index = previousOrders.indexOf(aPreviousOrder);
    return index;
  }

  public String getPassword()
  {
    return password;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "account_num" + ":" + getAccount_num()+ "," +
            "account_balance" + ":" + getAccount_balance()+ "," +
            "totalOrders" + ":" + getTotalOrders()+ "," +
            "password" + ":" + getPassword()+ "]";
  }
}