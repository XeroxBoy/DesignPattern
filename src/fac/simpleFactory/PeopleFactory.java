package fac.simpleFactory;

import fac.simpleBean.People;

import fac.simpleBean.*;

/**
 * Created by AlexAnderIch on 2017/11/6.
 */
 enum people{
    Boy,Girl
}
public class PeopleFactory {
    public People createPeople(String initWord){
        int init=3;//用init代表性别 便于用随机数来实现随机
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
