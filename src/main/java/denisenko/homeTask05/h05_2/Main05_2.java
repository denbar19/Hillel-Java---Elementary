package denisenko.homeTask05.h05_2;

/**
 * Написать метод middleSymbol, который принимает строку и возвращает средний символ как строку. Если в строке четное кол-во символов, то возвращать символы слева и справа от центра.
 * Input: abcde. Output: c
 * Input: abcd. Output: bc
 * <p>
 * Написать метод invertRegister, который принимает строку и инвертирует регистр каждого символа в ней.
 * Input: AbCde. Output: aBcDE
 * <p>
 * Написать метод swapHalf, который принимает строку и меняет ее половины местами. Если в строке нечетное кол-во символов, то средний символ остается на месте:
 * Input: abcd. Output: cdab
 * Input: abcde. Output: decab
 */
public class Main05_2 {

    public static void main(String[] args) {

        String input = "abcDEfgh";
        String input1 = "abcDefg";
        System.out.println(input);
        System.out.println(input1);

        System.out.println("middleSymbol " + middleSymbol(input));
        System.out.println("middleSymbol " + middleSymbol(input1));

        System.out.println("invertRegister " + invertRegister(input));
        System.out.println("invertRegister " + invertRegister(input1));

        System.out.println("swapHalf " + swapHalf(input));
        System.out.println("swapHalf " + swapHalf(input1));
    }

    public static String middleSymbol(String str) {
        String middleSymbol;
        int length = str.length();
        if (length == 1) {
            middleSymbol = str;
        } else if (length % 2 != 0) {
            middleSymbol = Character.toString(str.charAt(length / 2));
        } else {
            middleSymbol = str.substring((length / 2 - 1), (length / 2 + 1));
        }
        return middleSymbol;
    }

    public static String invertRegister(String str) {
        StringBuilder inverted = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            if (ch.matches("[A-Z]")) {
                inverted.append(ch.toLowerCase());
            }
            if (ch.matches("[a-z]")) {
                inverted.append(ch.toUpperCase());
            }
        }
        return inverted.toString();
    }

    public static String swapHalf(String str) {
        StringBuilder swapString = new StringBuilder();
        int length = str.length();
        if (length == 1) {
            swapString.append(str);
            System.out.println("must be more that one char");
        } else if (length % 2 != 0) {
            String firstOdd = str.substring(0, (length / 2));
            String secondOdd = str.substring((length / 2 + 1), length);
            String middleOdd = Character.toString(str.charAt(length / 2));
            swapString.append(secondOdd).append(middleOdd).append(firstOdd);
        } else {
            String firstEven = str.substring(0, length / 2);
            String secondEven = str.substring(length / 2, length);
            swapString.append(secondEven).append(firstEven);
        }
        return swapString.toString();
    }
}
