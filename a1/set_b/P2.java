import java.util.*;

class Employee implements Comparable<Employee>{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Employee e){
        String name1 = this.name;
        String name2 = e.getName();

        return name1.compareTo(name2);
    }
}
public class P2{
    public static void main(String[] args) {
        TreeSet<Employee> ts = new TreeSet<>();
        ts.add(new Employee(1, "Raj"));
        ts.add(new Employee(10, "Sandip"));
        ts.add(new Employee(100,"Akash"));
        ts.add(new Employee(23,"Vansh"));

        Iterator<Employee> itr = ts.iterator();

        while(itr.hasNext()){
            Employee e = itr.next();
            System.out.println(e.getId() + " : " + e.getName());
        }
    }
}