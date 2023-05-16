public class TemperatureConverter {

    public static void main(String[] args) {

        double temperaturaEmCelsius = 22;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsiues é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;

        String mensagem2 = "A temperatura em Fahrenheit inteira é: %d".formatted(temperaturaEmFahrenheitInteira);

        System.out.println(mensagem2);

    }

}
