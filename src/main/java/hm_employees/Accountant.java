package hm_employees;

public class Accountant extends employees {


    public Accountant(String name, int id, String title, String DOB, String address, double salary) {
        super(name, id, hw_employees.Consts.ACCOUNTANT_TYPE, DOB, address, hw_employees.Consts.ACCOUNTANT_DEFAULT_SALARY);
    }

    public void openNewAccount() {
        System.out.println(String.format("Accountant %s will open a new accounts.", getName()));
    }

    public void closeAccount() {
        System.out.println(String.format("Accountant %s will close accounts.", getName()));
    }

    public void createReports() {
        System.out.println(String.format("Accountant %s will create reports.", getName()));
    }


}

