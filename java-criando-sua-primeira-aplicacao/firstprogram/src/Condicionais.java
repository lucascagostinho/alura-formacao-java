public class Condicionais {

    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os cliente estão curtindo");
        } else {
            System.out.println("Filme retro que vale a pena assistir!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Alugar");
        }

        incluidoNoPlano = false;

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Alugar");
        }

        int valor = 1;

        switch (valor) {
            case 1:
                System.out.println(valor);
                break;
            case 2:
                System.out.println(valor);
                break;
            default:
                System.out.println("Não é nenhum dos valores");
                break;
        }

        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println(String.format("O dia %d é %s", dia, nomeDia));


    }

}
