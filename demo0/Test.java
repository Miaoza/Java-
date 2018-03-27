/*
* @Author: nianko
* @Date:   2018-03-26 18:10:06
* @Last Modified by:   nianko
* @Last Modified time: 2018-03-27 15:16:56
*/

// 多态
// 1.子类以父类的身份出现
// 2.子类在工作时以自己的方式来实现
// 3.子类以父类的身份出现时，子类特有的属性和方法不可以使用

abstract class Animal{// 抽象类
    public String name;

    public Animal(String name){
        this.name = name;
    }

    public void Shout(){
        System.out.println("大家好，我叫"+name+"，"+GetShout());
    }

    protected abstract String GetShout();  // 抽象方法
}// 设计模式--模板方法

// 抽象类
// 1.抽象类不能实例化
// 2.抽象方法是必须被子类重写的方法
// 3.如果类中包含抽象方法，类就必须定义为抽象类

//抽象类拥有尽可能多的共同代码，尽可能少的数据
//树叶节点应当是具体类，树枝节点均应当是抽象类

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    public String GetShout(){
        return "我是小猫猫，喵喵喵";
    }

    // public void Shout(){ // 重写父类方法
    //     System.out.println("大家好，我叫"+name+"，我是小猫猫，喵喵喵");
    // }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public String GetShout(){
        return "我是小狗狗，汪汪汪";
    }

    // public void Shout(){
    //     System.out.println("大家好，我叫"+name+"，我是小狗狗，汪汪汪");
    // }
}

class Sheep extends Animal{
    public Sheep(String name){
        super(name);
    }

    public String GetShout(){
        return "我是老山羊，咩咩咩";
    }
}

// 接口可以多继承
// 除非实现接口的类是抽象类，否则该类要定义接口中的所有方法
// 接口无法被实例化，但是可以被实现
// 接口不是被类继承了，而是要被类实现
class OldSheep extends Sheep implements Ifly{
    public OldSheep(String name){
        super(name);
    }

    public String GetShout(){
        return "我是老羊羔，咩咩咩";
    }

    public String Fly(String str){
        System.out.println(str);
        return str;
    }
}

public class Test{
    private static Animal[] sign_list = {
        new Cat("Nianko"),
        new Dog("旺财"),
        new Dog("大黄"),
        new Cat("喵咂"),
        new Cat("酱肉"),
        new Cat("黑米"),
        new Sheep("羊羊羊")
    };

    private static OldSheep old_sheep = new OldSheep("愚蠢的老羊羔");
    private static Ifly fly = old_sheep;

    public static void main(String[] args){
        for(Animal animal: sign_list){
            animal.Shout();
        }
        old_sheep.Shout();
        fly.Fly("我是一头会飞的老羊羔, I can fly.");
    }
}

// 面向对象三大特性：封装、继承、多态
// 多态存在的三个必要条件：
// 继承
// 重写
// 父类引用指向子类对象