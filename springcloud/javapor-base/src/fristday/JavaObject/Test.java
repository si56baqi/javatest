package fristday.JavaObject;

public class Test {
   // int age;
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args){
        Test test = new Test();
        test.pupAge();
        int a = 10;
        int b = 20;
        int c =0;
        /*int d = 25;
        System.out.println("a + b = " + (a + b) );//30
        System.out.println("a - b = " + (a - b) );//-10
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );*/

        c = a + b;
        System.out.println("c = a + b = " + c );//30
        c += a ;//c=c+a
        System.out.println("c += a  = " + c );//40
        c -= a ;//c=c-a 40-10
        System.out.println("c -= a = " + c );//30
        c *= a ;//c=c*a 30*10
        System.out.println("c *= a = " + c );//300
        a = 10;
        c = 15;
        c /= a ;//c=c/a
        System.out.println("c /= a = " + c );
        a = 10;
        c = 15;
        c %= a ;//c=c%a
        System.out.println("c %= a  = " + c );
        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c &= a ;
        System.out.println("c &= a  = " + c );
        c ^= a ;
        System.out.println("c ^= a   = " + c );
        c |= a ;
        System.out.println("c |= a   = " + c );
    }
}
/*
*
Java 局部变量
局部变量声明在方法、构造方法或者语句块中；
局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
访问修饰符不能用于局部变量；
局部变量只在声明它的方法、构造方法或者语句块中可见；
局部变量是在栈上分配的。
局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
* */
