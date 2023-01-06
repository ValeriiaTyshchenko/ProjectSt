package hm_employees;

public class MainEmployees {
  public static void main(String[] args) {
    Manager manager = new Manager("Noah Boss", 1, hw_employees.Consts.MANAGER_TYPE, "03/04/1981", "Ottawa", hw_employees.Consts.MANAGER_DEFAULT_SALARY);
    Accountant accountant1 = new Accountant("William Boucher", 2, hw_employees.Consts.ACCOUNTANT_TYPE, "06/07/1969", "Toronto", hw_employees.Consts.ACCOUNTANT_DEFAULT_SALARY);
    Accountant accountant2 = new Accountant("Andrew Belanger", 3, hw_employees.Consts.ACCOUNTANT_TYPE, "13/09/1976", "Toronto", hw_employees.Consts.ACCOUNTANT_DEFAULT_SALARY);
    Accountant accountant3 = new Accountant("Olivia Anderson", 4, hw_employees.Consts.ACCOUNTANT_TYPE, "19/08/1980", "Kitchener", hw_employees.Consts.ACCOUNTANT_DEFAULT_SALARY);
    Accountant accountant4 = new Accountant("Julia Cameron", 5, hw_employees.Consts.ACCOUNTANT_TYPE, "22/06/1983", "Oshawa", hw_employees.Consts.ACCOUNTANT_DEFAULT_SALARY);
    Accountant accountant5 = new Accountant("Liam Baker", 6, hw_employees.Consts.ACCOUNTANT_TYPE, "30/11/1987", "Montreal", hw_employees.Consts.ACCOUNTANT_DEFAULT_SALARY);
    Clerk clerk1 = new Clerk("Charlotte Simson", 7, hw_employees.Consts.CLERK_TYPE, "01/12/1989", "Toronto", hw_employees.Consts.CLERK_DEFAULT_SALARY);
    Clerk clerk2 = new Clerk("Emma Watson", 8, hw_employees.Consts.CLERK_TYPE, "14/08/1992", "Ottawa", hw_employees.Consts.CLERK_DEFAULT_SALARY);
    Clerk clerk3 = new Clerk("Judy Riopelle", 9, hw_employees.Consts.CLERK_TYPE, "23/10/1987", "Montreal", hw_employees.Consts.CLERK_DEFAULT_SALARY);
    System.out.println(manager.toString());
    System.out.println(clerk1.toString());
    System.out.println(clerk2.toString());
    System.out.println(clerk3.toString());
    System.out.println(accountant1.toString());
    System.out.println(accountant2.toString());
    System.out.println(accountant3.toString());
    System.out.println(accountant4.toString());
    System.out.println(accountant5.toString());


    manager.hireEmployees();
    manager.receiveSalary();
    accountant1.openNewAccount();
    accountant2.closeAccount();
    accountant3.createReports();
    clerk1.callToCustomer();
    clerk2.answerIncomingCall();
    clerk2.receiveSalary();

    accountant3.setName("Olivia Johns");
    System.out.println(accountant3.toString());

  }

}

