package ProjetoIntegrador;
import java.util.Scanner;

public class SenacQuestPI {
    
    static Scanner input = new Scanner(System.in);
    
    /* Variáveis*/ 
    static String nome;
    static String [] testeClasse = {"calouro","Calouro","CALOURO","1","nerd","Nerd","NERD","2","popular","Popular","POPULAR","3"};   
    static int inteligencia = 0, carisma = 0, energia = 0, contador = 0, g = 0, j = 0;
    
    static void topoJogo1(){
        System.out.println("Seja bem-vindo ao SENAC Quest!"
                + "\n\nESTE JOGO SE TRATA DE UMA OBRA DE FICÇÃO, QUALQUER SEMELHANÇA É MERA COINCIDÊNCIA!"
                + "\n\nDesenvolvido por: Gian Carlos, Giovanni Carignato, Gabriel Negrão e William Andrada");
        System.out.println("\n\nDigite o nome do seu jogador:");
        nome = input.next();
    }
        
    static String topoJogo2(){
        String classe;
        System.out.println("\nSeja bem-vindo à aventura, " + nome + "!"
                + "\nEsse jogo é baseado nas escolhas que o jogador fizer. Dependendo de suas decisões, o final do jogo poderá ser diferente."
                + "\nVocê é um estudante do curso de Análise e Desenvolvimento de Sistemas do quinto semestre e seu objetivo é conseguir o diploma! \nPorém isso não será tão fácil quanto parece! Você precisará equilibrar entre sua vida pessoal e sua vida acadêmica se quiser terminar o jogo com o final verdadeiro."
                + "\nVocê deve agora escolher uma classe para iniciar o jogo:"
                + "\n\nClasses: \n - Calouro [1]\n - Nerd [2]\n - Popular [3]\n"
                + "\nCalouro: (`·´)"
                + "\n\nO calouro começa sem vantagem nos atributos, mas tem muito mais energia e facilidade para conseguir o melhor final do jogo.\nEscolha essa classe para uma experiência mais fácil.\n"
                + "\nNerd: (ರ_ರ-)"
                + "\n\nO jogador Nerd, começa com mais inteligência e tem mais facilidade para conseguir um dos quatro finais diferentes.\nEscolha essa classe para uma experiência normal.\n"
                + "\nPopular: (¬‿¬)"
                + "\n\nO popular começa com mais pontos de carisma e tem mais facilidade para conseguir um dos quatro finais diferentes.\nEscolha essa classe para uma experiência desafiadora.\n"
                + "\n\nEscolha sua classe:");
         classe = input.next();
         return classe;
    }
    
    static String repeticaoClasse (String classe){ 
        boolean classeValida = false;
        do {
            for (int i = 0; i < testeClasse.length; i++){   
                if (testeClasse[i].equals(classe)){
                    classeValida = true;
                }
            }    
            if (classeValida != true){
                System.out.println("Opção inválida!"
                    +"Insira um valor válido: ");
                 classe = input.next();
            }
        }while (classeValida == false);
       
        return classe;
    }
    
    static String escolhaClasse(String classe){
        switch (classe){
            case "Calouro":
            case "calouro":
            case "CALOURO":
            case "1":
                inteligencia = 10;
                carisma = 10;
                energia = 100;
                System.out.println("Você escolheu a classe Calouro! (`·´)ง");
                System.out.println("Atributos: Inteligência = " + inteligencia + " | Carisma = " + carisma + " | Energia = " + energia);
                break;
            case "Nerd":
            case "nerd":
            case "NERD":
            case "2":
                inteligencia = 70;
                carisma = 10;
                energia = 50;
                System.out.println("Você escolheu a classe Nerd! (ರ_ರ-)/");
                System.out.println("Atributos: Inteligência = " + inteligencia + " | Carisma = " + carisma + " | Energia = " + energia);
                break;
            case "Popular":
            case "popular":
            case "POPULAR": 
            case "3":
                inteligencia = 10;
                carisma = 70;
                energia = 50;
                System.out.println("Você escolheu a classe Popular! (¬‿¬)ノ");
                System.out.println("Atributos: Inteligência = " + inteligencia + " | Carisma = " + carisma + " | Energia = " + energia);
                break;
        }
        return classe;
    }
    
    static int diaUm(String classe){
        System.out.println("\nHoje (Terça-Feira) é seu 1° dia de aula, " + nome + "! ");
        System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Algoritmos [1];"
                    + "\nDescansar [2];"
                    + "\nDar em cima das calouras [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        int decisao = input.nextInt();
        return decisao;
    }
    
    static int diaDois(String classe){
        System.out.println("\nHoje (Quarta-Feira) é seu 2° dia de aula, " + nome + "!");
        System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Administração [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garotas [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        int decisao = input.nextInt();
        return decisao;
    }
    
    static int diaTres (String classe){
        System.out.println("\nHoje (Quinta-Feira) é seu 3° dia de aula, " + nome + "!");
        System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Pré-Cálculo [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        int decisao = input.nextInt();
        return decisao;
    }
    
    static int diaQuatro(String classe){
        System.out.println("\nHoje (Sexta-Feira) é seu 4° dia de aula, " + nome + "!");
        System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Projeto Integrador [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        int decisao = input.nextInt();
        return decisao;
    }
    
    static int sabado1(String classe){
        System.out.println("\nHoje (Sábado) você não tem aula, " + nome + "!");
        System.out.println("\nVocê deseja:"
                    + "\nReforçar os estudos [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        int decisao = input.nextInt();
        return decisao; 
    }
    
    static int domingo1(String classe){
        System.out.println("\nHoje (Domingo) você não tem aula, " + nome + "!");
        System.out.println("\nVocê deseja:"
                    + "\nReforçar os estudos [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        int decisao = input.nextInt();
        return decisao;
    }
    
    static int diaCinco(String classe){
        System.out.println("\nHoje (Terça-Feira) é seu 5° dia de aula, " + nome + "! ");
        System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Algoritmos [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        int decisao = input.nextInt();
        return decisao;
    }
    
    static int diaSeis(String classe){
        System.out.println("\nHoje (Quarta-Feira) é seu 6° dia de aula, " + nome + "! ");
        System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Conceitos da Computação [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        int decisao = input.nextInt();
        return decisao;
    }
    
    static int diaSete(String classe){
        System.out.println("\nHoje (Quinta-Feira) é seu 7° dia de aula, " + nome + "! ");
        System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Pré-Cálculo [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        int decisao = input.nextInt();
        return decisao;
    }
    
    static int diaOito(String classe){
        System.out.println("\nHoje (Sexta-Feira) é seu 8° dia de aula, " + nome + "! ");
        System.out.println("Oh não! Hoje é o dia de lançamento do jogo \"God of War\", que você estava esperando a tanto tempo!");
        System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Projeto Integrador [1];"
                    + "\nJogar God of War [2]"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        int decisao = input.nextInt();
        return decisao;
    }
    
    /*Usar o parâmentro da classeValida para o if do vetor.*/
    static void tomadaDecisao1(int decisao, String classe){
        if (decisao != 1 && decisao != 2 && decisao != 3)  {  
            decisao = opcao(decisao);
        } else if (decisao == 2 && energia > 100){
            decisao = decisaoEnergia(decisao);
        }
        switch (decisao) {
            case 1:
                /*Adicionar random para ter a chance do professor faltar
                */
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre como funcionam as estruturas IF e ELSE!\n"
                        + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
                break;
            case 2:
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente mais inteligente...");
                energia = energia + 30;
                break;
            case 3:
                contador++;
                namorada(classe);
                break;
        }
        energia = energia + 20;
        if (decisao != 2){
            System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
            System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        }

    }
    
    static void tomadaDecisao2(int decisao, String classe){
        if (decisao != 1 && decisao != 2 && decisao != 3)  {  
            decisao = opcao(decisao);
        } else if (decisao == 2 && energia > 100){
            decisao = decisaoEnergia(decisao);
        }
        switch (decisao) {
            case 1:
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre as Teorias de Fayol e Taylor!\n"
                    + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
                break;
            case 2:
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;
                break;
            case 3:
                contador++;
                namorada(classe);
                break;
        }

        energia = energia + 20;
        if (decisao != 2){
            System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
            System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        }
    }
    
    static void tomadaDecisao3(int decisao, String classe){
        if (decisao != 1 && decisao != 2 && decisao != 3)  {  
            decisao = opcao(decisao);
        } else if (decisao == 2 && energia > 100){
            decisao = decisaoEnergia(decisao);
        }
        switch (decisao) {
            case 1:
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre equações!\n"
                    + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
                break;
            case 2:
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;
                break;
            case 3:
                contador++;
                namorada(classe);
                break;
        }
        energia = energia + 20;
        if (decisao != 2){
            System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
            System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        }
    }
    
    static void tomadaDecisao4(String classe, int decisao){
        if (decisao != 1 && decisao != 2 && decisao != 3)  {  
            decisao = opcao(decisao);
        } else if (decisao == 2 && energia > 100){
            decisao = decisaoEnergia(decisao);
        }
        switch (decisao) {
            case 1:
                System.out.println(nome + " escolheu assistir a aula e aperfeiçoou seus conhecimentos em SWITCH CASE!\n"
                    + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
                break;
            case 2:
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;
                break;
            case 3:
                contador++;
                namorada(classe);
                break;
        }
        energia = energia + 20;
        if (decisao != 2){
            System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
            System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        }
    }
    
    static void tomadaDecisao5(int decisao, String classe){
        if (decisao != 1 && decisao != 2 && decisao != 3)  {  
            decisao = opcao(decisao);
        } else if (decisao == 2 && energia > 100){
            decisao = decisaoEnergia(decisao);
        }
        switch (decisao) {
            case 1:
                System.out.println(nome + " escolheu ficar em casa e aperfeiçoar seus estudos em programação.\n"
                    + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

                System.out.println("\nNo fim do dia, você vai pra cama após o jantar.");
                energia = energia + 20;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
                 break;
            case 2:
                System.out.println(nome + " aproveitou o fim de semana para dormir.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;
                System.out.println("\nNo fim do dia, você volta pra cama após o jantar.");
                energia = energia + 20;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
                break;
            case 3:
                contador++;
                namorada(classe);
                break;   
         }
        energia = energia + 20;
        if (decisao != 2){
            System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
            System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        }
    }
    
    static void tomadaDecisao6(int decisao, String classe){
        if (decisao != 1 && decisao != 2 && decisao != 3)  {  
            decisao = opcao(decisao);
        } else if (decisao == 2 && energia > 100){
            decisao = decisaoEnergia(decisao);
        }
        switch (decisao) {
            case 1:
                System.out.println(nome + " escolheu ficar em casa e aperfeiçoar seus estudos em programação.\n"
                    + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

                System.out.println("\nNo fim do dia, você vai pra cama após o jantar.");
                energia = energia + 20;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
                break;
            case 2:
                System.out.println(nome + " aproveitou o fim de semana para dormir.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;
                System.out.println("\nNo fim do dia, você volta pra cama após o jantar.");
                energia = energia + 20;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
                break;
            case 3:
                contador++;
                namorada(classe);
                break;
        }
        energia = energia + 20;
        if (decisao != 2){
            System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
            System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        }
        
    }
    
    static void tomadaDecisao7(int decisao, String classe){
        if (decisao != 1 && decisao != 2 && decisao != 3)  {  
            decisao = opcao(decisao);
        } else if (decisao == 2 && energia > 100){
            decisao = decisaoEnergia(decisao);
        }
        switch (decisao) {
            case 1:
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre como funcionam os laços de repetição!\n"
                    + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
                break;
            case 2:
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;
                break;
            case 3:
                contador++;
                namorada(classe);
                break;
        }
        energia = energia + 20;
        if (decisao != 2){
            System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
            System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        }
    }
    
    static void tomadaDecisao8(int decisao, String classe){
        if (decisao != 1 && decisao != 2 && decisao != 3)  {  
            decisao = opcao(decisao);
        } else if (decisao == 2 && energia > 100){
            decisao = decisaoEnergia(decisao);
        }
        switch (decisao) {
            case 1:
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre como funciona a conversão entre bases decimais!\n"
                    + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
                break;
            case 2:
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;
                break;
            case 3:
                contador++;
                namorada(classe);
                break;
        }
        energia = energia + 20;
        if (decisao != 2){
            System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
            System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        }
    }
    
    static void tomadaDecisao9(int decisao, String classe){
        if (decisao != 1 && decisao != 2 && decisao != 3)  {  
            decisao = opcao(decisao);
        } else if (decisao == 2 && energia > 100){
            decisao = decisaoEnergia(decisao);
        }
        switch (decisao) {
            case 1:
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre como funcionam as funções!\n"
                    + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
                break;
            case 2:
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;
                break;
            case 3:
                contador++;
                namorada(classe);
                break;
        }
        energia = energia + 20;
        if (decisao != 2){
            System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
            System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        }
    }
    
    static void tomadaDecisao10(int decisao, String classe){
        if (decisao != 1 && decisao != 2 && decisao != 3)  {  
            decisao = opcao(decisao);
        } else if (decisao == 2 && energia > 100){
            decisao = decisaoEnergia(decisao);
        }
        switch (decisao) {
            case 1:
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre laços de repetição!\n"
                    + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
                break;
            case 2:
                System.out.println(nome + " passou a noite toda jogando \"God of War\" e gastou toda a sua energia! Melhor descansar por um tempo!");
                energia = energia - energia;
                break;
            case 3:
                contador++;
                namorada(classe);
                break;
        }
        energia = energia + 20;
        if (decisao != 2){
            System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
            System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        }
    }
    
    static int tomadaDecProva(){
        int decisao;
        do{
            System.out.println("\nHoje é o dia da prova, " + nome + "! ");
            System.out.println("\nVocê deseja:"
                + "\nFazer a prova [1]"
                + "\nDescansar porque sabe que vai reprovar [2]"
                + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
            decisao = input.nextInt();
            if (decisao != 1 && decisao != 2){
                g++;
            } else if (decisao == 2){
                j++;
            }
        }while(decisao != 1 && decisao != 2);
        return decisao;
    }
   
    static int decisaoEnergia(int decisao){
        if (decisao == 2 && energia > 100) {
            System.out.println("Você tem muita energia acumulada. Não acha melhor gastá-la indo para a aula?");
        }
        decisao = input.nextInt();
        return decisao;
    }
    
    static int opcao(int decisao){
        while (decisao != 1 && decisao != 2 && decisao != 3) {
            System.out.println("Opção inválida! Digite [1], [2] ou [3] para prosseguir com o jogo!");
            decisao = input.nextInt();
        }
         return decisao;
    }
    
    static void namorada(String classe){
        switch(contador){
            case 1:
                if (testeClasse[8].equals(classe)||testeClasse[9].equals(classe)||testeClasse[10].equals(classe)||testeClasse[11].equals(classe)){
                    energia = energia - 30;
                    inteligencia = inteligencia + 15;
                    carisma = carisma + 30;
                    System.out.println(nome + " trocou olhares com uma garota no corredor e pediu o número dela. Seu nome é Aline.\n"
                        + nome + " se sente mais confiante.\n");
                } else if (carisma < 40) {
                    System.out.println(nome + " foi conversar com as garotas novas do seu curso e acabou conhecendo uma garota chamada Aline, e no fim do dia conseguiu o número dela.\n"
                        + nome + " se sente mais atraente, porém voltou tarde para casa e está cansado.");
                }
                break;
            case 2:
                if (testeClasse[8].equals(classe)||testeClasse[9].equals(classe)||testeClasse[10].equals(classe)||testeClasse[11].equals(classe)){
                    energia = energia - 30;
                    inteligencia = inteligencia + 15;
                    carisma = carisma + 30;
                    System.out.println(nome + " descobriu que a garota que pegou o número é da sua sala e a convidou para tomar um suco no intervalo e conversar.\n"
                        + nome + " se sente mais atraente.\n");
                } else if (carisma < 70) {
                    energia = energia - 30;
                    inteligencia = inteligencia + 15;
                    carisma = carisma + 30;
                    System.out.println(nome + " se encontrou com Aline na NASA e vocês ficaram conversando sobre a vida."
                        + nome + " se sente mais próximo de Aline, porém voltou tarde para casa e está cansado.");
                }
            case 3:
                if (testeClasse[8].equals(classe)||testeClasse[9].equals(classe)||testeClasse[10].equals(classe)||testeClasse[11].equals(classe)){
                    energia = energia - 30;
                    inteligencia = inteligencia + 15;
                    carisma = carisma + 30;
                    System.out.println(nome + " encontrou com Aline antes da aula para dar uns amassos.\n"
                        + nome + " se sente mais atraente.\n");
                } else if (carisma < 100) {
                    energia = energia - 30;
                    inteligencia = inteligencia + 15;
                    carisma = carisma + 30;
                    System.out.println(nome + " chamou Aline para comer na hora do intervalo. Os dois juntos não conseguiram terminar a batata! "
                        + nome + " se despede de Aline, e a única coisa que consegue pensar é em cair na cama.");
                }
                break;
            case 4:
                if (testeClasse[8].equals(classe)||testeClasse[9].equals(classe)||testeClasse[10].equals(classe)||testeClasse[11].equals(classe)){
                    energia = energia - 30;
                    carisma = carisma + 30;
                    System.out.println(nome + " chamou Aline para ir beber no posto próximo ao Senac. Depois de muita conversa jogada fora, os dois vão juntos para um lugar mais privado...\n"
                            + nome + " se sente mais atraente.\n");
                } else if (carisma < 130) {
                    energia = energia - 30;
                    inteligencia = inteligencia + 15;
                    carisma = carisma + 30;
                    System.out.println(nome + " convidou Aline para ir beber uma cerveja no posto depois da aula. Os dois não ficaram muito bem e foram embora de carona... "
                            + nome + " se despede de Aline, e a única coisa que consegue pensar é em dormir.");
                }
                break;
            case 5:
                if (testeClasse[8].equals(classe)||testeClasse[9].equals(classe)||testeClasse[10].equals(classe)||testeClasse[11].equals(classe)){
                    energia = energia - 30;
                    carisma = carisma + 30;
                    System.out.println(nome + " chamou Aline para ir no cinema assistir a um filme de terror. Os dois estão bem próximos.\n"
                            + nome + " leva Aline em casa, e ela te convida para entrar e passar a noite...");
                } else if (carisma < 160) {
                    carisma = carisma + 50;
                    energia = energia - 50;
                    System.out.println(nome + " chamou Aline para ir no cinema assistir a um filme de terror..\n"
                            + nome + " leva Aline em casa, e se despede com um beijo antes de ir embora.");
                }
                break;
            case 6:
                if (testeClasse[8].equals(classe)||testeClasse[9].equals(classe)||testeClasse[10].equals(classe)||testeClasse[11].equals(classe)){
                    energia = energia - 30;
                    carisma = carisma + 30;
                    System.out.println(nome + " aproveitou o domingo e chamou Aline para sair.\n"
                        + nome + " pediu ela em namoro e ela aceitou!\n"
                        + nome + " se despede no fim do dia de sua mais nova namorada e vai para casa.");
                } else if (carisma < 190) {
                    carisma = carisma + 50;
                    energia = energia - 50;
                    System.out.println(nome + " chamou Aline para ir ao parque fazer um piquenique. Os dois passaram a tarde juntos.\n"
                        + nome + " leva Aline em casa, e depois volta sozinho.");
                }
                break;
            case 7:
                if (testeClasse[8].equals(classe)||testeClasse[9].equals(classe)||testeClasse[10].equals(classe)||testeClasse[11].equals(classe)){
                    energia = energia - 30;
                    carisma = carisma + 30;
                    System.out.println(nome + " aproveita um tempo com sua namorada. (Você deveria estar estudando!)");
                } else if (carisma < 220) {
                    inteligencia = inteligencia + 30;
                    carisma = carisma + 30;
                    energia = energia - 30;
                    System.out.println(nome + " ajudou Aline com a lista de exercícios e ganhou um beijo!"
                        + nome + " se sente mais próximo dela, porém voltou tarde para casa e está cansado.");
                }
                break;
            case 8:
                if (testeClasse[8].equals(classe)||testeClasse[9].equals(classe)||testeClasse[10].equals(classe)||testeClasse[11].equals(classe)){
                    energia = energia - 30;
                    carisma = carisma + 30;
                    System.out.println(nome + " aproveita um tempo com sua namorada. (Você deveria estar estudando!)");
                } else if (carisma < 250) {
                    inteligencia = inteligencia + 30;
                    carisma = carisma + 30;
                    energia = energia - 30;
                    System.out.println(nome + " ajudou Aline com os estudos. Além de estar estudando, está ajudando sua gata!"
                        + nome + " se sente mais próximo dela e mais inteligente, porém voltou tarde para casa e está cansado.");
                }
                break;
            case 9:
                if (testeClasse[8].equals(classe)||testeClasse[9].equals(classe)||testeClasse[10].equals(classe)||testeClasse[11].equals(classe)){
                    energia = energia - 30;
                    carisma = carisma + 30;
                    System.out.println(nome + " aproveita um tempo com sua namorada. (Você deveria estar estudando!)");
                } else if (carisma < 280) {
                    inteligencia = inteligencia + 30;
                    carisma = carisma + 30;
                    energia = energia - 30;
                    System.out.println(nome + " ajudou Aline com os estudos. Além de estar estudando, está ajudando sua gata!"
                        + nome + " se sente mais próximo dela e mais inteligente, porém voltou tarde para casa e está cansado.");
                }
                break;
            case 10:
                if (testeClasse[8].equals(classe)||testeClasse[9].equals(classe)||testeClasse[10].equals(classe)||testeClasse[11].equals(classe)){
                    energia = energia - 30;
                    carisma = carisma + 30;
                    System.out.println(nome + " aproveita um tempo com sua namorada. (Você deveria estar estudando!)");
                } else if (carisma < 310) {
                    carisma = carisma + 30;
                    energia = energia - 30;
                    System.out.println(nome + " pediu Aline em namoro e ela aceitou! Mandou bem!"
                        + nome + " está muito feliz com sua conquista!");
                }
                break;    
        }
    }
    
    static int prova(String classe, int decisao){
        int resposta, notaProva = 0, correta = 0;
        if (decisao == 1) {
            switch (classe) {
                case "Nerd":
                case "nerd":
                case "NERD":
                case "2":
                    System.out.println("PROVA FINAL!"
                        + "\nEsta prova vai testar seus conhecimentos de todas as matérias!"
                        + "\nNormalmente a prova contém 10 questões, porém como você é um Nerd você só terá 5 questões! Viu como estudar valeu a pena no final?");
                    do {
                        System.out.println("Questão 1: "
                            + "\nO que é IF em programação?"
                            + "\n[1] Utilizado para repetição;"
                            + "\n[2] Utilizado para decisão;"
                            + "\n[3] Utilizado para inserir um valor em uma variável;"
                            + "\n[4] Nenhuma das opções acima;");
                        resposta = input.nextInt();
                        correta = 2;
                        if (resposta == correta){
                            notaProva = notaProva + 2;
                            System.out.println("Correto! Parabéns!");
                        } else if (resposta != correta) {
                            System.out.println("Incorreto! Que azar!");
                        }
                    }while (resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);

                    do {
                        System.out.println("Questão 2: "
                            + "\nQUESTÃO DE ADM1"
                            + "\n[1] 1"
                            + "\n[2] 2"
                            + "\n[3] 3"
                            + "\n[4] Nenhuma das opções acima;");
                        resposta = input.nextInt();
                        correta = 3;
                        if (resposta == correta){
                            notaProva = notaProva + 2;
                            System.out.println("Correto! Parabéns!");
                        } else if (resposta != correta) {
                            System.out.println("Incorreto! Que azar!");
                        }
                    }while (resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);

                    do {
                        System.out.println("Questão 3: "
                            + "\nQUESTÃO DE CONCEITOS1"
                            + "\n[1] 1"
                            + "\n[2] 2"
                            + "\n[3] 3"
                            + "\n[4] Nenhuma das opções acima;");
                        resposta = input.nextInt();
                        correta = 3;
                        if (resposta == correta){
                            notaProva = notaProva + 2;
                            System.out.println("Correto! Parabéns!");
                        } else if (resposta != correta) {
                            System.out.println("Incorreto! Que azar!");
                        }
                    }while (resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);

                    do {
                        System.out.println("Questão 4: "
                            + "\nQUESTÃO DE PRÉCALCULO1"
                            + "\n[1] 1"
                            + "\n[2] 2"
                            + "\n[3] 3"
                            + "\n[4] Nenhuma das opções acima;");
                        resposta = input.nextInt();
                        correta = 4;
                        if (resposta == correta){
                            notaProva = notaProva + 2;
                            System.out.println("Correto! Parabéns!");
                        } else if (resposta != correta) {
                            System.out.println("Incorreto! Que azar!");
                        }
                    }while (resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);
                    System.out.println("Questão 5: "
                                    + "\nQUESTÃO DE PROGRAMAÇÃOAUTO10");
                    if (inteligencia > 400){
                        System.out.println("Sua inteligência fez você escrever a questão 5 com muita confiança! Você acertou!");
                    }  else if (inteligencia < 400) {
                        System.out.println("Que pena! Você não faz a menor idéia da resposta! Deveria ter estudado mais!");
                    }
                    System.out.println("Você tirou nota " + notaProva + " na prova!");
                    if (notaProva > 5) {
                        System.out.println("Parabéns! Você passou!");
                    } else if (notaProva < 6) {
                        System.out.println("Que pena, você não passou!");
                    }
                    break;

                default:
                do {
                    System.out.println("PROVA FINAL!"
                        + "\nEsta prova vai testar seus conhecimentos de todas as matérias!"
                        + "\nSerão duas questões por matéria. Você precisa acertar pelo menos SEIS questões para passar."
                        + "\nDependendo do seu nível de inteligência, o número de questões da prova diminuirá. Viu como estudar é importante?");
                    System.out.println("Questão 1: "
                        + "\nO que é IF em programação?"
                        + "\n[1] Utilizado para repetição;"
                        + "\n[2] Utilizado para decisão;"
                        + "\n[3] Utilizado para inserir um valor em uma variável;"
                        + "\n[4] Nenhuma das opções acima;");
                    resposta = input.nextInt();
                    correta = 2;
                    if (resposta == correta){
                        notaProva = notaProva + 1;
                        System.out.println("Correto! Parabéns!");
                    } else if (resposta != correta) {
                        System.out.println("Incorreto! Que azar!");
                    }
                    }while (resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);

                do {
                    System.out.println("Questão 2: "
                        + "\nO que é WHILE em programação?"
                        + "\n[1] Utilizado para repetição;"
                        + "\n[2] Utilizado para decisão;"
                        + "\n[3] Utilizado para inserir um valor em uma variável;"
                        + "\n[4] Nenhuma das opções acima;");
                    resposta = input.nextInt();
                    correta = 1;
                    if (resposta == correta){
                        notaProva = notaProva + 1;
                        System.out.println("Correto! Parabéns!");
                    } else if (resposta != correta) {
                        System.out.println("Incorreto! Que azar!");
                    }
                }while(resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);

                do {
                    System.out.println("Questão 3: "
                        + "\nQUESTÃO DE ADM1"
                        + "\n[1] 1"
                        + "\n[2] 2"
                        + "\n[3] 3"
                        + "\n[4] Nenhuma das opções acima;");
                    resposta = input.nextInt();
                    correta = 3;
                    if (resposta == correta){
                        notaProva = notaProva + 1;
                        System.out.println("Correto! Parabéns!");
                    } else if (resposta != correta) {
                        System.out.println("Incorreto! Que azar!");
                    }
                }while(resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);

                do {
                    System.out.println("Questão 4: "
                        + "\nQUESTÃO DE ADM2"
                        + "\n[1] 1"
                        + "\n[2] 2"
                        + "\n[3] 3"
                        + "\n[4] Nenhuma das opções acima;");
                    resposta = input.nextInt();
                    correta = 4;
                    if (resposta == correta){
                        notaProva = notaProva + 1;
                        System.out.println("Correto! Parabéns!");
                    } else if (resposta != correta) {
                        System.out.println("Incorreto! Que azar!");
                    }
                }while(resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);

                do {
                    System.out.println("Questão 5: "
                        + "\nQUESTÃO DE CONCEITOS1"
                        + "\n[1] 1"
                        + "\n[2] 2"
                        + "\n[3] 3"
                        + "\n[4] Nenhuma das opções acima;");
                    resposta = input.nextInt();
                    correta = 3;
                    if (resposta == correta){
                        notaProva = notaProva + 1;
                        System.out.println("Correto! Parabéns!");
                    } else if (resposta != correta) {
                        System.out.println("Incorreto! Que azar!");
                    }
                }while(resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);

                do {
                    System.out.println("Questão 6: "
                        + "\nQUESTÃO DE CONCEITOS2"
                        + "\n[1] 1"
                        + "\n[2] 2"
                        + "\n[3] 3"
                        + "\n[4] Nenhuma das opções acima;");
                    resposta = input.nextInt();
                    correta = 1;
                    if (resposta == correta){
                        notaProva = notaProva + 1;
                        System.out.println("Correto! Parabéns!");
                    } else if (resposta != correta) {
                        System.out.println("Incorreto! Que azar!");
                    }
                }while(resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);

                do {
                    System.out.println("Questão 7: "
                        + "\nQUESTÃO DE PRÉCALCULO1"
                        + "\n[1] 1"
                        + "\n[2] 2"
                        + "\n[3] 3"
                        + "\n[4] Nenhuma das opções acima;");
                    resposta = input.nextInt();
                    correta = 4;
                    if (resposta == correta){
                        notaProva = notaProva + 1;
                        System.out.println("Correto! Parabéns!");
                    } else if (resposta != correta) {
                        System.out.println("Incorreto! Que azar!");
                    }
                }while(resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);

                do {
                    System.out.println("Questão 8: "
                        + "\nQUESTÃO DE PRÉCALCULO2"
                        + "\n[1] 1"
                        + "\n[2] 2"
                        + "\n[3] 3"
                        + "\n[4] Nenhuma das opções acima;");
                    resposta = input.nextInt();
                    correta = 1;
                    if (resposta == correta){
                        notaProva = notaProva + 1;
                        System.out.println("Correto! Parabéns!");
                    } else if (resposta != correta) {
                        System.out.println("Incorreto! Que azar!");
                    }
                }while(resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);

                System.out.println("Questão 9: "
                    + "\nQUESTÃO DE PROGRAMAÇÃOAUTO1");
                if (inteligencia > 200) {
                    notaProva = notaProva + 1;
                    System.out.println("Sua inteligência fez você escrever a questão 9 com muita confiança! Você acertou!");
                } else if (inteligencia < 200) {
                    System.out.println("Que pena! Você não faz a menor idéia da resposta! Deveria ter estudado mais!");
                }

                System.out.println("Questão 10: "
                    + "\nQUESTÃO DE PROGRAMAÇÃOAUTO10");
                if (inteligencia > 400) {
                    notaProva = notaProva + 1;
                    System.out.println("Sua inteligência fez você escrever a questão 9 com muita confiança! Você acertou!");
                } else if (inteligencia < 400) {
                    System.out.println("Que pena! Você não faz a menor idéia da resposta! Deveria ter estudado mais!");
                }


            }
        
        } else if (decisao == 2){
            System.out.println(nome + " faltou no dia da prova e continuou jogando \"God of War\"! Pelo menos você conseguiu terminar o jogo!");
                energia = energia - energia;
       
        } else if (g > 0 && j == 2 ){
            System.out.println(nome + " faltou no dia da prova e continuou jogando \"God of War\"! Pelo menos você conseguiu terminar o jogo!"
                + " não conseguiu se formar e terminou o jogo sozinho e sem diploma! Mais sorte da próxima!"
                + "\nVocê chegou ao final n° 4, o PIOR final do jogo! ");
            energia = energia - energia;
        }
                
        return notaProva;
    }
    
    static void finais (int notaProva){
    
          if (contador > 5 && notaProva >= 6) {
                System.out.println("\nParabéns, " + nome + "! Você acabou o jogo com o diploma e uma namorada! Você é demais!"
                    + "\nVocê chegou ao final n° 1, o MELHOR final do jogo!");
            } else if (contador > 5 && notaProva < 6) {
                System.out.println("\nNão foi dessa vez que você passou, " + nome + "! Pelo menos você terminou o jogo com uma namorada!"
                    + "\nVocê chegou ao final n° 2, o final NEUTRO!");
            } else if (contador < 5 && notaProva >= 6) {
                System.out.println("\nParabéns, " + nome + "! Você acabou o jogo com o diploma, porém infelizmente acabou o jogo sozinho!"
                    + "\nVocê chegou ao final n° 3, o final BOM!");
            } else if (contador < 5 && notaProva < 6) {
                System.out.println(nome + " não conseguiu se formar e terminou o jogo sozinho e sem diploma! Mais sorte da próxima!"
                    + "\nVocê chegou ao final n° 4, o PIOR final do jogo!");
            }
    }
    
     static void diasDaSemana(String classe){
        int resultado, nota;
        for (int i = 1; i <= 11; i++){
            switch (i){
                case 1: 
                    resultado = diaUm(classe);
                    tomadaDecisao1(resultado, classe);
                    break;
                case 2:
                    resultado = diaDois(classe);
                    tomadaDecisao2(resultado, classe);
                    break;
                case 3:
                    resultado = diaTres(classe);
                    tomadaDecisao3(resultado, classe);
                    break;
                case 4: 
                    resultado = diaQuatro(classe);
                    tomadaDecisao4(classe, resultado);
                    break;
                case 5:
                    resultado = sabado1(classe);
                    tomadaDecisao5(resultado, classe);
                    break;
                case 6:
                    resultado = domingo1(classe);
                    tomadaDecisao6(resultado, classe);
                    break;
                case 7:
                    resultado = diaCinco(classe);
                    tomadaDecisao7(resultado, classe);
                    break;
                case 8:
                    resultado = diaSeis(classe);
                    tomadaDecisao8(resultado,classe);
                    break;
                case 9:
                    resultado = diaSete(classe);
                    tomadaDecisao9(resultado,classe);
                    break;
                case 10:
                    resultado = diaOito(classe);
                    tomadaDecisao10(resultado,classe);
                    break;
                case 11:
                    resultado = tomadaDecProva();
                    nota =  prova(classe, resultado);
                    finais(nota);
                    break;
            }
        }
       
    }
  
    public static void main(String[] args){
        topoJogo1();
        String classe = topoJogo2();
        String classeValida = repeticaoClasse(classe);
        escolhaClasse(classeValida);
        diasDaSemana(classeValida);
        
    
    }
    
}
