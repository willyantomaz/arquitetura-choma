package system.scheduling.model;

import system.scheduling.interfaces.PersonInterface;
import system.scheduling.model.domain.Provider;
import system.scheduling.model.domain.User;

public abstract class PersonFactory {

    public static PersonInterface createBasicPerson(String personTypeClass) {
        PersonInterface personInterface = null;

        if(personTypeClass.equals("User")){
            personInterface = new User();
        } else if (personTypeClass.equals("Provider")) {
            personInterface = new Provider();
        }
        return personInterface;
    }
}
