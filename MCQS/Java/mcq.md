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

Q1:- 
```
```
Output -