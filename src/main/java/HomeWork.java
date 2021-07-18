/*
1.Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение
MyArraySizeException.

2.Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

3.В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета. Integer.parseInt();
*/


import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        int x;
        int y;



        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение X для массива");
        x=sc.nextInt();
        System.out.println("Введите значение Y для массива");
        y=sc.nextInt();



        String[][] stringArr = new String[y][x];



        for(int i=0; i < stringArr.length; i++) {
            System.out.println();
            for(int j=0; j < stringArr[i].length; j++) {
                stringArr[i][j] = "1";
                System.out.print(stringArr[i][j]+" ");
            }
        }

        stringArr[1][2]="Name";


        System.out.println();
        try {
            if(x == 4 && y==4) {
                System.out.println(stringToInt(stringArr));
            } else {
                throw new MyArraySizeException();
            }


        } catch (MyArraySizeException e) {

        }




    }

    public static int stringToInt(String[][] arrString)  {
        int summ=0;
        int plus=0;
        int i = 0;
        int j=0;

                for ( i = 0; i < arrString.length; i++) {
                    for ( j = 0; j < arrString[i].length; j++) {

                        try {
                            plus = Integer.parseInt(arrString[i][j]);
                            summ = plus + summ;

                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException(i,j);
                        }
                    }
                }

        return summ;
    }
}
