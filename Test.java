/*
* @Author: nianko
* @Date:   2018-03-20 16:18:55
* @Last Modified by:   nianko
* @Last Modified time: 2018-03-21 17:44:20
*/

import java.util.Scanner;

class Animal{
    private int id;
    private String name;

    public Animal(int mid, String mname){
        this.id = mid;
        this.name = mname;
    }

    public void eat(){
        System.out.println(name+"正在吃\n");
    }

    public void sleep(){
        System.out.println(name+"正在睡\n");
    }

    public void introme(){
        System.out.println("大家好！我是"+ id + "号, 我的名字是" + name + ".\n");
    }
}

class Penguin extends Animal{
    public Penguin(int mid, String mname){
        super(mid, mname);
        System.out.println("企鹅:\n");
    }

    public void niaolei(){
        System.out.println("hehe");
    }
    
}

class Mouse extends Animal{
    public Mouse(int mid, String mname){
        super(mid, mname);
        System.out.println("老鼠:\n");
    }
}

public class Test{
    public static void main(String[] args){
        Animal penguin = new Penguin(1, "Nianko");
        penguin.eat();
        penguin.sleep();
        penguin.introme();
        penguin.niaolei();
        Animal mouse = new Mouse(2, "Jerry");
        mouse.eat();
        mouse.sleep();
        mouse.introme();
    }
}