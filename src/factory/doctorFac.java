package factory;

import bean.character;
import bean.doctor;
import factoryInter.characterFac;

/**
 * Created by AlexAnderIch on 2017/11/6.
 */
public class doctorFac implements characterFac {
    public character createCharacter() {
        return new doctor();
    }
}
