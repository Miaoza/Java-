/*
* @Author: nianko
* @Date:   2018-03-20 14:06:04
* @Last Modified by:   nianko
* @Last Modified time: 2018-03-20 15:34:04
*/
public class HelloWord{ //类 HelloWord 是公共的, 应在名为 HelloWord.java 的文件中声明
    //main 是一个程序的入口，一个 java 程序运行必须而且有且仅有一个 main 方法
    //程序都是从main方法开始执行
    //Java 程序的 main() 方法必须设置成公有的，否则，Java 解释器将不能运行该类
    public static void main(String[] args){
        System.out.println("Hello Word !");
    }
}
//$ javac HelloWorld.java
//$ java HelloWorld
//javac 后面跟着的是java文件的文件名，例如 HelloWorld.java。 该命令用于将 java 源文件编译为 class 字节码文件，如： javac HelloWorld.java
//运行javac命令后，如果成功编译没有错误的话，会出现一个 HelloWorld.class 的文件
//java 后面跟着的是java文件中的类名,例如 HelloWorld 就是类名，如: java HelloWorld
//java命令后面不要加.class


//String[] args
//java HelloWord runoob
//相当于给数组传入了一个 runoob 字符串
//args[0] 是你传入的第一个参数，args[1]是传入的第二个参数