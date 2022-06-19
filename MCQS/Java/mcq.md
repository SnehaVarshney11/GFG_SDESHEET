Q1:- 
```
class Base {
    public void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public void show() {
       System.out.println("Derived::show() called");
    }
}
  
public class Main {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }
}
```
Output - Derived::show() called <br>

Q2:- 
```
What is the use of final keyword in Java?
```
Output - When a class is made final, a sublcass of it can not be created, When a method is final, it can not be overridden, When a variable is final, it can be assigned value only once. <br>

Q3:- 
```
class Base {
    final public void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public void show() {
       System.out.println("Derived::show() called");
    }
}
  
class Main {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }
}
```
Output - Compiler Error <br>

Q4:- 
```
class Base {
    public static void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public static void show() {
       System.out.println("Derived::show() called");
    }
}
  
class Main {
    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
    }
}
```
Output - Base::show() called <br>

Q5:- 
```
Which of the following is FALSE about arrays on Java
```
Output - Length of array can be changed after creation of array <br>

Q6:- 
```
package main;
class T {
  int t = 20;
}
class Main {
   public static void main(String args[]) {
      T t1 = new T();
      System.out.println(t1.t);
   }
}
```
Output - 20 <br>

Q7:- 
```
class T {
  int t = 20;
  T() {
    t = 40;
  }
}
class Main {
   public static void main(String args[]) {
      T t1 = new T();
      System.out.println(t1.t);
   }
}
```
Output - 40 <br>

Q8:- 
```
Which of the following is FALSE about abstract classes in Java
```
Output - A class can inherit from multiple abstract classes <br>

Q9:- 
```
public class Main {
    public static void main(String args[]) {
       int arr[] = {10, 20, 30, 40, 50};
       for(int i=0; i < arr.length; i++)
       {
             System.out.print(" " + arr[i]);              
       }
    }
}
```
Output -10, 20, 30, 40, 50 <br>

Q10:- Which of the following is true about interfaces in java.
```
1) An interface can contain following type of members.
....public, static, final fields (i.e., constants) 
....default and static methods with bodies

2) An instance of interface can be created.

3) A class can implement multiple interfaces.

4) Many classes can implement the same interface.
```
Output - 1, 3 and 4 <br>

Q11:- 
```
Which of the following is true about inheritance in Java. 1) In Java all classes inherit from the Object class directly or indirectly. The Object class is root of all classes. 2) Multiple inheritance is not allowed in Java. 3) Unlike C++, there is nothing like type of inheritance in Java where we can specify whether the inheritance is protected, public or private.
```
Output - All <br>

Q12:- 
```
final class Complex {
 
    private final double re;
    private final double im;
 
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
 
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
 
class Main {
  public static void main(String args[])
  {
       Complex c = new Complex(10, 15);
       System.out.println("Complex number is " + c);
  }         
}
```
Output - Complex number is (10.0 + 15.0i) <br>

Q13:- 
```
class Test {
  int i;
} 
class Main {
  public static void main(String args[]) { 
      Test t = new Test(); 
      System.out.println(t.i);
   } 
}
```
Output - 0 <br>

Q14:- 
```
class Main {   
   public static void main(String args[]) {      
         int t;      
         System.out.println(t); 
    }   
}
```
Output - Compilation Error <br>

Q15:- 
```
class Test { 
    public static void main(String[] args) { 
      for(int i = 0; 0; i++) 
      { 
          System.out.println("Hello"); 
          break; 
      } 
    } 
} 
```
Output - Compilation Error <br>

Q16:- 
```
class Test {
public static void swap(Integer i, Integer j) {
      Integer temp = new Integer(i);
      i = j;
      j = temp;
   }
   public static void main(String[] args) {
      Integer i = new Integer(10);
      Integer j = new Integer(20);
      swap(i, j);
      System.out.println("i = " + i + ", j = " + j);
   }
}
```
Output - i = 10, j = 20 <br>

Q17:- 
```
class Main {
 public static void main(String args[]){
   final int i;
   i = 20;
   System.out.println(i);
 }
}
```
Output - 20 <br>

Q18:- 
```
class Main {
 public static void main(String args[]){
    final int i;
    i = 20;
    i = 30;
    System.out.println(i);
 }
}
```
Output - Compiler Error <br>

Q19:- 
```
class Base {
  public final void show() {
       System.out.println("Base::show() called");
    }
}
class Derived extends Base {
    public void show() {  
       System.out.println("Derived::show() called");
    }
}
public class Main {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }
}
```
Output - Compiler Error <br>

Q20:- 
```
class Test {
   public static void main(String args[]) {
     int arr[] = new int[2];  
     System.out.println(arr[0]);
     System.out.println(arr[1]);
   }
}
```
Output - 0 &nbsp; 0 <br>

Q21:- Which of the following is/are true about constructors in Java?
```
1) Constructor name should be same as class name.
2) If you don't define a constructor for a class, 
    a default parameterless constructor is automatically
    created by the compiler. 
3) The default constructor calls super() and initializes all 
   instance variables to default value like 0, null.
4) If we want to parent class constructor, it must be called in 
   first line of constructor.
```
Output - All <br>

Q22:- 
```
class Point {
  int m_x, m_y;
   
  public Point(int x, int y) { m_x = x; m_y = y; }
  public Point() { this(10, 10); }
  public int getX() { return m_x; }
  public int getY() { return m_y; }
   
  public static void main(String args[]) {
    Point p = new Point();
    System.out.println(p.getX());
  }
} 
```
Output - 10 <br>

Q23:- 
```
final class Complex {
    private  double re,  im;
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    Complex(Complex c)
    {
      System.out.println("Copy constructor called");
      re = c.re;
      im = c.im;
    }            
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }            
}
class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(c1);    
        Complex c3 = c1;  
        System.out.println(c2);
    }
}
```
Output - Copy constructor called <br> (10.0 + 15.0i) <br>

Q24:- Which of the following is/are true about packages in Java? 
```
1) Every class is part of some package. 
2) All classes in a file are part of the same package. 
3) If no package is specified, the classes in the file 
   go into a special unnamed package 
4) If no package is specified, a new package is created with 
   folder name of class and the class is put in this package.
```
Output - 1, 2, 3 <br>

Q25:- Which of the following is/are advantages of packages? 
```
A) Packages avoid name clashes
B) Classes, even though they are visible outside their package, can have fields visible to packages only
C) We can have hidden classes that are used by the packages, but not visible outside.
D) All of the above
```
Output - D <br>

Q26:- 
```
Output of following Java program?
class Test
{
    public static void main (String[] args) 
    {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        if (arr1 == arr2) 
            System.out.println("Same");
        else
            System.out.println("Not same");
    }
}
```
Output - Not same <br>

Q27:- 
```
class Test
{
    public static void main (String[] args) 
    {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        if (arr1.equals(arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }
}
```
Output - Not same <br>

Q28:- 
```
class Main {
   public static void main(String args[]) {
      try {
         throw 10;
      }
      catch(int e) {
         System.out.println("Got the  Exception " + e);
      }
  }
}
```
Output - Compiler Error <br>

Q29:- 
```
class Base extends Exception {}
class Derived extends Base  {}
 
public class Main {
  public static void main(String args[]) {
   // some other stuff
   try {
       // Some monitored code
       throw new Derived();
    }
    catch(Base b)     { 
       System.out.println("Caught base class exception"); 
    }
    catch(Derived d)  { 
       System.out.println("Caught derived class exception"); 
    }
  }
} 
```
Output - Compiler Error because base class exception is caught before derived class <br>

Q30:- 
```
class Test
{
    static int a;
     
    static
    {
        a = 4;
        System.out.println ("inside static blockn");
        System.out.println ("a = " + a);
    }
     
    Test()
    {
        System.out.println ("ninside constructorn");
        a = 10;
    }
     
    public static void func()
    {
        a = a + 1;
        System.out.println ("a = " + a);
    }
     
    public static void main(String[] args)
    {
 
        Test obj = new Test();
        obj.func();
 
    }
}
```
Output - inside static block <br>a = 4 <br> inside constructor <br>a = 11

Q31:- 
```
class Test
{
    public void demo(String str)
    {
        String[] arr = str.split(";");
        for (String s : arr)
        {
            System.out.println(s);
        }
    }
 
    public static void main(String[] args)
    {
        char array[] = {'a', 'b', ' ', 'c', 'd', ';', 'e', 'f', ' ', 
                        'g', 'h', ';', 'i', 'j', ' ', 'k', 'l'};
        String str = new String(array);
        Test obj = new Test();
        obj.demo(str);
    }
}
```
Output - ab &nbsp; cd &nbsp;&nbsp; ef &nbsp; gh &nbsp;&nbsp; ij &nbsp; kl <br>

Q32:- 
```
abstract class demo
{
    public int a;
    demo()
    {
        a = 10;
    }
 
    abstract public void set();
     
    abstract final public void get();
 
}
 
class Test extends demo
{
 
    public void set(int a)
    {
        this.a = a;
    }
 
    final public void get()
    {
        System.out.println("a = " + a);
    }
 
    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.set(20);
        obj.get();
    }
}
```
Output - Compilation error <br>

Q33:- 
```
class Test
{
    public static void main(String[] args)
    {
        Double object = new Double("2.4");
        int a = object.intValue();
        byte b = object.byteValue();
        float d = object.floatValue();
        double c = object.doubleValue();
 
        System.out.println(a + b + c + d );
 
    }
}
```
Output - 8.800000095367432<br>

Q34:- 
```
class Test
{   int count = 0;
 
    void A() throws Exception
    {
        try
        {
            count++;
             
            try
            {
                count++;
 
                try
                {
                    count++;
                    throw new Exception();
 
                }
                 
                catch(Exception ex)
                {
                    count++;
                    throw new Exception();
                }
            }
             
            catch(Exception ex)
            {
                count++;
            }
        }
         
        catch(Exception ex)
        {
            count++;
        }
 
    }
 
    void display()
    {
        System.out.println(count);
    }
 
    public static void main(String[] args) throws Exception
    {
        Test obj = new Test();
        obj.A();
        obj.display();
    }
}
```
Output - 5 <br>

Q35:- 
```
// Note static keyword after import.
import static java.lang.System.*;
   
class StaticImportDemo
{
   public static void main(String args[])
   {      
        out.println("GeeksforGeeks");
   }
}
```
Output - GeeksforGeeks <br>

Q36:- 
```
program side-effect (input, output);
    var x, result: integer;
    function f (var x:integer):integer;
    begin
        x:x+1;f:=x;
    end;
begin
    x:=5;
    result:=f(x)*f(x);
    writeln(result);
end;
```
Output - 36<br>

Q37:- 
```
Type IV JDBC driver is a driver
```
Output - which communicates through Java sockets<br>

Q38:- 
```
Which of the following statement(s) is/are TRUE regarding Java Servelets ? (a) A Java Servlet is a server-side component that runs on the web server and extends the capabilities of a server. (b) A Servlet can use the user interface classes like AWT or Swing.
```
Output - Only (a) is TRUE <br>

Q39:- 
```
Which of the following statements is/are TRUE regarding JAVA ? (a) Constants that cannot be changed are declared using the ‘static’ keyword. (b) A class can only inherit one class but can implement multiple interfaces.
```
Output - Only (b) is TRUE. <br>

Q40:- 
```
Class Test {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.start();
    }
    void start() {
        String stra = ”do”;
            String strb = method(stra);
        System.out.print(“: ”+stra + strb);
    }
    String method(String stra) {
        stra = stra + ”good”;
        System.out.print(stra);
        return“ good”;
    }
}
```
Output - dogood : dogood <br>

Q41:- 
```
Which of these is a super class of all errors and exceptions in the Java language?
```
Output - Throwable <br>

Q42:- 
```
1   public class While
2   {
3    public void loop()
4      {
5      int x = 0;
6       while(1)
7         {
8         System.out.println("x plus one is" +(x+1));
9        }
10     }
11  }
```
Output - There is syntax error in line no. 6<br>

Q43:- 
```
Java uses threads to enable the entire environment to be ______.
```
Output - Asynchronous<br>

Q44:-  
```
The built-in base class in Java, which is used to handle all exceptions is
```
Output - Throwable <br>

Q45:- 
```
Which of the following is used to make an Abstract class?
```
Output - Making atleast one member function as pure virtual function<br>

Q46:- 
```
We can make a class abstract by
```
Output - Making at least one member function as pure virtual function<br>

Q47:- 
```
In Java, when we implement an interface method, it must be declared as:
```
Output - Public <br>

Q48:- 
```
Which one of the following is correct?
```
Output - Applets are embedded in another applications<br>

Q49:- 
```
//precondition: x>=0
public void demo(int x)
{
System.out.print(x % 10);
if (x % 10 != 0)
{
demo(x/10);
}
System.out.print(x%10);
}
```
Output - 43211234

Q50:- 
```
class simple
{
public static void main(String[ ] args)
{
simple obj = new simple( );
obj.start( );
}
void start( )
{
long [ ] P= {3, 4, 5};
long [ ] Q= method (P);
System.out.print (P[0] + P[1] + P[2]+”:”);
System.out.print (Q[0] + Q[1] + Q[2]);
}
long [ ] method (long [ ] R)
{
R [1]=7;
return R;
}
} //end of class
```
Output - 15 : 15