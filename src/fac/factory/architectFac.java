package fac.factory;

import fac.bean.architect;
import fac.bean.character;
import fac.factoryInter.characterFac;

/**
 * Created by AlexAnderIch on 2017/11/6.
 */
public class architectFac implements characterFac {
    @Override
    public character createCharacter() {
        return new architect();
    }
}
