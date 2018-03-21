/*
* @Author: nianko
* @Date:   2018-03-20 14:34:41
* @Last Modified by:   nianko
* @Last Modified time: 2018-03-20 14:49:55
*/

//一个源文件中只能有一个public类
//一个源文件可以有多个非public类
//源文件的名称应该和public类的类名保持一致

public class Pubby{
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
    }
}