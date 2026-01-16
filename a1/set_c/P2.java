package set_c;

import java.util.*;

class Student{
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    String getName(){
        return name;
    }

    int getRollNo(){
        return rollNo;
    }
}

class MyComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}
public class P2 {
    public static void main(String[] args) {

    TreeSet<Student> ts = new TreeSet<>(new MyComparator());
    Scanner sc = new Scanner(System.in);
    int ch;
    ts.add(new Student(2, "Sandip"));
    ts.add(new Student(10,"Raj"));

    do{
        System.out.println("\nMenu driven program");
        System.out.println("1.Add");
        System.out.println("2.Display");
        System.out.println("\n3.Search by roll number");
        System.out.println("\n4.Delete by roll number");
        System.out.println("5.Exit");
        System.out.println("\nEnter your choice : ");
        ch = sc.nextInt();

        switch(ch){
            case 1:System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    ts.add(new Student(roll, name));
                    System.out.println("Student added successfully.");
                    break;

            case 2: Iterator<Student> itr = ts.iterator();

                    while(itr.hasNext()){
                        Student s = itr.next();
                        System.out.println("\nRoll no : " + s.getRollNo() + " \nName : "+s.getName());
                    }
                    break;

            case 3: System.out.println("Enter the roll number to be searched: ");
                    int target = sc.nextInt();
                    boolean flag = false;

                    itr = ts.iterator();
                    
                    while(itr.hasNext()){
                        Student s = itr.next();
                        if(s.getRollNo() == target){
                            System.out.println("\nStudent with roll no "+target+" found");
                            flag = true;
                            break;
                        }
                    }

                    if(!flag){
                        System.out.println("\nNo Student found with "+target);
                    }
                    break;
            case 4: System.out.println("\nEnter the roll number to be deleted: ");
                    target = sc.nextInt();
                    flag = false;
                    itr = ts.iterator();
                    
                    while(itr.hasNext()){
                        Student s = itr.next();
                        if(s.getRollNo() == target){
                            itr.remove();
                            flag = true;
                            break;
                        }
                    }

                    if(!flag){
                        System.out.println("\nNo Student found with "+target);
                    }
                    break;

            case 5: System.out.println("\nExiting the program");
                    break;
            default :System.out.println("\nEnter a valid choice");
        }
    }while(ch != 5);
  }
}

