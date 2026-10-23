package Java_Basics;
class cylinder{
  private int radius;
  private int height;
  public int getradius(){
    return radius;
  }

  public void setradius(int radius){
    this.radius=radius;
  }
  
  public int getheight(){
    return height;
  }
  
  public void setheight(int height){
    this.height=height;
  }
  public double calculateVolume() {
    return Math.PI * radius * radius * height;
  }
  public double calculateSurfaceArea() {
    return 2 * Math.PI * radius * (radius + height);
  }
}
  
  public class CylinderGeometry {
    public static void main(String[] args) {
    cylinder myCylinder=new cylinder();
    myCylinder.setradius(5);
    myCylinder.setheight(10);
    System.out.println("Cylinder Radius: " + myCylinder.getradius());
    System.out.println("Cylinder Height: " + myCylinder.getheight());
    System.out.println("Volume of Cylinder: " + myCylinder.calculateVolume());
    System.out.println("Total Surface Area of Cylinder: " + myCylinder.calculateSurfaceArea());
  }
}
