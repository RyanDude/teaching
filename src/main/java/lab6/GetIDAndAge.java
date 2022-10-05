package lab6;

import java.util.*;
public class GetIDAndAge
{
	static final int HIGHID = 999;
    static final int HIGHAGE = 119;
    static final int LOW = 0;
    public static void main(String[] args)
    {
      int id,age;
      Scanner keyboard = new Scanner(System.in);
      while(true) {
          try{
              showStatus("pls input age");
              String a = keyboard.nextLine();
              age = Integer.parseInt(a);
              if(age < 0 || age > 999 ){
                  throw new DataEntryException("Number out of range");
              }else if(age == 0){
                  keyboard.close();
                  return;
              }

              showStatus("pls input id");
              a = keyboard.nextLine();
              id = Integer.parseInt(a);
              if(id < 0 || id > 999 ){
                  throw new DataEntryException("Number out of range");
              }else if(id == 0){
                  keyboard.close();
                  return;
              }
          }
          catch (InputMismatchException e){e.printStackTrace();}
          catch (DataEntryException e){e.printStackTrace();}
		 //catch block for 'DataEntryException'
		 //catch block for 'InputMismatchException'
      }

	  //dispay thank you message
    }
    public static void showStatus(String msg)
    {
      System.out.println(msg);
    }
}
