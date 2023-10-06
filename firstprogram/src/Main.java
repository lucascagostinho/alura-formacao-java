public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Movie: Star Wars");

        int year = 2000;
        int year2;
        year2 = 2001;
        int releaseYear = 2002;

        System.out.println(year);

         //Concatenação
        System.out.println("Ano de lançamento: " + year);
        System.out.println("Ano de lançamento: " + year2);
        System.out.println("Ano de lançamento: " + releaseYear);


         /*
         Variáveis do tipo inteiro não armazenam valores decimais
         int filmNote = 8.1;
         */
        double filmNote = 8.1;

        /*
        Mas tipo double armazenam valores inteiros
        */
        double filmNote2 = 8;

        //Precedência
        double average = (9.7 + 6.2 + 8) / 3;
        System.out.println(average);

        String synopsi;
        synopsi = "Filme dos anos 2000";
        System.out.println(synopsi);

        String name = "Lucas";
        String message = "Olá ";
        String message2 = message + name + "!";
        System.out.println(message2);

        //Text Blocks, disponível a partir da versão 15 do java
        String synopsi2 = """
                Filme legal
                No espaço
                Bom
                Ano de lançamento
                """ + releaseYear;
        System.out.println(synopsi2);

        String password = "12345";
        String password2 = "1234";
        if (password.equals("12345")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (password.equals("password2")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}