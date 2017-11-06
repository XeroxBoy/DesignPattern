package factory;

import bean.character;
import bean.technician;
import factoryInter.characterFac;

/**
 * Created by AlexAnderIch on 2017/11/6.
 */
public class technicianFac implements characterFac {
    @Override
    public character createCharacter() {
        return new technician();
    }
}
