/*
* @Author: nianko
* @Date:   2018-03-27 15:24:00
* @Last Modified by:   nianko
* @Last Modified time: 2018-03-27 16:34:58
*/

// java集合框架位于java.util包中
import java.util.*;

public class DataStructure{

    // 泛型方法 printArray
    public static <E> void printArray(E[] array){
        // 输出数组元素
        for(E element: array){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static void main(String[] args){
        // ArrayList
        // 该类也是实现了List的接口，实现了可变大小的数组，随机访问和遍历元素时，提供更好的性能。
        // 该类也是非同步的,在多线程的情况下不要使用。ArrayList 增长当前长度的50%，插入删除效率低。
        List<String> list = new ArrayList<String>();
        list.add("Hello World !");
        list.add("Hello Nianko !");
        list.add("Miao ~");

        //第一种遍历方法使用foreach遍历List
        for (String str : list) {            //也可以改写for(int i=0;i<list.size();i++)这种形式
            System.out.println(str);
        }

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        for(int i=0;i<strArr.length;i++){
            System.out.println(strArr[i]);
        }

        //第三种遍历 使用迭代器进行相关遍历
        Iterator<String> ite = list.iterator();
        while(ite.hasNext()){ // 判断下一个元素之后有值
            System.out.println(ite.next());
        }

        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        String[] strArray = {"miao", "mie", "laoyanggao"};
 
        System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组
 
        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组
 
        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组

        System.out.println("\n字符串型数组元素为:");
        printArray( strArray ); // 传递一个字符串型数组
    
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        name.add("avatar");
        age.add(18);
        age.add(26);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);
    }

    // 类型通配符一般是使用?代替具体的类型参数。
    // 例如 List<?> 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类
    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }
    // <? extends T>和<? super T>的区别
    // <? extends T>表示该通配符所代表的类型是T类型的子类。
    // <? super T>表示该通配符所代表的类型是T类型的父类。
}

// 装箱就是把值类型打包到Object引用类型的一个实例中
// 拆箱就是指从对象中提取值类型