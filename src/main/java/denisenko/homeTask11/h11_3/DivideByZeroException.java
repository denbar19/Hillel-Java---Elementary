package denisenko.homeTask11.h11_3;

/**
 * Создать свое исключение DivideByZeroException и во 2м задании бросать его, если делитель равен 0.
 */
public class DivideByZeroException extends ArithmeticException {

    public DivideByZeroException() {
        super();
    }

    public DivideByZeroException(String message) {
        super(message);
    }


}
