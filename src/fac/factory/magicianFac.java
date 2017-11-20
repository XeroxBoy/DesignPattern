package fac.factory;

import fac.bean.character;
import fac.bean.magician;
import fac.factoryInter.characterFac;

/**
 * Created by AlexAnderIch on 2017/11/6.
 */
public class magicianFac implements characterFac {
    @Override
    public character createCharacter() {
        return new magician();
    }
}
