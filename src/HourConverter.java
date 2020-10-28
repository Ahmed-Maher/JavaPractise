public class HourConverter {

    public static void main(String[] args) {
        String password = "Ab1";
        int pass = 0;
        if (!(password.matches(".*[a-z]+.*"))) {
            pass++;
        }
        if (!(password.matches(".*[A-Z]+.*"))) {
            pass++;
        }
        if (!(password.matches(".*[0-9]+.*"))) {
            pass++;
        }
        if (!(password.matches(".*[-!@#$%^&*()+]+.*"))) {
            pass++;
        }
        System.out.println((pass>(6-password.length()))?pass:(6-password.length()));
    }
}
