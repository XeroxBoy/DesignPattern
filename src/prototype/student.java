package prototype;

/**
 * Created by AlexAnderIch on 2017/11/20.
 */
public class student extends Object implements Cloneable {
private student student=new student();
private student(){}
    @Override
    public Object clone() throws CloneNotSupportedException {
        return student.clone();
    }
}
