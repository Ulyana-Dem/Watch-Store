package store.cart;


public class OutOfStockException extends Exception {
    OutOfStockException(String message) {
        super(message);
    }
}