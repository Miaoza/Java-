/*
* @Author: nianko
* @Date:   2018-03-26 18:10:06
* @Last Modified by:   nianko
* @Last Modified time: 2018-03-27 12:15:23
*/

// 多态
// 1.子类以父类的身份出现
// 2.子类在工作时以自己的方式来实现
// 3.子类以父类的身份出现时，子类特有的属性和方法不可以使用

class Animal{
    public String name;

    public Animal(String name){
        this.name = name;
    }

    public void Shout(){
        System.out.println("大家好，我叫"+name+"，"+GetShout());
    }

    protected String GetShout(){
        return "";
    }
}

//设计模式--模板方法

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    public String GetShout(){
        return "我是小猫猫，喵喵喵";
    }

    // public void Shout(){
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
        return "我是老羊羔，咩咩咩";
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
        new Sheep("唐老鸭"),
    };

    public static void main(String[] args){
        for(Animal animal: sign_list){
            animal.Shout();
        }
    }
}

// 面向对象三大特性：封装、继承、多态
// 多态存在的三个必要条件：
// 继承
// 重写
// 父类引用指向子类对象