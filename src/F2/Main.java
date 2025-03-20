package F2;
/*  На вход программа попучает набор чисел, заканчивающихся решеткой. Вам требуется найти:
    среднее, максимальное и минимальное число в последовательности. Так же нужно вывести
    сумму остатков от деления суммы троек на последнее число тройки (каждые 3 введеных числа
    образуют тройку) Для понимания рассмотрим пример входных данных 1 2 3 4 5 6 среднае:
    (1 + 2 + 3 + 4 + 5 + 6)/6 = 3.5 максимум: 6 минимум: 1 сумма остатков тровк: (1 +2 + 3) mod 3 + (4 + 5 + 6) mod 6 = 6 mod 3 + 15 mod 6=0+3=3
    Среднее выводить, округлив до трех знаков после запятой.
    Для этого нужно использовать функцию round(x, 3) Того ваша программа допжна вывести: 3.5 6 1 3
    # - выход */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int idx = 0;
        int max = 0;
        int sumElements = 0;
        int avgMod = 0;

        double sumAllElements = Double.parseDouble(String.valueOf(0));

        Scanner scanner = new Scanner(System.in);
        List<String> listAll = new ArrayList<>();
        List<Integer> listAllInt = new ArrayList<>();

        while (true){

            String a = scanner.nextLine();
            if (a.equals("#")){
                break;
            }
            listAll.add(a);
            listAllInt.add(Integer.valueOf(String.valueOf(Integer.parseInt(a))));
        }

        for (int i = 0; i < listAll.size(); i++) {
            sumAllElements += Double.parseDouble(String.valueOf(listAll.get(i)));
        }

        for (int i = 2; i < listAll.size(); i += 3) {
            for (int j = 0; j < 3; j++) {
                if (max < Double.parseDouble(String.valueOf(listAll.get(idx)))) {
                    max = Integer.parseInt(String.valueOf(listAll.get(idx)));
                }
                sumElements += Integer.parseInt(String.valueOf(listAll.get(idx)));
                idx++;
            }
            avgMod += sumElements % max;
            sumElements = 0;
        }

        String round = String.format("%.3f",(sumAllElements / listAll.size()));

        System.out.print("Ответ: " + round + "; " + listAllInt.stream().max(Integer::compareTo).get()
                + "; " + listAllInt.stream().min(Integer::compareTo).get()
                + "; " + avgMod);
    }
}