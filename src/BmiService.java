public class BmiService {
    public float calculate(float weight, int height) {
        float bmi;
        float heightMeters = height / 100f;

        bmi = (float) (weight / Math.pow(heightMeters, 2));

        return bmi;
    }
}
