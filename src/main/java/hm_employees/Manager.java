package hm_employees;

public class Manager extends employees{


    public Manager(String name, int id, String title, String DOB, String address, double salary) {
        super(name, id, hw_employees.Consts.MANAGER_TYPE, DOB, address, hw_employees.Consts.MANAGER_DEFAULT_SALARY);
    }

 public void hireEmployees(){
 System.out.println(String.format("Manager %s will hire employees.", getName()));
 }

 public void fireEmployees(){
       System.out.println(String.format("Manager %s will fire employees", getName()));}



}
