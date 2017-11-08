import bean.character;
import factory.*;
import factoryInter.characterFac;

import java.util.Scanner;

/**
 * Created by AlexAnderIch on 2017/11/6.
 */
public class facMain {
 public static void main(String[] args) {
     while (true) {
         Scanner sc = new Scanner(System.in);
         String createWord = sc.nextLine();
         characterFac factory;
         character character = null;
         switch (createWord) {
             case "architect":
                 factory = new architectFac();
                 character = factory.createCharacter();
                 break;
             case "cook":
                 factory = new cookFac();
                 character = factory.createCharacter();
                 break;
             case "doctor":
                 factory = new doctorFac();
                 character = factory.createCharacter();
                 break;
             case "goldworker":
                 factory = new goldworkerFac();
                 character = factory.createCharacter();
                 break;
             case "magician":
                 factory = new magicianFac();
                 character = factory.createCharacter();
                 break;
             case "technician":
                 factory = new technicianFac();
                 character = factory.createCharacter();
                 break;
             default:
                 break;
         }
         if (character != null)
             character.say();
         else
             System.out.print("输入有误");
     }
 }
    }
