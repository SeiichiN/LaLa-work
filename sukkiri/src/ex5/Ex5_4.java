package ex5;

public class Ex5_4 {

	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double area1 = calcTriangleArea(bottom, height);
		System.out.println("底辺:" + bottom +
			"cm、 高さ:" + height + 
			"cm の三角形の面積は " + area1 + "平方cm です");

		double radius = 5.0;
		double area2 = calcCircleArea(radius);
		System.out.println("半径" + radius + "cm の" +
		     "円の面積は " + area2 + "平方cmです");
	}
	
	public static double calcTriangleArea(double bottom,
			                              double height) {
		return bottom * height / 2.0;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}

}
