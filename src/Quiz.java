import java.util.Scanner;

public class Quiz {
    private String name;
    private int nivel = 0;
    private double pontuacao = 0.00;
    private int acertos = 0;
    private int total = 0;
    private final Scanner sc = new Scanner(System.in);


    private void verificar(String s, String r) {
        Scanner sc = new Scanner(System.in);
        while (!(s.equalsIgnoreCase("a") || s.equalsIgnoreCase("b") || s.equalsIgnoreCase("c") || s.equalsIgnoreCase("d"))) {
            System.out.println(Interface.corVermelho+"Digite apenas as letras -(a), (b), (c) ou (d)"+Interface.reset);
            System.out.println("Resposta: ");
            s = sc.next();
        }
        if (s.equalsIgnoreCase(r)) {
            System.out.print(Interface.corVerde+"Você acertou :)"+Interface.reset);
            System.out.println(Interface.corAmarelo+"      O \n"+Interface.reset + Interface.corAmarelo+
                    "                    /|\\/ "+Interface.reset+Interface.corAzul+"               (\\__/)       \n"+Interface.reset + Interface.corAmarelo+
                    "                   \\/\\  "+Interface.reset+Interface.corAzul+"               (>’.’<)       \n "+Interface.reset +Interface.corAmarelo+
                    "                     /    "+Interface.reset+Interface.corAzul+"            (\")_(\")        "+Interface.reset);
            System.out.print(Interface.corVerde+"―――――――――――――――――――――――――――――――――― "+Interface.reset);

            pontuacao+=100;
            acertos++;
//            if (pontuacao >=500.00 && pontuacao<800){
//                nivel=1;
//            } else if (pontuacao >=800 && pontuacao<1200) {
//                nivel = 2;
//            } else if (pontuacao >=1200) {
//                nivel=3;
//            }
        } else {
            System.out.print(Interface.corVermelho+"Você errou ):"+Interface.reset);
            System.out.println(Interface.corAmarelo+"        O \n"+Interface.reset +Interface.corAmarelo+
                    "                    /|\\/"+Interface.reset+Interface.corAzul+"                 (\\__/)       \n"+Interface.reset +Interface.corAmarelo+
                    "                     /\\ "+Interface.reset+Interface.corAzul+"                (>’.’<)       \n "+Interface.reset +Interface.corAmarelo+
                    "                   / |   "+Interface.reset+Interface.corAzul+"              (\")_(\")        "+Interface.reset);
            System.out.print(Interface.corVerde+"―――――――――――――――――――――――――――――――――― "+Interface.reset);
        }
    }

    public void executar() {
        System.out.println(Interface.corAmarelo+" _____       __  __      ______      ________     \n" +Interface.corAmarelo+
                "/\\  __`\\    /\\ \\/\\ \\    /\\__  _\\    /\\_____  \\    \n" +Interface.corAmarelo+
                "\\ \\ \\/\\ \\   \\ \\ \\ \\ \\   \\/_/\\ \\/    \\/____//'/'   \n" +Interface.corAmarelo+
                " \\ \\ \\ \\ \\   \\ \\ \\ \\ \\     \\ \\ \\         //'/'    \n" +Interface.corAmarelo+
                "  \\ \\ \\\\'\\\\   \\ \\ \\_\\ \\     \\_\\ \\__     //'/'___  \n" +Interface.corAmarelo+
                "   \\ \\___\\_\\   \\ \\_____\\    /\\_____\\    /\\_______\\\n" +Interface.corAmarelo+
                "    \\/__//_/    \\/_____/    \\/_____/    \\/_______/\n" +Interface.corAmarelo+
                "                                                  \n" +Interface.corAmarelo+
                "                                                  "+Interface.reset);

        System.out.print("\nDigite seu nome: ");
        name = sc.nextLine();
        System.out.println("Em qual nivel deseja iniciar? Caso queira iniciar do (Fácil) pressione '0': ");
        System.out.println("1- Fácil(5 questôes) , 2- Médio(5 questôes) , 3- Difícil(5 questôes)");
        int level = 0;
        boolean bError = true;
        while (bError) {
            if (sc.hasNextInt()) {
                level = sc.nextInt();
                while (!(level == 1 || level == 2 || level == 3 || level == 0)) {
                    System.out.println(Interface.corVermelho+"Digite apenas 1,2,3 ou 0 !!!"+Interface.reset);
                    if (sc.hasNextInt()) {
                        level = sc.nextInt();
                    } else {
                        sc.next();
                    }
                }
            } else {
                System.out.println(Interface.corVermelho+"Digite apenas numeros inteiros !!!"+Interface.reset);
                sc.next();
                continue;
            }
            bError = false;
        }
        if (level == 1) {
            level1();
        } else if (level == 2) {
            level2();
        } else if (level == 3) {
            level3();
        } else {
            level0();
        }
        sc.close();
    }
    private void level1() {
        nivel = 1;
        System.out.println(Interface.corVermelho+"-------------------------------------------------------------------------"+Interface.reset);
        System.out.printf("Nome: %s    Nivel: %d(Fácil)         Pontuação: %.2f%n", name, nivel, pontuacao);
        System.out.println(Interface.corVermelho+"-------------------------------------------------------------------------"+Interface.reset);
        System.out.println("\nPara cada questão, pressione a letra que corresponde a alternativa -(a), (b), (c) ou (d)");

        System.out.println("Pergunta 1:");
        System.out.println("Quantas vogais há na palavra pesqueiro?");
        System.out.println("a)- 3");
        System.out.println("b)- 9");
        System.out.println("c)- 5");
        System.out.println("d)- 0");
        System.out.print("Resposta: ");
        String resposta1 = sc.next();
        verificar(resposta1, "C");

        System.out.println("\nPergunta 2:");
        System.out.println("Qual é a décima sexta letra do alfabeto?");
        System.out.println("a)- M");
        System.out.println("b)- P");
        System.out.println("c)- R");
        System.out.println("d)- N");
        System.out.print("Resposta: ");
        String resposta2 = sc.next();
        verificar(resposta2, "B");

        System.out.println("\nPergunta 3:");
        System.out.println("Qual país tem como capital a cidade de Lisboa?");
        System.out.println("a)- Espanha");
        System.out.println("b)- Portugal");
        System.out.println("c)- Chile");
        System.out.println("d)- Guatemala");
        System.out.print("Resposta: ");
        String resposta3 = sc.next();
        verificar(resposta3, "B");

        System.out.println("\nPergunta 4:");
        System.out.println("Quantos segundos há em duas horas?");
        System.out.println("a)- 7200");
        System.out.println("b)- 3600;");
        System.out.println("c)- 2800");
        System.out.println("d)- 6900");
        System.out.print("Resposta: ");
        String resposta4 = sc.next();
        verificar(resposta4, "A");

        System.out.println("\nPergunta 5:");
        System.out.println("A metade de 2 x 8 é igual a?");
        System.out.println("a)- 12");
        System.out.println("b)- 16");
        System.out.println("c)- 8");
        System.out.println("d)- 10");
        System.out.print("Resposta: ");
        String resposta5 = sc.next();
        verificar(resposta5, "C");

        System.out.printf("\nVocê acertou %d/5 questôes neste nível.%n", acertos);
        total += acertos;

        System.out.println("Deseja ir para o nivel 2(Médio) ? Pressione - (1) . Para encerrar Pressione - (0)");
        int level = 0;
        boolean bError = true;
        while (bError) {
            if (sc.hasNextInt()) {
                level = sc.nextInt();
                while (!(level == 1 || level == 0)) {
                    System.out.println("Digite apenas -(1) para ir para o próximo nível , (0) para encerrar !");
                    if (sc.hasNextInt()) {
                        level = sc.nextInt();
                    } else {

                        sc.next();
                    }
                }
            } else {
                System.out.println(Interface.corVermelho+"Digite apenas numeros inteiros !!!"+Interface.reset);
                sc.next();
                continue;
            }
            bError = false;
        }
        if (level==1){
            level2();
        }else {
            System.out.println("FIM DO QUIZ!!!");
            System.out.println(Interface.corVermelho+"----------------------------------------"+Interface.reset);
            System.out.printf("Nome: %s             Pontuação: %.2f%n", name, pontuacao);
            System.out.println(Interface.corVermelho+"----------------------------------------"+Interface.reset);
        }
    }

    private void level2() {
        acertos = 0;
        nivel = 2;
        System.out.println(Interface.corVermelho+"------------------------------------------------------------"+Interface.reset);
        System.out.printf("Nivel: %d(Médio)                         Pontuação: %.2f%n", nivel, pontuacao);
        System.out.println(Interface.corVermelho+"------------------------------------------------------------"+Interface.reset);

        System.out.println("\nPergunta 6:");
        System.out.println("Qual é o segundo esporte mais praticado no Brasil?");
        System.out.println("a)- futebol");
        System.out.println("b)- vôlei");
        System.out.println("c)- natação");
        System.out.println("d)- judô");
        System.out.print("Resposta: ");
        String resposta6 = sc.next();
        verificar(resposta6, "B");

        System.out.println("\nPergunta 7:");
        System.out.println("Um ângulo de 90º é um ângulo?");
        System.out.println("a)- reto");
        System.out.println("b)- obtuso");
        System.out.println("c)- agudo");
        System.out.println("d)- raso");
        System.out.print("Resposta: ");
        String resposta7 = sc.next();
        verificar(resposta7, "A");

        System.out.println("\nPergunta 8:");
        System.out.println("Qual é o substantivo usado para se referir a um grupo de lobos?");
        System.out.println("a)- matilha");
        System.out.println("b)- bando");
        System.out.println("c)- lobos");
        System.out.println("d)- alcateia");
        System.out.print("Resposta: ");
        String resposta8 = sc.next();
        verificar(resposta8, "D");

        System.out.println("\nPergunta 9:");
        System.out.println("Em qual país fica Machu Picchu?");
        System.out.println("a)- Chile");
        System.out.println("b)- Venezuela");
        System.out.println("c)- Peru");
        System.out.println("d)- Argentina");
        System.out.print("Resposta: ");
        String resposta9 = sc.next();
        verificar(resposta9, "C");

        System.out.println("\nPergunta 10:");
        System.out.println("Qual o número mínimo de jogadores numa partida de futebol?");
        System.out.println("a)- 7");
        System.out.println("b)- 10");
        System.out.println("c)- 9");
        System.out.println("d)- 5");
        System.out.print("Resposta: ");
        String resposta10 = sc.next();
        verificar(resposta10, "a");

        System.out.printf("\nVocê acertou %d/5 questôes neste nível!!%n.", acertos);
        total += acertos;
        acertos=0;

        System.out.println("Deseja ir para o nivel 3(Difícil) ? Pressione - (1) . Para encerrar Pressione - (0)");
        int level = 0;
        boolean bError = true;
        while (bError) {
            if (sc.hasNextInt()) {
                level = sc.nextInt();
                while (!(level == 1 || level == 0)) {
                    System.out.println(Interface.corVermelho+"Digite apenas -(1) para ir para o próximo nível , (0) para encerrar !"+Interface.reset);
                    if (sc.hasNextInt()) {
                        level = sc.nextInt();
                    } else {

                        sc.next();
                    }
                }
            } else {
                System.out.println(Interface.corVermelho+"Digite apenas numeros inteiros !!!"+Interface.reset);
                sc.next();
                continue;
            }
            bError = false;
        }
        if (level==1){
            level3();
        }else {
            System.out.println("FIM DO QUIZ!!!");
            System.out.println(Interface.corVermelho+"----------------------------------------"+Interface.reset);
            System.out.printf("Nome: %s             Pontuação: %.2f%n", name, pontuacao);
            System.out.println(Interface.corVermelho+"----------------------------------------"+Interface.reset);
        }
    }

    private void level3() {
        acertos = 0;

        nivel = 3;
        System.out.println(Interface.corVermelho+"---------------------------------------------------"+Interface.reset);
        System.out.printf("Nivel: %d(Difícil)            Pontuação: %.2f%n", nivel, pontuacao);
        System.out.println("---------------------------------------------------");

        System.out.println("\nPergunta 11:");
        System.out.println("Qual o país mais novo do mundo?");
        System.out.println("a)- Timor Leste");
        System.out.println("b)- Kosovo");
        System.out.println("c)- Montenegro");
        System.out.println("d)- Sudão do Sul");
        System.out.print("Resposta: ");
        String resposta11 = sc.next();
        verificar(resposta11, "D");

        System.out.println("\nPergunta 12:");
        System.out.println("Qual o lugar mais profundo dos oceanos?");
        System.out.println("a)- Fossa de Bentley");
        System.out.println("b)- Fossa das Marianas");
        System.out.println("c)- Fossa de Tonga");
        System.out.println("d)- Fossa de Java");
        System.out.print("Resposta: ");
        String resposta12 = sc.next();
        verificar(resposta12, "D");

        System.out.println("\nPergunta 13:");
        System.out.println("Qual o nome do evento astronômico responsável pelo dia mais longo do ano?");
        System.out.println("a)- Equinócio de outono");
        System.out.println("b)- Solstício de inverno");
        System.out.println("c)- Solstício de verão");
        System.out.println("d)- Solstício de outono");
        System.out.print("Resposta: ");
        String resposta13 = sc.next();
        verificar(resposta13, "C");

        System.out.println("\nPergunta 14:");
        System.out.println("Quantos pares de costelas um ser humano, normalmente, possui?");
        System.out.println("a)- 5");
        System.out.println("b)- 8");
        System.out.println("c)- 10");
        System.out.println("d)- 12");
        System.out.print("Resposta: ");
        String resposta14 = sc.next();
        verificar(resposta14, "D");

        System.out.println("\nPergunta 15:");
        System.out.println("Para além do movimento de rotação (em seu próprio eixo) " +
                "e translação (ao redor do Sol), o planeta Terra realiza quais outros movimentos?");
        System.out.println("a)- Precessão, Nutação e Oscilação de Chandler");
        System.out.println("b)- Solstício e Equinócio");
        System.out.println("c)- Nutação, Gravitação e Revolução");
        System.out.println("d)- Precessão, Nutação e Solstício");
        System.out.print("Resposta: ");
        String resposta15 = sc.next();
        verificar(resposta15, "A");
        System.out.printf("Você acertou %d/5 questôes neste nível.%n", acertos);

        total+=acertos;
        System.out.println(Interface.corVermelho+"\n-------------------------------------------------------------------------------------------------------"+Interface.reset);
        System.out.printf("%s       Nivel: %d(Difícil)           Pontuação:%.2f   Total de acertos: (%d)%n", name, nivel, pontuacao, total);
        System.out.println(Interface.corVermelho+"-------------------------------------------------------------------------------------------------------"+Interface.reset);


    }

    private void level0() {
        nivel = 1;
        System.out.println(Interface.corVermelho+"-----------------------------------------------------------------------------"+Interface.reset);
        System.out.printf("Nome: %s    Nivel: %d(Fácil)         Pontuação: %.2f%n", name, nivel, pontuacao);
        System.out.println(Interface.corVermelho+"-----------------------------------------------------------------------------"+Interface.reset);
        System.out.println("\nPara cada questão, pressione a letra que corresponde a alternativa -(a), (b), (c) ou (d)");

        System.out.println("Pergunta 1:");
        System.out.println("Quantas vogais há na palavra pesqueiro?");
        System.out.println("a)- 3");
        System.out.println("b)- 9");
        System.out.println("c)- 5");
        System.out.println("d)- 0");
        System.out.print("Resposta: ");
        String resposta1 = sc.next();
        verificar(resposta1, "C");

        System.out.println("\nPergunta 2:");
        System.out.println("Qual é a décima sexta letra do alfabeto?");
        System.out.println("a)- M");
        System.out.println("b)- P");
        System.out.println("c)- R");
        System.out.println("d)- N");
        System.out.print("Resposta: ");
        String resposta2 = sc.next();
        ;
        verificar(resposta2, "B");

        System.out.println("\nPergunta 3:");
        System.out.println("Qual país tem como capital a cidade de Lisboa?");
        System.out.println("a)- Espanha");
        System.out.println("b)- Portugal");
        System.out.println("c)- Chile");
        System.out.println("d)- Guatemala");
        System.out.print("Resposta: ");
        String resposta3 = sc.next();
        verificar(resposta3, "B");

        System.out.println("\nPergunta 4:");
        System.out.println("Quantos segundos há em duas horas?");
        System.out.println("a)- 7200");
        System.out.println("b)- 3600;");
        System.out.println("c)- 2800");
        System.out.println("d)- 6900");
        System.out.print("Resposta: ");
        String resposta4 = sc.next();
        verificar(resposta4, "A");

        System.out.println("\nPergunta 5:");
        System.out.println("A metade de 2 x 8 é igual a?");
        System.out.println("a)- 12");
        System.out.println("b)- 16");
        System.out.println("c)- 8");
        System.out.println("d)- 10");
        System.out.print("Resposta: ");
        String resposta5 = sc.next();
        verificar(resposta5, "C");

        System.out.printf("%nVocê acertou %d/5 questôes neste nível.%n", acertos);
        total += acertos;
        acertos = 0;
        nivel = 2;
        System.out.println(Interface.corVermelho+"\n-------------------------------------------------"+Interface.reset);
        System.out.printf("Nivel: %d(Médio)              Pontuação: %.2f%n", nivel, pontuacao);
        System.out.println(Interface.corVermelho+"-------------------------------------------------"+Interface.reset);

        System.out.println("\nPergunta 6:");
        System.out.println("Qual é o segundo esporte mais praticado no Brasil?");
        System.out.println("a)- futebol");
        System.out.println("b)- vôlei");
        System.out.println("c)- natação");
        System.out.println("d)- judô");
        System.out.print("Resposta: ");
        String resposta6 = sc.next();
        verificar(resposta6, "B");


        System.out.println("\nPergunta 7:");
        System.out.println("Um ângulo de 90º é um ângulo?");
        System.out.println("a)- reto");
        System.out.println("b)- obtuso");
        System.out.println("c)- agudo");
        System.out.println("d)- raso");
        System.out.print("Resposta: ");
        String resposta7 = sc.next();
        verificar(resposta7, "A");

        System.out.println("\nPergunta 8:");
        System.out.println("Qual é o substantivo usado para se referir a um grupo de lobos?");
        System.out.println("a)- matilha");
        System.out.println("b)- bando");
        System.out.println("c)- lobos");
        System.out.println("d)- alcateia");
        System.out.print("Resposta: ");
        String resposta8 = sc.next();
        verificar(resposta8, "D");

        System.out.println("\nPergunta 9:");
        System.out.println("Em qual país fica Machu Picchu?");
        System.out.println("a)- Chile");
        System.out.println("b)- Venezuela");
        System.out.println("c)- Peru");
        System.out.println("d)- Argentina");
        System.out.print("Resposta: ");
        String resposta9 = sc.next();
        verificar(resposta9, "C");

        System.out.println("\nPergunta 10:");
        System.out.println("Qual o número mínimo de jogadores numa partida de futebol?");
        System.out.println("a)- 7");
        System.out.println("b)- 10");
        System.out.println("c)- 9");
        System.out.println("d)- 5");
        System.out.print("Resposta: ");
        String resposta10 = sc.next();
        verificar(resposta10, "a");

        System.out.printf("%nVocê acertou %d/5 questôes neste nível.%n", acertos);
        total += acertos;
        acertos = 0;

        nivel = 3;
        System.out.println(Interface.corVermelho+"\n-----------------------------------------------"+Interface.reset);
        System.out.printf("Nivel: %d(Difícil)         Pontuação: %.2f%n", nivel, pontuacao);
        System.out.println(Interface.corVermelho+"-----------------------------------------------"+Interface.reset);

        System.out.println("\nPergunta 11:");
        System.out.println("Qual o país mais novo do mundo?");
        System.out.println("a)- Timor Leste");
        System.out.println("b)- Kosovo");
        System.out.println("c)- Montenegro");
        System.out.println("d)- Sudão do Sul");
        System.out.print("Resposta: ");
        String resposta11 = sc.next();
        verificar(resposta11, "D");

        System.out.println("\nPergunta 12:");
        System.out.println("Qual o lugar mais profundo dos oceanos?");
        System.out.println("a)- Fossa de Bentley");
        System.out.println("b)- Fossa das Marianas");
        System.out.println("c)- Fossa de Tonga");
        System.out.println("d)- Fossa de Java");
        System.out.print("Resposta: ");
        String resposta12 = sc.next();
        verificar(resposta12, "D");

        System.out.println("\nPergunta 13:");
        System.out.println("Qual o nome do evento astronômico responsável pelo dia mais longo do ano?");
        System.out.println("a)- Equinócio de outono");
        System.out.println("b)- Solstício de inverno");
        System.out.println("c)- Solstício de verão");
        System.out.println("d)- Solstício de outono");
        System.out.print("Resposta: ");
        String resposta13 = sc.next();
        verificar(resposta13, "C");

        System.out.println("\nPergunta 14:");
        System.out.println("Quantos pares de costelas um ser humano, normalmente, possui?");
        System.out.println("a)- 5");
        System.out.println("b)- 8");
        System.out.println("c)- 10");
        System.out.println("d)- 12");
        System.out.print("Resposta: ");
        String resposta14 = sc.next();
        verificar(resposta14, "D");

        System.out.println("\nPergunta 15:");
        System.out.println("Para além do movimento de rotação (em seu próprio eixo) " +
                "e translação (ao redor do Sol), o planeta Terra realiza quais outros movimentos?");
        System.out.println("a)- Precessão, Nutação e Oscilação de Chandler");
        System.out.println("b)- Solstício e Equinócio");
        System.out.println("c)- Nutação, Gravitação e Revolução");
        System.out.println("d)- Precessão, Nutação e Solstício");
        System.out.print("Resposta: ");
        String resposta15 = sc.next();
        verificar(resposta15, "A");
        System.out.printf("%nVocê acertou %d/5 questôes neste nível%n", acertos);
        total += acertos;

        System.out.println(Interface.corVermelho+"\n-------------------------------------------------------------------------------------------------------"+Interface.reset);
        System.out.printf("%s       Nivel: %d(Difícil)           Pontuação:%.2f   Total de acertos: %d/15%n", name, nivel, pontuacao, total);
        System.out.println(Interface.corVermelho+"-------------------------------------------------------------------------------------------------------"+Interface.reset);
    }

}
