package Builder;

public class Employee {

    private final String firstName; //mandatory
    private final String lastName;//mandatory
    private final int age;//opt
    private final String address;//opt

    Employee(EmployeeBuilder eb){
        this.firstName = eb.firstName;
        this.lastName = eb.lastName;
        this.age = eb.age;
        this.address = eb.address;
    }
    @Override
    public String toString(){
        return
                "Employee " +
                        this.firstName +
                        this.lastName +
                        this.age +
                        this.address;
    }

    public static class EmployeeBuilder {

        private final String firstName;
        private final String lastName;
        private  int age;
        private String address;

        public EmployeeBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public EmployeeBuilder age(int age){
            this.age = age;
            return this;
        }
        public EmployeeBuilder address(String address){
            this.address = address;
            return this;
        }

        public Employee build(){
            Employee employee = new Employee(this);
            return employee;
        }

    }

}
