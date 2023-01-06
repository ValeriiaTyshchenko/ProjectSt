package hm_employees;

public class Clerk extends employees{


    public Clerk(String name, int id, String title, String DOB, String address, double salary) {
        super(name, id, hw_employees.Consts.CLERK_TYPE, DOB, address, hw_employees.Consts.CLERK_DEFAULT_SALARY);
    }

    public void callToCustomer(){
        System.out.println(String.format("Clerk %s will call to customers.", getName()));
    }

    public void answerIncomingCall(){
        System.out.println(String.format("Clerk %s will answer incoming calls.", getName()));
    }

}
