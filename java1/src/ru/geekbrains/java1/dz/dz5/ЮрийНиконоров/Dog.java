package ru.geekbrains.java1.dz.dz5.ЮрийНиконоров;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    private float actionSwim;
    private float actionJump;
    private float actionRun;

    public Dog(String name, float actionSwim, float actionJump, float actionRun) {
        super.setName(name);
        this.actionSwim = actionSwim;
        this.actionJump = actionJump;
        this.actionRun = actionRun;
    }

    public void actionRun(float temp) {
        if (this.actionRun >= temp) {
            System.out.println("Результат действия выполнен:" + super.getName() + " пробежал(а) " + temp + "Км");
        }
        else {
            System.out.println("Результат действия невыполнен:" + super.getName() + " преодолел(а) только " + this.actionRun + "Км из " + temp + "Км");
        }
    }

    public void actionSwim(float temp){
        if (this.actionSwim >= temp) {
            System.out.println("Результат действия выполнен:" + super.getName() + " проплыл(а) " + temp + "Км");
        }
        else {
            System.out.println("Результат действия невыполнен:" + super.getName() + " проплыл(а) только " + this.actionSwim + "Км из " + temp + "Км");
        }
    }

    public void actionJump(float temp){
        if (this.actionJump>= temp) {
            System.out.println("Результат действия выполнен:" + super.getName() + " перепрыгнул(а) " + temp + "м");
        }
        else {
            System.out.println("Результат действия невыполнен:" + super.getName() + " не перепрыгнул(а) " + this.actionJump + "м");
        }
    }


}
