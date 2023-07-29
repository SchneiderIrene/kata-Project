import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("выбор");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. выход");


            int i = scanner.nextInt();
            int res;

            if (i == 5)
                break;
            else if (i == 1){
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                res = a+b;
                System.out.println(a + " + " + b + " = " + res);

            }

            else if (i == 2){
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                res = a-b;
                System.out.println(a + " - " + b + " = " + res);
            }

            else if (i == 3){
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                res = a*b;
                System.out.println(a + " * " + b + " = " + res);
            }

            else if (i == 4){
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                if (b == 0){
                    System.out.println("на ноль делить НЕЛЬЗЯ");
                }
                res = a/b;
                System.out.println(a + " / " + b + " = " + res);
            }
            else {
                System.out.println("Ошибка ввода");
            }

            System.out.println("Программа завершена");
        }



    }


    }