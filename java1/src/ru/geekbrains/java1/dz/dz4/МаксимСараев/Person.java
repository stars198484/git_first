package ru.geekbrains.java1.dz.dz4.МаксимСараев;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Person {
    private String fullName;
    private String post;
    private String mail;
    private String phone;
    private double amount;
    private int age;

    public Person(String fullName, String post, String mail, String phone, double amount, int age) {
        this.fullName = fullName;
        this.post = post;
        if (isCheckMail(mail)) this.mail = mail;
        this.phone = phone;
        if (isCheckAmount(amount)) this.amount = amount;
        if (isCheckAge(age)) this.age = age;
    }

    private static boolean isCheckMail(String mail) {
        if (mail.contains("@"))
            return true;
        return false;
    }

    private static boolean isCheckAmount(double amount) {
        if (amount > 0)
            return true;
        return false;
    }

    private static boolean isCheckAge(int age) {
        if (age > 0)
            return true;
        return false;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setMail(String mail) {
        if (isCheckMail(mail)) {
            this.mail = mail;}
        else {
            System.out.println("Адрес почты должен содержать '@'");
        }
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAmount(double amount) {
        if (isCheckAmount(amount)) {
            this.amount = amount;}
        else {
            System.out.println("Оклад не может быть меньше 0");
        }
    }

    public void setAge(int age) {
        if (isCheckAge(age)) {
            this.age = age;}
        else {
            System.out.println("Возраст не может быть меньше 0");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public String getPost() {
        return post;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public double getAmount() {
        return amount;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", post='" + post + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", amount=" + amount +
                ", age=" + age +
                '}';
    }
}