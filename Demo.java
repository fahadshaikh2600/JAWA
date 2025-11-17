import java.util.Scanner;

class Test {
  public static void main(String[] args) {
    System.out.println("hello java");
  }
}

class test3 {
  public static void main(String[] args) {
    System.out.println("hello areeb");
  }
}

class Test2 {
  public static void main(String[] args) {
    System.out.println("hello java for test2");
  }
}

class Sqr {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int x = sc.nextInt();
    int sqr = x * x;
    System.out.println(sqr);
  }
}

class Basic1 {
  public static void main(String[] args) {
    int x = 5;
    int y = 57;

    int add = x + y;
    System.out.println(add);
  }
}

class Basic2 {
  public static void main(String[] args) {
    int x = 5;
    int y = 58;

    int minus = x - y;
    System.out.println(minus);
  }
}

class Basic3 {
  public static void main(String[] args) {
    int x = 5;
    int y = 50;

    int divide = x / y;
    System.out.println(divide);
  }
}

class Basic4 {
  public static void main(String[] args) {
    int x = 15;
    int y = 5;

    int into = x * y;
    System.out.println(into);
  }
}

class Basic5 {
  public static void main(String[] args) {
    int x = 5;
    int y = 15;

    int mod = x % y;
    System.out.println(mod);
  }
}

class Basic6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    double radius = sc.nextDouble();
    double area = 3.14 * radius * radius;
    double circumference = 2 * 3.14 * radius;
    System.out.println("Area of circle: " + area);
    System.out.println("Circumference of circle: " + circumference);

    sc.close();
  }

}

class Basic7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length");
    int length = sc.nextInt();
    System.out.println("enter the breath");
    int breath = sc.nextInt();

  }
}
