import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterator = 0;
        System.out.print("Введите сколько строк будет в матрице: ");
        int x = scanner.nextInt();
        System.out.print("Введите сколько столбцов будет в матрице: ");
        int y = scanner.nextInt();
        int[][] array = new int[x][y];
        System.out.println("Введите данные в матрицу: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++){
                if (i == 0 & j >= 0){
                    System.out.print(array[0][j] * 3 + " ");
                }
//                //Вывести все оставшиеся строки матрицы
//                else{
//                    System.out.print(array[i][j] + " ");
//                }
            }
        }
//        System.out.println(" ");
//        //Вывести весь массив для проверки
//        System.out.println("Ваш массив: " + Arrays.deepToString(array));
    }
}
