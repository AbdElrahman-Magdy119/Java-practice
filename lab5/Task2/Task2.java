import java.util.*;

class Complex<T extends Number> {
  private T real;
  private T img;

  public Complex(T real, T img) {
    this.real = real;
    this.img = img;
  }

  public T getReal() {
    return real;
  }

  public void setReal(T real) {
    this.real = real;
  }

  public T getImg() {
    return img;
  }

  public void setImg(T img) {
    this.img = img;
  }

  @Override
  public String toString() {
    return real + " + " + img + "i";
  }
}

 class Main {
	public static <T extends Number> Complex<T> add(Complex<T> c1, Complex<T> c2) {
	   double r1 = c1.getReal().doubleValue();
	   double r2 = c2.getReal().doubleValue();
	   double i1 = c1.getImg().doubleValue();
	   double i2 = c2.getImg().doubleValue();
	   

		T r3 = (T) new Double(r1 + r2);
		T i3 = (T) new Double(i1 + i2);

   
		return new Complex<>(r3, i3);
	}
	
	public static <T extends Number> Complex<T> subtract(Complex<T> c1, Complex<T> c2) {
	   double r1 = (double) c1.getReal().doubleValue();
	   double r2 = (double) c2.getReal().doubleValue();
	   double i1 = (double) c1.getImg().doubleValue();
	   double i2 = (double) c2.getImg().doubleValue();

		T r3 = (T) new Double(r1 - r2);
		T i3 = (T) new Double(i1 - i2);

   
		return new Complex<>(r3, i3);
	}
	
	
	public static void main(String[] args) {
		Complex c1 = new Complex(10,20);
		Complex c2 = new Complex(30,10);
		Complex c3 = add(c1,c2);
		Complex c4 = subtract(c3,c2);
		System.out.println(c3.toString());
		System.out.println(c4.toString());
	}
}