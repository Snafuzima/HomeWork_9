public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        System.err.println("Неверный размер массива.");
    }
}
