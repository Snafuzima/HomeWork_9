public class MyArrayDataException extends RuntimeException{

    public MyArrayDataException (int y, int x) {
        System.err.printf("Элемент:[%d][%d] не преобразуемый.\n",y,x);



    }








}
