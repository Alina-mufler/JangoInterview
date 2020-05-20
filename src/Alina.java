import java.util.HashSet;
import java.util.Scanner;

public class Alina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуйте, меня зовут Алина.");
        System.out.println("Если хотите получить дополнительную информацию обо мне, введите определённую команду из перечисленных ниже: " + "\n"
                + " Введите 1, чтобы узнать дату моего рождения. " + "\n"
                + " Введите 2, чтобы узнать город, в котором я родилась." + "\n"
                + " Введите 3, чтобы узнать, есть у меня водительское удостоверение или нет." + "\n"
                + " Введите 4, чтобы узнать, как зовут моего домашнего питомца." + "\n"
                + " Введите 5, чтобы сразу получить всю вышеперечисленную информацию обо мне." + "\n"
                + " Введите 0, если, к сожалению, не хотите узнать обо мне что-то ещё.");
        String command = sc.nextLine().trim();
        HashSet<String> check = new HashSet<>();
        int size = 0;
        check.add(command);
        alina:
        while (!command.equals("stop")) {
            if (check.size() - size > 0) {
                switch (command) {
                    case "1":
                        System.out.println(" Дата моего рождения - 05.09.2001.");
                        break;
                    case "2":
                        System.out.println(" Я родилась в городе Елабуга.");
                        break;
                    case "3":
                        System.out.println(" У меня есть водительское удостоверение))");
                        break;
                    case "4":
                        System.out.println(" У меня есть кошка, и её зовут Дуся.");
                        break;
                    case "5":
                        System.out.println(" Дата моего рождения - 05.09.2001." + "\n"
                                + " Я родилась в городе Елабуга." + "\n"
                                + " У меня есть водительское удостоверение))" + "\n"
                                + " У меня есть кошка и её зовут Дуся." + "\n");
                        break;
                    case "0":
                        System.out.println(" Эх, видимо вы не хотите узнать меня получше((");
                        break alina;

                    default:
                        System.out.println("К сожалению, такой команды не сущесвует, вы можете узнать обо мне следущее:");
                        if (!check.contains("1")) System.out.println(" Введите 1, чтобы узнать дату моего рождения.");
                        if (!check.contains("2"))
                            System.out.println(" Введите 2, чтобы узнать город, в котором я родилась.");
                        if (!check.contains("3"))
                            System.out.println(" Введите 3, чтобы узнать, есть у меня водительское удостоверение или нет.");
                        if (!check.contains("4"))
                            System.out.println(" Введите 4, чтобы узнать, как зовут моего домашнего питомца.");
                        if (!check.contains("5"))
                            System.out.println(" Введите 5, чтобы сразу получить всю вышеперечисленную информацию обо мне.");
                        System.out.println(" Введите 0, если, к сожалению, не хотите узнать обо мне что-то ещё.");
                        break;
                }
            } else {
                System.out.println("Вы уже знаете эту информацию обо мне, надо было запоминать))");
            }
            if (check.size() == 4 || check.contains("5")) {
                System.out.println("Поздравляю, вы узнали обо мне всё, что можно!");
                break;
            } else {
                command = sc.nextLine();
                if (command.equals("1") || command.equals("2") || command.equals("3") || command.equals("4") || command.equals("5") || command.equals("0")) {
                    size = check.size();
                    check.add(command);
                }
            }
        }
    }
}

