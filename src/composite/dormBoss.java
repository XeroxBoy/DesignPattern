package composite;

import java.util.ArrayList;

/**
 * Created by AlexAnderIch on 2017/12/4.
 */
public class dormBoss implements Polisher{
    private ArrayList<Polisher> student=new ArrayList();
        public void add(Polisher p){
        student.add(p);
    }
    public void remove(int i){
        student.remove(i);
    }
    public Polisher getChild(int i){
        return (Polisher) student.get(i);
    }
    @Override
    public void polish() {
        for(int i=0;i<student.size();i++){
            student a= (composite.student) student.get(i);
            a.polish();
        }
    }
}
