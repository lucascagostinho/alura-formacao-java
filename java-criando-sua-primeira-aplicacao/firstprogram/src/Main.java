public class Main {

    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Star Wars");

        int anoDeLancamento = 2023;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluiNoPlano = true;

        double notaDoFilme = 8.1;

        boolean a = false;
        int teste = 0;

        if (!a) {
            teste = 1;
        }

        System.out.println(teste);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = "Filme";
        System.out.println(sinopse);

        String textBlocks = """
                teste de text
                blocks
                do java 15
                """ + anoDeLancamento;
        System.out.println(textBlocks);

        String nome = "Alura";
        String saudacao = "Olá";
        System.out.println(saudacao + nome);

        String senha = "1234";
        String senha2 = "1";

        if (senha == senha2) {
            System.out.println("sim");
        } else {
            System.out.println("Não pois essa comparação verifica se está sendo o mesmo valor na" + "memódio e não o valar");
        }

        String senha3 = "1234";
        if (senha3.equals(senha)) {
            System.out.println("sim pois com .equals ele compara o valor");
        }

        if (senha.equals("1234")) {
            System.out.println("sim");
        } else {
            System.out.println("não");
        }

        if (senha == "1234") {
            System.out.println("sim");
        } else {
            System.out.println("não");
        }

        String nome1 = "alura";
        String nome2 = "Alura";

        if (nome1 == nome2) {
            System.out.println("sim");
        } else {
            System.out.println("não");
        }

        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("sim");
        } else {
            System.out.println("não");
        }

        if (nome1.equalsIgnoreCase("Alura")) {
            System.out.println("sim");
        } else {
            System.out.println("não");
        }

        String mensagem = """
                Olá, mundo!
                Este é um Text Block.
                Ele permite escrever textos com múltiplas linhas
                sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                """;

        boolean valida = mensagem.equalsIgnoreCase("""
                olá, mundo!
                este é um Text Block.
                ele permite escrever textos com múltiplas linhas
                sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                """);

        System.out.println(valida);

        /**
         * Uma das maneiras mais comuns de se
         * formatar textos em Java é utilizando o método format(),
         * da classe String. Esse método permite formatar um texto
         * utilizando diversos placeholders, que são representados pelo caractere % seguido de
         * uma letra que indica o tipo de dado que será inserido no placeholder. Por exemplo, %s indica
         * que uma String será inserida no placeholder, %d indica um valor
         * inteiro e %f indica um valor decimal.
         */
        String nomeTeste = "Maria";
        int idade = 30;
        double valor = 55.99999;

        /**
         * %.2f indica que o valor deve ser formatado com duas casas decimais.
         */
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nomeTeste, idade, valor));

        String oi = String.format("Oi %s %d %f", nomeTeste, idade, valor);
        System.out.println(oi);


        String nome3 = "João";
        int aulas5 = 4;

        String mensagem1 = """
                Olá, %s!
                Boas vindas ao curso de Java.
                Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                """.formatted(nome3, aulas5);

        System.out.println(mensagem1);


    }
}
