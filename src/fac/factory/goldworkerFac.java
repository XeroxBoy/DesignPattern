package fac.factory;
import fac.bean.character;
import fac.bean.goldworker;
import fac.factoryInter.*;
/**
 * Created by AlexAnderIch on 2017/11/6.
 */
public class goldworkerFac implements characterFac {

    @Override
    public character createCharacter() {
        return new goldworker();
    }
}
