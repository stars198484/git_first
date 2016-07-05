package ru.geekbrains.java1.dz.dz8.РусланУстиц;

/**
 * Created by darky on 31.05.2016.
 */
public class Operations {
    public enum SimpleOperator {
        SUM("+") {
            @Override
            public double apply(double a, double b) {
                return a + b;
            }
        },
        SUBTRACTION("-") {
            @Override
            public double apply(double a, double b) {
                return a - b;
            }
        },
        MULTIPLY("*") {
            @Override
            public double apply(double a, double b) {
                return a * b;
            }
        },
        DIVISION("/") {
            @Override
            public double apply(double a, double b) {
                return a / b;
            }
        };

        private final String text;

        SimpleOperator(String text) {
            this.text = text;
        }

        public abstract double apply(double a, double b);


        @Override
        public String toString() {
            return text;
        }
    }

    public enum ComplexOperator {
        SQR("sqr") {
            @Override
            public double apply(double a) {
                return Math.pow(a, 2);
            }
        },
        SQRT("sqrt") {
            @Override
            public double apply(double a) {
                return Math.sqrt(a);
            }
        },
        FRACTION("fraction") {
            @Override
            public double apply(double a) {
                return 1.0 / a;
            }
        };

        private final String text;

        ComplexOperator(String text) {
            this.text = text;
        }

        public abstract double apply(double a);

        @Override
        public String toString() {
            return text;
        }
    }
}
