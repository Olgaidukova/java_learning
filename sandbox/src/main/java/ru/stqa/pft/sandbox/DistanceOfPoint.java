package ru.stqa.pft.sandbox;

public class DistanceOfPoint {
	
  public static void main(String[] args) {

    Point p1 = new Point(1,1);
    System.out.println("Coordinates of the point p1: (" + p1.x + ";" + p1.y + ")");
    Point p2 = new Point(10,10);
    System.out.println("Coordinates of the point p2: (" + p2.x + ";" + p2.y + ")");

    System.out.println("Distance between two points = " + p1.distance(p2));
}

}