package fac.factory;

import fac.bean.character;
import fac.bean.doctor;
import fac.factoryInter.characterFac;

/**
 * Created by AlexAnderIch on 2017/11/6.
 */
public class doctorFac implements characterFac {
    public character createCharacter() {
        return new doctor();
    }
}
