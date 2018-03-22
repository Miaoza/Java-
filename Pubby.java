/*
* @Author: nianko
* @Date:   2018-03-20 14:34:41
* @Last Modified by:   nianko
* @Last Modified time: 2018-03-22 18:14:28
*/

//一个源文件中只能有一个public类
//一个源文件可以有多个非public类
//源文件的名称应该和public类的类名保持一致

public class Pubby extends HelloWord{
    int pubbyAge;
    //构造方法的名称必须与类同名
    public Pubby(String name){
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name);
    }

    public void setAge(int age){
        pubbyAge = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄为 : " + pubbyAge);
        return pubbyAge;
    }

    public static void main(String[] args){
        // 下面的语句将创建一个Puppy对象
        Pubby myPubby = new Pubby("Xiao Bai");//不能用单引号
        /* 通过方法来设定age */
        myPubby.setAge(2);
        /* 调用另一个方法获取age */
        myPubby.getAge();
        /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + myPubby.pubbyAge );

        //Animal dog = new Dog(3, "白白"); error: Animal没有 saying 方法
        Dog dog = new Dog(3, "白白");
        dog.eat();
        dog.saying();

        Demo atest = new Demo();
        // atest.main();  error: 子类不可调用父类的main方法
        System.out.println("aaaaaaaaaa");
        atest.test();
    }
}

class Dog extends Animal{
    public Dog(int mid, String mname){
        super(mid, mname);
        System.out.println("小狗:");
    }

    public void saying(){
        System.out.println("白白正在汪汪汪");
    }
}

class Demo extends HelloWord{
    public Demo(){
        super();
        System.out.println(this.name);  //继承父类变量
        this.test();
    }

    public static void main(String[] args){
        System.out.println("This is main method of child class");
    }
}
