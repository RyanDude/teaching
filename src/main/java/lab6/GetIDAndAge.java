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
      boolean bSTOP=false;
      Scanner keyboard = new Scanner(System.in);
      while(!bSTOP) {
         //your try block:
		 //display message using showStatus() to input ID in range 0..999
          try{
              showStatus("pls input age");
              String a = keyboard.nextLine();
              age = Integer.parseInt(a);
              if(age < 0 || age > 999 ){
                  throw new DataEntryException("Number out of range");
              }else if(age == 0){return;}

              showStatus("pls input id");
              String b = keyboard.nextLine();
              id = Integer.parseInt(b);
              if(id < 0 || id > 999 ){
                  throw new DataEntryException("Number out of range");
              }else if(id == 0){return;}
          }
          catch (InputMismatchException e){e.printStackTrace();}
          catch (DataEntryException e){e.printStackTrace();}
		 //catch block for 'DataEntryException'
		 //catch block for 'InputMismatchException'
      }
	  keyboard.close();
	  //dispay thank you message
    }
    public static void showStatus(String msg)
    {
      System.out.println(msg);
    }
}
