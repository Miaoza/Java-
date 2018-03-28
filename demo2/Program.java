/*
* @Author: nianko
* @Date:   2018-03-27 17:14:55
* @Last Modified by:   nianko
* @Last Modified time: 2018-03-28 15:20:51
*/

// java.util.Scanner 是 Java5 的新特征，我们可以通过 Scanner 类来获取用户的输入
import java.util.Scanner;
// import java.io.*;

// 运算类
abstract class Operation{
    private double number_a = 0;
    private double number_b = 0;

    public void setNumberA(double num){
        this.number_a = num;
    }

    public double getNumberA(){
        return number_a;
    }

    public void setNumberB(double num){
        this.number_b = num;
    }

    public double getNumberB(){
        return number_b;
    }

    abstract public double getResult();
}

// 加法类，继承运算类
class AddOperation extends Operation{
    public double getResult(){
        return this.getNumberA()+this.getNumberB();
    }
}

// 减法类，继承运算类
class SubOperation extends Operation{
    public double getResult(){
        return this.getNumberA()-this.getNumberB();
    }
}

// 乘法类，继承运算类
class MulOperation extends Operation{
    public double getResult(){
        return this.getNumberA()*this.getNumberB();
    }
}

// 除法类，继承运算类
class DivOperation extends Operation{
    public double getResult() throws ArithmeticException{
        if(0==this.getNumberB()){
            throw new ArithmeticException("除数不能为0");
        }
        return this.getNumberA()/this.getNumberB();
    }
}

// 简单工厂模式
class OperationFactory{
    public static Operation createOperate(String operate){
        Operation per = null;
        switch(operate){
            case "+":
                per = new AddOperation();
                break;
            case "-":
                per = new SubOperation();
                break;
            case "*":
                per = new MulOperation();
                break;
            case "/":
                per = new DivOperation();
                break;
            default:
                break;
        }
        return per;
    } 
}

// class Operate{
//     public void calculate(int n1, String symbol, int n2){
//         switch(symbol){
//             case "+":
//                 System.out.println("计算结果："+(n1+n2));
//                 break;
//             case "-":
//                 System.out.println("计算结果："+(n1-n2));
//                 break;
//             case "*":
//                 System.out.println("计算结果："+(n1*n2));
//                 break;
//             case "/":
//                 if(0==n2){
//                     System.out.println("计算结果：无穷大");
//                     break;
//                 }
//                 System.out.println("计算结果："+(n1/n2));
//                 break;
//             default:
//                 System.out.println("输入错误！");
//                 break;
//         }
//     }
// }

public class Program{
    public static void main(String[] args){
        Operation per;
        // System.out.println(per);
        per = OperationFactory.createOperate("+");
        per.setNumberA(1);
        per.setNumberB(2);
        System.out.println(per.getResult());

        Operation sub;
        sub = OperationFactory.createOperate("-");
        sub.setNumberA(3);
        sub.setNumberB(5);
        System.out.println(sub.getResult());

        Operation div;
        div = OperationFactory.createOperate("/");
        div.setNumberA(3);
        div.setNumberB(0);
        System.out.println(div.getResult());
        // Scanner scan = new Scanner(System.in);
        // // 从键盘接收数据
        
        // int a = 0;
        // int b = 0;
        // String symbol = "";

        // // next方式接收数字符
        // System.out.print("输入整数：");
        // if (scan.hasNextInt()) {
        //     // 判断输入的是否是整数
        //     a = scan.nextInt();
        //     // 接收整数
        //     // System.out.println("整数数据：" + a);
        // } else {
        //     // 输入错误的信息
        //     System.out.println("输入的不是整数！");
        //     return;
        // }

        // System.out.print("输入运算符号：");
        // if (scan.hasNext()){
        //     symbol = scan.next();
        // }else{
        //     System.out.println("输入的不是字符数据！");
        //     return;
        // }

        // System.out.print("输入整数：");
        // if (scan.hasNextInt()) {
        //     // 判断输入的是否是小数
        //     b = scan.nextInt();
        //     // 接收小数
        //     System.out.println("整数数据：" + b);
        // } else {
        //     // 输入错误的信息
        //     System.out.println("输入的不是整数！");
        //     return;
        // }
        // scan.close();

        // Operate opreate = new Operate();
        // opreate.calculate(a, symbol, b);
    }
}


// 简单工厂
// 简单工厂模式的工厂类一般是使用静态方法，通过接收的参数的不同来返回不同的对象实例
// 不修改代码的话，是无法扩展的，不符合开闭原则
 
// 工厂方法
// 工厂方法模式相当于在简单工厂模式的基础上增加一个抽象工厂
// 只需要增加具体工厂和具体产品即可
// 只有一个抽象产品类
// 具体工厂类只能创建一个具体产品类的实例

// 抽象工厂
// 抽象工厂是应对产品族概念的，多个抽象产品类，每个抽象产品类可以派生出多个具体产品类
// 多个抽象产品类
// 可以创建多个具体产品类的实例




