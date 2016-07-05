package ru.geekbrains.java1.dz.dz8.ПавелСуходоев;

/**
 * Created by xcyxoux on 02.06.16.
 */
public class Maths {

    private float firstNumber;
    private float secondNumber;

    public void setSecondNumber(float secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(float firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String calculate(char operation) {
        float result = 0;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    return "Ошибка";
                }
                result = firstNumber / secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
        }
        //для того, чтобы повторное нажатие на = прибавляло к результату второй операнд
        firstNumber = result;
        return String.valueOf(result);
    }

    public void clearFields() {
        firstNumber = 0;
        secondNumber = 0;
    }

    public boolean operandsSet() {
        return true;
    }

    public void swapOperands() {
        float tmp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = tmp;
    }
}
