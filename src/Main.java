import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Akyl", 20);
        Person person2 = new Person("Erlan", 30);
        Person person3 = new Person("Baatyr", 29);
        Person person4 = new Person("Manas", 31);


        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(person1);
        hashSet.add(person2);


        TreeSet<Person> treeSet = new TreeSet<>(hashSet);
        hashSet.clear();
        System.out.println(hashSet);
        treeSet.add(person3);
        treeSet.add(person4);
            int a = 0;
            for (Person p: treeSet) {
            int b =p.getAge() ;
            a += b;
            System.out.println(p);
            System.out.println(a);


        }
    }
}



