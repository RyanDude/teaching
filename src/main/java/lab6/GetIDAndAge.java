package lab6;

import java.util.*;
public class GetIDAndAge
{
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
              String b = keyboard.nextLine();
              id = Integer.parseInt(b);
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
