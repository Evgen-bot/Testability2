public class bmiService {

    public int calculate(int weight, int height) {
        int bmi;
        if (height > 0) {
            bmi = weight * 10000 / height / height;
        } else {
            bmi = 0;
        }
        return bmi;
    }

}