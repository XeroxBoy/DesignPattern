package simpleFactory;

import simpleBean.People;

import simpleBean.*;

import java.util.Random;

/**
 * Created by AlexAnderIch on 2017/11/6.
 */
 enum people{
    Boy,Girl
}
public class PeopleFactory {
    public People createPeople(String initWord){
        int init=3;
        if(initWord.equals("Boy"))
            init=people.Boy.ordinal();
        if(initWord.equals("Girl"))
            init=people.Girl.ordinal();
        if(initWord.equals("anyone"))
            init= (int) (Math.random()*2);
        switch(init) {
            case 0:return new boy();
            case 1:return new girl();

            default:break;
        }
        System.out.println("输入有误");
        return null;
    }
}
