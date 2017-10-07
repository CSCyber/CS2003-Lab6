/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-a00120a modeling language!*/


import java.util.*;

// line 20 "model.ump"
// line 41 "model.ump"
public class Order
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Order Attributes
  private int order_num;
  private String date;
  private int cost;
  private Customer purchaser;
  private List<String> items;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Order(int aOrder_num, String aDate, int aCost, Customer aPurchaser)
  {
    order_num = aOrder_num;
    date = aDate;
    cost = aCost;
    purchaser = aPurchaser;
    items = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOrder_num(int aOrder_num)
  {
    boolean wasSet = false;
    order_num = aOrder_num;
    wasSet = true;
    return wasSet;
  }

  public boolean setDate(String aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setCost(int aCost)
  {
    boolean wasSet = false;
    cost = aCost;
    wasSet = true;
    return wasSet;
  }

  public boolean setPurchaser(Customer aPurchaser)
  {
    boolean wasSet = false;
    purchaser = aPurchaser;
    wasSet = true;
    return wasSet;
  }

  public boolean addItem(String aItem)
  {
    boolean wasAdded = false;
    wasAdded = items.add(aItem);
    return wasAdded;
  }

  public boolean removeItem(String aItem)
  {
    boolean wasRemoved = false;
    wasRemoved = items.remove(aItem);
    return wasRemoved;
  }

  public int getOrder_num()
  {
    return order_num;
  }

  public String getDate()
  {
    return date;
  }

  public int getCost()
  {
    return cost;
  }

  public Customer getPurchaser()
  {
    return purchaser;
  }

  public String getItem(int index)
  {
    String aItem = items.get(index);
    return aItem;
  }

  public String[] getItems()
  {
    String[] newItems = items.toArray(new String[items.size()]);
    return newItems;
  }

  public int numberOfItems()
  {
    int number = items.size();
    return number;
  }

  public boolean hasItems()
  {
    boolean has = items.size() > 0;
    return has;
  }

  public int indexOfItem(String aItem)
  {
    int index = items.indexOf(aItem);
    return index;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "order_num" + ":" + getOrder_num()+ "," +
            "date" + ":" + getDate()+ "," +
            "cost" + ":" + getCost()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "purchaser" + "=" + (getPurchaser() != null ? !getPurchaser().equals(this)  ? getPurchaser().toString().replaceAll("  ","    ") : "this" : "null");
  }
}