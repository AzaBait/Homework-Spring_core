package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Animal animal = context.getBean("myPet", Horse.class);

        Person person1 = context.getBean("myPerson", Person.class);
        Person person2 = context.getBean("myFriend", Person.class);
//        person1.callYourFavoriteAnimal();
        System.out.println(person1.getName());
        person1.getAnimal().animalPlus();
        System.out.println(person2.getName());
        person2.getAnimal().animalPlus();




//        System.out.println(person2.getAge());


        context.close();

    }
}
