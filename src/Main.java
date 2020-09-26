public class Main {
    public static void main(String[] args) {
        float weight = 53;
        int height = 173;
        float bmi;

        BmiService bmiService = new BmiService();

        bmi = bmiService.calculate(weight, height);

        System.out.printf(
                "Ваш рост: %dсм\nВаш вес: %.1fкг\nИМТ: %.2f",
                height,
                weight,
                bmi
        );

    }
}
