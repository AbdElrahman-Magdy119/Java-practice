import java.util.*;
 
//4
class MyException extends Exception {
  public MyException(String message) {
    super(message);
  }
}

class ExceptionMethods {
	//3
  public void mthd1() throws MyException {
    throw new MyException("Method 1 have an error");

  }

  public void mthd2() throws MyException {
    throw new MyException("Method 2 have an error");
  }

  public void mthd3() throws MyException {
    throw new MyException("Method 3 have an error");
  }
}

public class Lab4 {
	public static void main(String[] args) {
	//1
    ExceptionMethods obj = new ExceptionMethods();
    //2
	try {
      obj.mthd1();
      obj.mthd2();
      obj.mthd3();
    } catch (MyException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Here is your error");
    }
  }
}