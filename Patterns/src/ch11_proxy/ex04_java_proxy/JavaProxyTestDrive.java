package ch11_proxy.ex04_java_proxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class JavaProxyTestDrive {
    HashMap<String, Person> datingDB = new HashMap<String, Person>();

    public JavaProxyTestDrive() {
        initializeDatabase();
    }

    public static void main(String[] args) {
        JavaProxyTestDrive test = new JavaProxyTestDrive();
        test.drive();
    }

    public void drive() {
        Person joe = getPersonFromDatabase("Joe Javabean");

        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("Bowling, Go");
        System.out.println("Interests Set From Owner Proxy");
        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("Can't Set Rating from Owner Proxy");
        }
        System.out.println("Rating is " + ownerProxy.getGeekRating());

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("Bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't Set Interests from Non Owner Proxy");
        }
        nonOwnerProxy.setGeekRating(3);
        System.out.println("Rating Set from Non Owner Proxy");
        System.out.println("Rating is " + nonOwnerProxy.getGeekRating());
    }

    Person getPersonFromDatabase(String name) {
        return datingDB.get(name);
    }

    Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    void initializeDatabase() {
        Person joe = new PersonImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("Cars, Computers, Music");
        joe.setGeekRating(7);
        datingDB.put(joe.getName(), joe);

        Person kelly = new PersonImpl();
        kelly.setName("Kelly Closure");
        kelly.setInterests("Ebay, Movies, Music");
        kelly.setGeekRating(6);
        datingDB.put(kelly.getName(), joe);
    }
}
