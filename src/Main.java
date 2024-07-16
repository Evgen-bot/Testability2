public class Main {
    public static void main(String[] args) {

        bmiService service = new bmiService();
        int weighKg = 77;
        int heightCm = 182;

        int bmi = service.calculate(weighKg, heightCm);
        System.out.println("Индекс массы тела:" + bmi);
    }
}
