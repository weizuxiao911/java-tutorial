### Java 继承

- 继承是所有 OOP 语言和 Java 语言不可缺少的组成部分。

- 继承是 Java 面向对象编程技术的一块基石，是面向对象的三大特征之一，也是实现软件复用的重要手段，继承可以理解为一个对象从另一个对象获取属性的过程。

- 如果类 A 是类 B 的父类，而类  B 是类 C 的父类，我们也称类 C 是 A 的子类，类 C 是从类 A 继承而来的。在 Java 中，类的继承是单一继承，也就是说，一个子类只能拥有一个父类。

- 继承中最常使用的两个关键字是 extends 和 implements 。

- 这两个关键字的使用决定了一个对象和另一个对象是否是 IS-A (是一个)关系。

- 通过使用这两个关键字，我们能实现一个对象获取另一个对象的属性。

- 所有 Java 的类均是由 java.lang.Object 类继承而来的，所以 Object 是所有类的祖先类，而除了 Object 外，所有类必须有一个父类。

- 通过 extends 关键字可以申明一个类是继承另外一个类而来的，一般形式如下：

// A.java
```
public class A {
    private int i;
    protected int j;
 
    public void func() {
 
    }
}
```
 
// B.java
```
public class B extends A {
    public int z;

    public void fund(){

    }
    
}
```
- 以上的代码片段说明，类 B 由类 A 继承而来的，类 B 是类 A 的子类。而类 A 是 Object 的子类，这里可以不显示地声明。

- 作为子类，类 B 的实例拥有类 A 所有的成员变量，但对于 private 类型的成员变量类 B 却没有访问权限，这保障了类 A 的封装性。

- IS-A 关系
- IS-A 就是说：一个对象是另一个对象的一个分类。

下面是使用关键字 extends 实现继承。
```
public class Animal{
}

public class Mammal extends Animal{
}

public class Reptile extends Animal{
}

public class Dog extends Mammal{
}
```
基于上面的例子，以下说法是正确的：

- Animal 类是 Mammal 类的父类。
- Animal 类是 Reptile 类的父类。
- Mammal 类和 Reptile 类是 Animal 类的子类。
- Dog 类既是 Mammal 类的子类又是 Animal 类的子类。
分析以上示例中的 IS-A 关系，如下：
```
Mammal IS-A Animal
Reptile IS-A Animal
Dog IS-A Mammal
因此 : Dog IS-A Animal
```
- 通过使用关键字 extends ，子类可以继承父类的除 private 属性外所有的属性。

- 我们通过使用 instanceof 操作符，能够确定 Mammal IS-A Animal

实例
```
public class Dog extends Mammal{
   public static void main(String args[]){

      Animal a = new Animal();
      Mammal m = new Mammal();
      Dog d = new Dog();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
   }
}
```
以上实例编译运行结果如下：
```
true
true
true
```
介绍完 extends 关键字之后，我们再来看下 implements 关键字是怎样使用来表示 IS-A 关系。

- Implements 关键字在类继承接口的情况下使用， 这种情况不能使用关键字 extends 。

实例
```
public interface Animal {}

public class Mammal implements Animal{
}

public class Dog extends Mammal{
}
```
instanceof 关键字
- 可以使用 instanceof 运算符来检验 Mammal 和 dog 对象是否是 Animal 类的一个实例。
```
interface Animal{}

class Mammal implements Animal{}

public class Dog extends Mammal{
   public static void main(String args[]){

      Mammal m = new Mammal();
      Dog d = new Dog();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
   }
} 
```
以上实例编译运行结果如下：
```
true
true
true
```
HAS-A 关系
- HAS-A 代表类和它的成员之间的从属关系。这有助于代码的重用和减少代码的错误。

例子
```
public class Vehicle{}
public class Speed{}
public class Van extends Vehicle{
	private Speed sp;
} 
```
- Van 类和 Speed 类是 HAS-A 关系( Van 有一个 Speed )，这样就不用将 Speed 类的全部代码粘贴到 Van 类中了，并且 Speed 类也可以重复利用于多个应用程序。

- 在面向对象特性中，用户不必担心类的内部怎样实现。

- Van 类将实现的细节对用户隐藏起来，因此，用户只需要知道怎样调用 Van 类来完成某一功能，而不必知道 Van 类是自己来做还是调用其他类来做这些工作。

- Java 只支持单继承，也就是说，一个类不能继承多个类。

下面的做法是不合法的：

public class extends Animal, Mammal{} 
- Java 只支持单继承（继承基本类和抽象类），但是我们可以用接口来实现（多继承接口来实现），代码结构如下：

public class Apple extends Fruit implements Fruit1, Fruit2{}
- 一般我们继承基本类和抽象类用 extends 关键字，实现接口类的继承用 implements 关键字。


