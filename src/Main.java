import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("!!!ИГРА УГАДАЙКА!!!\n");
        System.out.println("Выберите уровень сложности:\t(легкий нажать 1)\t(средний нажать 2)\t(тяжолый нажать 3)\t(очень тяжолый нажать 4)\nВыберите желаемую сложность");
        int action = scan.nextInt();
        if(action == 1){
            int number = (int) (Math.random() * 25);
            int diff = 0;
            for (int count = 0; ; ) {
                System.out.println("Введите число:");
                int inNumber = scan.nextInt();
                if (inNumber != number) {
                    if (count > 0) {
                        int temp_diff = diff;
                        diff = Math.abs(inNumber - number);
                        if (temp_diff > diff) {
                            System.out.println("Теплее");
                        } else {
                            System.out.println("Холоднее");
                        }
                    }
                    count++;
                    System.out.println("Вы не угодали\nПопытка № " + count);
                } else if (inNumber == number) {
                    System.out.println("Поздравляю, вы угодали число с " + (count + 1) + " попытки");
                    break;
                }
            }
            scan.close();
        }
        else if(action == 2){
            int number = (int) (Math.random() * 50);
            int diff = 0;
            for (int count = 0; ; ) {
                System.out.println("Введите число:");
                int inNumber = scan.nextInt();
                if (inNumber != number) {
                    if (count > 0) {
                        int temp_diff = diff;
                        diff = Math.abs(inNumber - number);
                        if (temp_diff > diff) {
                            System.out.println("Теплее");
                        } else {
                            System.out.println("Холоднее");
                        }
                    }
                    count++;
                    System.out.println("Вы не угодали\nПопытка № " + count);
                } else if (inNumber == number) {
                    System.out.println("Поздравляю, вы угодали число с " + (count + 1) + " попытки");
                    break;
                }
            }
            scan.close();
        }
        else if(action == 3){
            int number = (int) (Math.random() * 75);
            int diff = 0;
            for (int count = 0; ; ) {
                System.out.println("Введите число:");
                int inNumber = scan.nextInt();
                if (inNumber != number) {
                    if (count > 0) {
                        int temp_diff = diff;
                        diff = Math.abs(inNumber - number);
                        if (temp_diff > diff) {
                            System.out.println("Теплее");
                        } else {
                            System.out.println("Холоднее");
                        }
                    }
                    count++;
                    System.out.println("Вы не угодали\nПопытка № " + count);
                }
                else if (inNumber == number) {
                    System.out.println("Поздравляю, вы угодали число с " + (count + 1) + " попытки");
                    break;
                }
            }
            scan.close();
        }
        else if(action == 4){
            int number = (int) (Math.random() * 100);
            int diff = 0;
            for (int count = 0; ; ) {
                System.out.println("Введите число:");
                int inNumber = scan.nextInt();
                if (inNumber != number) {
                    if (count > 0) {
                        int temp_diff = diff;
                        diff = Math.abs(inNumber - number);
                        if (temp_diff > diff) {
                            System.out.println("Теплее");
                        } else {
                            System.out.println("Холоднее");
                        }
                    }
                    count++;
                    System.out.println("Вы не угодали\nПопытка № " + count);
                }
                else if (inNumber == number) {
                    System.out.println("Поздравляю, вы угодали число с " + (count + 1) + " попытки");
                    break;
                }
            }
            scan.close();
        }
        else {
            System.out.println("Выбрано неверное значение");
        }
    }
}