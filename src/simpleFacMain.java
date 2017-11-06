import simpleBean.People;
import simpleFactory.PeopleFactory;

import java.util.Scanner;

public class simpleFacMain {

    public static void main(String[] args) {
        PeopleFactory peopleFac=new PeopleFactory();
        Scanner sc=new Scanner(System.in);
        String choose=sc.nextLine();
        People people=peopleFac.createPeople(choose);
        people.say();
    }
}
