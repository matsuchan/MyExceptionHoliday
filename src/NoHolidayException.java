public class NoHolidayException extends Exception {

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.err.println("その日は平日です");
    }
}
