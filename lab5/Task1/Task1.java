import java.util.*;

public class Task1 {
	public static void drawShapes(List<? extends Shape> list) {
		for (Shape s : list) {
		  s.draw();
		}
	}
	public static void main(String[] args) {
	  // create an ArrayList of Rectangle objects
	  List<Rectangle> rectangles = new ArrayList<>();
	  rectangles.add(new Rectangle());
	  

	  // create an ArrayList of Circle objects
	  List<Circle> circles = new ArrayList<>();
	  circles.add(new Circle());
	  

	  // call drawShapes() with rectangles and circles lists as arguments
	  drawShapes(rectangles);
	  drawShapes(circles);
	}
}