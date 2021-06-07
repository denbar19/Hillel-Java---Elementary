package denisenko.homeTask11.h11_2;

import denisenko.homeTask11.h11_3.DivideByZeroException;

/**
 * Написать блок try, внутри которого из массива чисел берется 2 числа и первое делится на второе.
 * Нужно обработать ситуации, когда второе число является 0 (ArithmeticalException)
 * и когда индексы выходят за рамки массива (ArrayIndexOutOfBoundsException).
 * Если была попытка деления на 0, то внутри catch нужно взять два других числа из массива
 * и попробовать разделить еще раз, также ожидая исключение.
 */
public class Main11_2 {

    public static void main(String[] args) {

        int[] array = {4, 2, 1, 0};
        int i1 = 1;
        int i2 = 5;
        int res;
        try {
            res = divide(array[i1], array[i2]);
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            i1--;
            i2--;
            try {
                res = divide(array[i1], array[i2]);
                System.out.println(res);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage());
            } catch (DivideByZeroException ex) {
                System.out.println("Dividing by = " + ex.getMessage());
            }
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
            i1--;
            i2--;
            try {
                res = divide(array[i1], array[i2]);
                System.out.println(res);
            } catch (DivideByZeroException ex) {
                System.out.println("Answer  = " + ex.getMessage() + "-> Exception is handled");
            }

        }
    }

    public static int divide(int a, int b) throws DivideByZeroException, ArrayIndexOutOfBoundsException {
        if (b == 0) {
            throw new DivideByZeroException(String.valueOf(b));
        }
        return a / b;
    }
}
