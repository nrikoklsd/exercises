import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("nazar",18));
        list.add(new Person("vova", 67));
        list.add(new Person("vlad", 17));
        list.add(new Person("rostik", 67));
        list.add(new Person("igor", 17));
        list.add(new Person("petro", 67));
        list.add(new Person("stepan", 17));
        list.add(new Person("vasyl", 67));
        list.add(new Person("andriy", 17));


        printAllOlder18(list);
    }
    public static void printAllOlder18(List<Person> list){

        list.stream().filter(s-> s.getAge()>=18).sorted(Comparator.comparing(Person::getName).reversed()).map(a->a.getName()+" "+a.getAge()).forEach(System.out::println);
        list.stream().filter(s->s.getName().startsWith("v")).map(a->a.getName()+"hello").forEach(System.out::println);
    }
}
