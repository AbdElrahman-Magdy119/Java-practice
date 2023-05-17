import java.util.*;  
import java.util.function.Function;

// import java.util.function.Function;
// //@FunctionalInterface
// class lab{
// 	public static void main(String []args){
// 		Function<Integer,Float> Fahrenheit= celsius -> ( (celsius*9)/5) + 32.0f;
// 		System.out.println(Fahrenheit.apply(35));
// 	}
// }


// / example  ax2 + bx + c = 0  
//   a= 5    b=-7    c=9]
 class Determinant{
    private  Double array[]= new Double[3];
    public Determinant(Double [] arr){
       this.array = arr;
    }
    public  Function<Double[],Double> calcDet = (array)-> (array[1] * array[1])-(4 * array[0] * array[2]);
}


 class Roots{
    public static void main(String args[]){
    	 Double array[]= new Double[]{5.0,-7.0,9.0};  //  send elements by array  a=array[0] b=array[1] c=array[2]
         Determinant det = new Determinant(array);

	    Double determinant = det.calcDet.apply(array);
        if (determinant > 0){
			
			//root1 = (-b + √(b*b-4ac)) / (2a)         root2 = (-b - √(b*b-4ac)) / (2a)
            System.out.println("root1 is : " + (-array[1] + Math.sqrt(determinant)) / (2 * array[0]));
            System.out.println("root2 is : " + (-array[1] - Math.sqrt(determinant)) / (2 * array[0]));
        }else if (determinant == 0){
			//root1 = root2 = -b / (2 * a);
            System.out.println("root1 = root2  : " + (array[1] / (2 * array[0])));
        }else{
            double real = -array[1] / (2 * array[0]);   //real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * array[0]); //imaginary=√-(b*b-4ac)/ (2 * a);
            System.out.println("root1 is "+"(" + real +"+"+ imaginary+"i)");
            System.out.println("root2 is "+"("+ real +"-"+ imaginary+"i)");
        }
    }
}