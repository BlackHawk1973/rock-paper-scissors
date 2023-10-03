package org.top;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choiceUser;
        int choiceComputer;
        boolean gameOver = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (gameOver) {
            System.out.println("Поиграем?");
            System.out.println("1 - Камень");
            System.out.println("2 - Ножницы");
            System.out.println("3 - Бумага");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");
            choiceUser = scanner.nextInt();
            if (choiceUser < 0 || choiceUser > 3) {
                System.out.println("Некорректный выбор!!!");
                continue;
            }
            if (choiceUser == 0) {
               System.out.println("До свидания!");
               gameOver = false;
               continue;
            }
            choiceComputer = random.nextInt(0,4);
            if (choiceUser == choiceComputer) {
                System.out.println("Ничья!");
                continue;
            }
            if ((choiceUser == 1 && choiceComputer == 2) || (choiceUser == 2 && choiceComputer == 3) ||
                    (choiceUser == 3 && choiceComputer == 1 ))
                System.out.println("Вы победили!");
            else
                System.out.println("Компьютер победил!");
        }
    }
}