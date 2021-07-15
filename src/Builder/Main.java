package Builder;

//having a 10 comp constructor does not scale
//piecewise construction of an object
//for creating immutable classes
//with large state of attributes
public class Main {
    public static void main(String[] args){
        Employee employee1 = new Employee.EmployeeBuilder(
                "a", "b"
        ).age(3).address("street").build();
        Employee employee2 = new Employee.EmployeeBuilder(
                "c", "d"
        ).build();

        System.out.println(employee1);
        System.out.println(employee2);

    }
}
