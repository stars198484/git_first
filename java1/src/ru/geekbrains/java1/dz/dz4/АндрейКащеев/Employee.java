package ru.geekbrains.java1.dz.dz4.АндрейКащеев;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
    private String empName;
    private String empDep;
    private String empEmail;
    private String empPhone;
    private int empSalary;
    private int empAge;

    public Employee(String empName, String empDep, String empEmail, String empPhone, int empSalary, int empAge) {
        this.empName = empName;
        this.empDep = empDep;
        this.empEmail = empEmail;
        this.empPhone = empPhone;
        this.empSalary = empSalary;
        this.empAge = empAge;
    }

    public int getEmpAge() {
        return empAge;
    }

    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    public void print() {
        System.out.println(this.empName + ';' + this.empDep + ';' + this.empEmail + ';' + this.empPhone + ';' + this.empSalary + ';' + this.empAge);
    }
}