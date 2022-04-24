package MXN;

import java.util.Arrays;

public class Main {
    public static void mxcanec(int[] Alex, int i, int j) {
        int usa = Alex[i];
        Alex[i] = Alex[j];
        Alex[j] = usa;
    }

    public static void main(String[] args) {
        // Exercise 5

        int[][] mxnAlex = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        System.out.println("Matrix are:");
        for (int[] row : mxnAlex) {
            for (int column : row) {
                System.out.print(column + "");
            }
            System.out.println();
        }

        // Exercise 6

        int[] mxnAlexUs = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mxnAlexUs));
        int left = 0, right = mxnAlexUs.length - 1;
        while (left < right) mxcanec(mxnAlexUs, left++, right--);
        System.out.println(Arrays.toString(mxnAlexUs));

        // Exercise 7

        int[] massiv = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(massiv));
        int length = 0;
        for (int ignored : massiv) {
            length++;
        }
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();

        // Exercise 8 / 9

// Пользовался разными данными из интернета для решения задачи

        int[] numbersArray = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int luck = 1;
        System.out.println("Numbers: " + Arrays.toString(numbersArray));
        for (int k : numbersArray) {
            for (int i : numbersArray) {
                if (k + i == -2) {
                    System.out.println((luck++) + ": " + k + ", " + i);
                }
                System.out.println("I Found " + (luck - 1) + " number");
            }
        }
        // Exercise 5

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String str = "Фамилия сотрудника — " + lastName + "-" + "Имя сотрудника — " + firstName + "-" + "Отчество сотрудника — " + middleName;
        String[] subStr;
        String delimeter = "-"; // Разделитель
        subStr = str.split(delimeter); // Разделения строки str с помощью метода split()
        // Вывод
        for (String value : subStr) {
            System.out.println(value);
        }

// Exercise 6

        String[] fullNames = {"ivanov ivan ivanovich"};
        for (String s : fullNames) {
            System.out.println("Ф.И.О с заглавноӣ:" + " " + toUp(s));
        }
    }

    static String toUp(String s) {
        char[] luck = s.toCharArray();
        boolean inWord = false;
        for (int i = 0; i < luck.length; i++) {
            if (luck[i] >= 97 && luck[i] <= 122) {
                if (inWord) {
                    continue;
                }
                luck[i] -= 32;
                inWord = true;
            } else {
                inWord = false;
            }
        }
        return new String(luck);

        }
   }
