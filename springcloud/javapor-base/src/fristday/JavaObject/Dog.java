package fristday.JavaObject;
/*
 *对象：
 * 是类的一个实例，有状态和行为（每个人为一个对象）
 *类：
 * 类是一个模板，它描述一类对象的行为和状态。（人：man。wman）
 * */
public class Dog {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.call();
        dog.eat();
        dog.name="111111";
    }
    //dog是一个对象，有name，age等状态，call,eat行为
    String name;
    int age;
    public void call(){
        name="KK";
        age=1;
        String fName="ASD";
        System.out.println(name+"======="+age+"======"+fName);
    }
    public void eat(){
        System.out.println("不吃");
    }
}
/*局部变量：
  在方法、构造方法或者语句块中定义的变量被称为局部变量。
  变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
*成员变量：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。
* 成员变量可以被类中方法、构造方法和特定类的语句块访问。
*类变量：类变量也声明在类中，方法体之外，但必须声明为 static 类型。
*
*
* */
