//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//Пункты реализовать в методе main
//*Пункты реализовать в разных методах
//int i = new Random().nextInt(k); //это кидалка случайных чисел!)

import java.util.Random;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(2000);
        System.out.println(i);
        //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        String binary = Integer.toBinaryString(i);
        System.out.println(binary);
        char[] arr = binary.toCharArray();
        int n = arr.length;
        System.out.println(n);
        System.out.println(Arrays.toString(arr));
        //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int count = 0;
        for (int k = i; k <= Short.MAX_VALUE; k++){
            if (k%n == 0) {
                count += 1;
            }
        }
        int[] m1 = new int[count];
        int sum = 0;
        for (int k = i; k <= Short.MAX_VALUE; k++){
            if (k%n == 0) {
                m1[sum] = k;
                sum +=1;
            }
        }
        System.out.println(Arrays.toString(m1));
        //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int count2 = 0;
        for (int k = Short.MIN_VALUE; k <= i; k++){
            if (k%n != 0) {
                count2 += 1;
            }
        }
        int[] m2 = new int[count2];
        int sum2 = 0;
        for (int k = Short.MIN_VALUE; k <= i; k++){
            if (k%n != 0) {
                m2[sum2] = k;
                sum2 +=1;
            }
        }
        System.out.println(Arrays.toString(m2));
    }
}

