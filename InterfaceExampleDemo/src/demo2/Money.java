package demo2;

// Cloneable 是一个"标记接口"：里面没有任何抽象方法，
// 只是告诉 JVM："这个类的对象允许被 clone() 拷贝"
// 不实现它就直接调 clone()，会抛 CloneNotSupportedException

//Cloneable是一个标记接口，里面没有任何抽象方法，
//只是告诉JVM：“这个类的对象允许被clone()拷贝”
//不实现它就直接调 clone()，会抛 CloneNotSupportedException
public class Money implements Cloneable {
    public double money = 9.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
