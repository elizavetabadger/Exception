public class FMException extends Throwable {
    public FMException() {
    }

    public void fmException(String i) {
        System.out.println("Exception: FMNotCorrectData");
        System.out.printf("Пол не определен: %s", i);
        System.out.println();
    }
}
