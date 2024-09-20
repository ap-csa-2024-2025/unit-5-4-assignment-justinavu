public class Main
{
  public static void main(String[] args)
  {
    double distance = distance(0,0,5,0);
    System.out.println("Distance is " + distance);
    int a = 1;
    int b = 5;
    int c = 6;
    double solution1 = quadPlus(a, b, c);
    double solution2 = quadMinus(a, b, c);
    System.out.println(a + ("x^2") + " + " + b + "x + " + c + ", x = " + solution1 + "," + solution2);
  }
  public static double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
  }
  public static double quadPlus(double a, double b, double c) {
    return((-b + Math.sqrt((b*b)-(4*a*c)))/2*a);
  }
  public static double quadMinus(double a, double b, double c) {
    return((-b - Math.sqrt(((b*b)-4*a*c)))/2*a);
}
}
