package hm_employees;

public abstract class employees {
    private String name;
    private int id;
    private String title;
    private String DOB;
    private String address;
    private double salary;

    public employees(String name, int id, String title, String DOB, String address, double salary){
        this.name = name;
        this.id = id;
        this.title = title;
        this.DOB = DOB;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDOB() {
        return DOB;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void receiveSalary(){
        System.out.println(name + " your salary " + getSalary() + "$ was sent to your bank account.");


    }

    @Override
    public String toString() {
        String txt = String.format("Employee name: %s, title: %s, address: %s, Birth Date: %s, Salary: %f", name, title, address, DOB, salary);
        return txt;
    }
}
