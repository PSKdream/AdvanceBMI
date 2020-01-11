package advancebmi;

import java.util.Scanner;

public class AdvanceBMI {

    public static void main(String[] args) {
        CalBMI bmi = new CalBMI();
        Scanner input = new Scanner(System.in);
        int choice;
        double wieght, hight;
        System.out.print("Please choice ( 1:Who , 2:Asian ) : ");
        choice = input.nextInt();
        System.out.print("Please input wieght(kg) : ");
        wieght = input.nextDouble();
        System.out.print("Please input hight(m) : ");
        hight = input.nextDouble();
        System.out.println("----------------------------------------");
        System.out.printf("BMI : %.2f \n", bmi.BMI(wieght, hight));
        System.out.println("Weight Categories : " + bmi.BMIstatus(choice, wieght, hight));
        System.out.println("----------------------------------------");
    }
}

class CalBMI {

    public double BMI(double weight, double hight) {
        return (weight / Math.pow(hight, 2));
    }

    public String BMIstatus(int criteria, double weight, double hight) {
        double BmiValues = this.BMI(weight, hight);
        switch (criteria) {
            case 1:
                return this.Who(BmiValues);
            case 2:
                return this.Asian(BmiValues);
            default:
                return "";
        }
    }
    public String BMIstatus(int criteria, double BmiValues) {
        switch (criteria) {
            case 1:
                return this.Who(BmiValues);
            case 2:
                return this.Asian(BmiValues);
            default:
                return "";
        }
    }

    private String Who(double BmiValues) {
        if (BmiValues >= 30) {
            return "Obese";
        } else if (BmiValues >= 25) {
            return "Overeight";
        } else if (BmiValues >= 18.5) {
            return "Overeight";
        } else if (BmiValues >= 0) {
            return "Overeight";
        }
        return "";
    }

    private String Asian(double BmiValues) {
        if (BmiValues >= 27.5) {
            return "Obese";
        } else if (BmiValues >= 23) {
            return "Overeight";
        } else if (BmiValues >= 18) {
            return "Overeight";
        } else if (BmiValues >= 0) {
            return "Overeight";
        }
        return "";
    }

}
