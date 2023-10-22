package java_seminar.homework_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptops> set = new HashSet<>();

        Laptops laptops1 = new Laptops();
        laptops1.setModel("HP");
        laptops1.setRamGB(8);
        laptops1.setHddGB(512);
        laptops1.setOpsystem("Windows");
        laptops1.setColor("Grey");

        Laptops laptops2 = new Laptops();
        laptops2.setModel("MacBook");
        laptops2.setRamGB(16);
        laptops2.setHddGB(256);
        laptops2.setOpsystem("MacOS");
        laptops2.setColor("Grey");

        Laptops laptops3 = new Laptops();
        laptops3.setModel("Lenovo");
        laptops3.setRamGB(4);
        laptops3.setHddGB(1024);
        laptops3.setOpsystem("Windows");
        laptops3.setColor("Black");

        Laptops laptops4 = new Laptops();
        laptops4.setModel("Asus");
        laptops4.setRamGB(8);
        laptops4.setHddGB(700);
        laptops4.setOpsystem("Windows");
        laptops4.setColor("White");

        set.add(laptops1);
        set.add(laptops2);
        set.add(laptops3);
        set.add(laptops4);

        // Пример фильтрации по критериям
        Map<Integer, Object> criteria = new HashMap<>();
        String[] array = new String[]{
                "ОЗУ",
                "Жесткий диск",
                "ОС",
                "Цвет",
                "Модель"
        };
        for (int i = 0; i < 5; i++)
        {
            // Код, который будет выполнен внутри цикла
            System.out.println("Введите соответсвующее значение " + array[i]);
            System.out.println("1 - ввести критерий");
            System.out.println("2 - пропустить критерий");
            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();

                scanner.nextLine();
                if (a == 1) {
                    System.out.println("Введите значение: ");

                    if (i < 2) {
                        int val = scanner.nextInt();
                        criteria.put(i + 1, val);
                    } else {
                        String valS = scanner.nextLine();
                        criteria.put(i + 1, valS);
                    }
                } else if (a == 2) {
                    continue;
                } else {
                    System.out.println("Ошибка: Неверный формат данных. Введите 1 или 2.");
                    return;
                }
            } else {
                System.out.println("Ошибка: Неверный формат данных. Введите 1 или 2.");
                return;
            }
        }

        for (Laptops laptops: set) {
            if (laptops.chooseCriteria(criteria)) {
                System.out.println(laptops);
            }
        }
    }
}

