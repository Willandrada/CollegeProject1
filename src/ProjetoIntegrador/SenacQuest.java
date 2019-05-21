package ProjetoIntegrador;

import java.util.Scanner;

public class SenacQuest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        String classe;
        boolean nam = false;
        int job = 0;
        int inteligencia = 0, carisma = 0, energia = 0;
        System.out.println("Seja bem-vindo ao SENAC Quest!"
                + "\n\nESTE JOGO SE TRATA DE UMA OBRA DE FICÇÃO, QUALQUER SEMELHANÇA É MERA COINCIDÊNCIA!"
                + "\n\nDesenvolvido por: Gian Carlos, Giovanni Carignato, Gabriel Negrão e William Andrada");
        System.out.println("\n\nDigite o nome do seu jogador:");
        nome = input.next();
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

        /*Colocar um laço de repetição enquanto a classe que o usuário escolher for inválida
         */
        switch (classe) {
            case "Calouro":
            case "calouro":
            case "1":
                job = 1;
                inteligencia = 10;
                carisma = 10;
                energia = 100;
                System.out.println("Você escolheu a classe Calouro! (`·´)ง");
                System.out.println("Atributos: Inteligência = " + inteligencia + " | Carisma = " + carisma + " | Energia = " + energia);
                break;
            case "Nerd":
            case "nerd":
            case "2":
                job = 2;
                inteligencia = 70;
                carisma = 10;
                energia = 50;
                System.out.println("Você escolheu a classe Nerd! (ರ_ರ-)/");
                System.out.println("Atributos: Inteligência = " + inteligencia + " | Carisma = " + carisma + " | Energia = " + energia);
                break;
            case "Popular":
            case "popular":
            case "3":
                job = 3;
                inteligencia = 10;
                carisma = 70;
                energia = 50;
                System.out.println("Você escolheu a classe Popular! (¬‿¬)ノ");
                System.out.println("Atributos: Inteligência = " + inteligencia + " | Carisma = " + carisma + " | Energia = " + energia);
                break;
            default:
                System.out.println("Classe inválida!");
                break;
        }
        boolean cond = false;
        System.out.println("\nHoje (Terça-Feira) é seu 1° dia de aula, " + nome + "! ");
        do {
            System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Algoritmos [1];"
                    + "\nDescansar [2];"
                    + "\nDar em cima das calouras [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            int y = input.nextInt();
            if (y == 1) {
                /*Adicionar random para ter a chance do professor faltar
                 */
                cond = true;
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre como funcionam as estruturas IF e ELSE!\n"
                        + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            } else if (y == 2) {
                cond = true;
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente mais inteligente...");
                energia = energia + 30;

            } else if (y == 3) {
                cond = true;
                if (job == 3) {
                    energia = energia - 30;
                    inteligencia = inteligencia + 15;
                    carisma = carisma + 30;
                    System.out.println(nome + " trocou olhares com uma garota no corredor e pediu o número dela. Seu nome é Aline.\n"
                            + nome + " se sente mais confiante.\n");
                } else if (carisma < 40) {
                    System.out.println(nome + " foi conversar com as garotas novas do seu curso e acabou conhecendo uma garota chamada Aline, e no fim do dia conseguiu o número dela.\n"
                            + nome + " se sente mais atraente, porém voltou tarde para casa e está cansado.");
                }

            } else if (y != 1 || y != 2 || y != 3) {
                System.out.println("Opção inválida! Digite [1], [2] ou [3] para prosseguir com o jogo!");
            }
        } while (cond != true);

        System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
        energia = energia + 20;
        System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

        if (energia > 100) {
            System.out.println("Você tem muita energia acumulada. Não acha melhor gastá-la indo para a aula?");
        }

        System.out.println("\nHoje (Quarta-Feira) é seu 2° dia de aula, " + nome + "!");
        do {
            System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Administração [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garotas [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            int y = input.nextInt();
            if (y == 1) {
                /*Adicionar random para ter a chance do professor faltar
                 */
                cond = true;
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre as Teorias de Fayol e Taylor!\n"
                        + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            } else if (y == 2) {
                cond = true;
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;

            } else if (y == 3) {
                cond = true;
                if (job == 3) {
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

            } else if (y != 1 || y != 2 || y != 3) {
                System.out.println("Opção inválida! Digite [1], [2] ou [3] para prosseguir com o jogo!");
            }
        } while (cond != true);

        System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
        energia = energia + 20;
        System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

        if (energia > 100) {
            System.out.println("Você tem muita energia acumulada. Não acha melhor gastá-la indo para a aula?");
        }

        System.out.println("\nHoje (Quinta-Feira) é seu 3° dia de aula, " + nome + "!");
        do {
            System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Pré-Cálculo [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            int y = input.nextInt();
            if (y == 1) {
                /*Adicionar random para ter a chance do professor faltar
                 */
                cond = true;
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre equações!\n"
                        + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            } else if (y == 2) {
                cond = true;
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;

            } else if (y == 3) {
                cond = true;
                if (job == 3) {
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
            } else if (y != 1 || y != 2 || y != 3) {
                System.out.println("Opção inválida! Digite [1], [2] ou [3] para prosseguir com o jogo!");
            }
        } while (cond != true);

        System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
        energia = energia + 20;
        System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

        if (energia > 100) {
            System.out.println("Você tem muita energia acumulada. Não acha melhor gastá-la indo para a aula?");
        }

        System.out.println("\nHoje (Sexta-Feira) é seu 4° dia de aula, " + nome + "!");
        do {
            System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Projeto Integrador [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            int y = input.nextInt();
            if (y == 1) {
                /*Adicionar random para ter a chance do professor faltar
                 */
                cond = true;
                System.out.println(nome + " escolheu assistir a aula e aperfeiçoou seus conhecimentos em SWITCH CASE!\n"
                        + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            } else if (y == 2) {
                cond = true;
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;

            } else if (y == 3) {
                cond = true;
                if (job == 3) {
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
            } else if (y != 1 || y != 2 || y != 3) {
                System.out.println("Opção inválida! Digite [1], [2] ou [3] para prosseguir com o jogo!");
            }
        } while (cond != true);

        System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
        energia = energia + 20;
        System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

        if (energia > 100) {
            System.out.println("Você tem muita energia acumulada. Não acha melhor gastá-la indo para a aula?");
        }
        System.out.println("\nHoje (Sábado) você não tem aula, " + nome + "!");
        do {
            System.out.println("\nVocê deseja:"
                    + "\nReforçar os estudos [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            int y = input.nextInt();
            if (y == 1) {
                cond = true;
                System.out.println(nome + " escolheu ficar em casa e aperfeiçoar seus estudos em programação.\n"
                        + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

                System.out.println("\nNo fim do dia, você vai pra cama após o jantar.");
                energia = energia + 20;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            } else if (y == 2) {
                cond = true;
                System.out.println(nome + " aproveitou o fim de semana para dormir.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;
                System.out.println("\nNo fim do dia, você volta pra cama após o jantar.");
                energia = energia + 20;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            } else if (y == 3) {
                cond = true;
                if (job == 3) {
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
            } else if (y != 1 || y != 2 || y != 3) {
                System.out.println("Opção inválida! Digite [1], [2] ou [3] para prosseguir com o jogo!");
            }

            System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
            energia = energia + 20;
            System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

        } while (cond != true);

        if (energia > 100) {
            System.out.println("Você tem muita energia acumulada. Não acha melhor gastá-la indo para a aula?");
        }
        System.out.println("\nHoje (Domingo) você não tem aula, " + nome + "!");
        do {
            System.out.println("\nVocê deseja:"
                    + "\nReforçar os estudos [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            int y = input.nextInt();
            if (y == 1) {
                cond = true;
                System.out.println(nome + " escolheu ficar em casa e aperfeiçoar seus estudos em programação.\n"
                        + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

                System.out.println("\nNo fim do dia, você vai pra cama após o jantar.");
                energia = energia + 20;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            } else if (y == 2) {
                cond = true;
                System.out.println(nome + " aproveitou o fim de semana para dormir.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;
                System.out.println("\nNo fim do dia, você volta pra cama após o jantar.");
                energia = energia + 20;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            } else if (y == 3) {
                cond = true;
                if (job == 3) {
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

            } else if (y != 1 || y != 2 || y != 3) {
                System.out.println("Opção inválida! Digite [1], [2] ou [3] para prosseguir com o jogo!");
            }
        } while (cond != true);

        System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
        energia = energia + 20;
        System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

        if (energia > 100) {
            System.out.println("Você tem muita energia acumulada. Não acha melhor gastá-la indo para a aula?");

        }
        System.out.println("\nHoje (Terça-Feira) é seu 5° dia de aula, " + nome + "! ");
        do {
            System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Algoritmos [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            int y = input.nextInt();
            if (y == 1) {
                /*Adicionar random para ter a chance do professor faltar
                 */
                cond = true;
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre como funcionam os laços de repetição!\n"
                        + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            } else if (y == 2) {
                cond = true;
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;

            } else if (y == 3) {
                cond = true;
                if (job == 3) {
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
            } else if (y != 1 || y != 2 || y != 3) {
                System.out.println("Opção inválida! Digite [1], [2] ou [3] para prosseguir com o jogo!");
            }
        } while (cond != true);

        System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
        energia = energia + 20;
        System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

        if (energia > 100) {
            System.out.println("Você tem muita energia acumulada. Não acha melhor gastá-la indo para a aula?");
        }
        System.out.println("\nHoje (Quarta-Feira) é seu 6° dia de aula, " + nome + "! ");
        do {
            System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Conceitos da Computação [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            int y = input.nextInt();
            if (y == 1) {
                /*Adicionar random para ter a chance do professor faltar
                 */
                cond = true;
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre como funciona a conversão entre bases decimais!\n"
                        + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            } else if (y == 2) {
                cond = true;
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;

            } else if (y == 3) {
                cond = true;
                if (job == 3) {
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
            
            /*
                Resolvido função opcação
            */
            } else if (y != 1 || y != 2 || y != 3) {
                System.out.println("Opção inválida! Digite [1], [2] ou [3] para prosseguir com o jogo!");
            }
            /*
                Resolvido função opcação
            */
        } while (cond != true);

        /*
        Ainda não Resolvido
        */
        System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
        energia = energia + 20;
        System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

        if (energia > 100) {
            System.out.println("Você tem muita energia acumulada. Não acha melhor gastá-la indo para a aula?");
        }

        System.out.println("\nHoje (Quinta-Feira) é seu 7° dia de aula, " + nome + "! ");
        do {
            System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Pré-Cálculo [1];"
                    + "\nDescansar [2];"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            int y = input.nextInt();
            if (y == 1) {
                /*Adicionar random para ter a chance do professor faltar
                 */
                cond = true;
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre como funcionam as funções!\n"
                        + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            } else if (y == 2) {
                cond = true;
                System.out.println(nome + " cabulou aula e foi direto pra casa depois do trabalho.\n" + nome + " está descansado, porém não se sente nem um pouco mais inteligente...");
                energia = energia + 30;

            } else if (y == 3) {
                cond = true;
                if (job == 3) {
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
            } else if (y != 1 || y != 2 || y != 3) {
                System.out.println("Opção inválida! Digite [1], [2] ou [3] para prosseguir com o jogo!");
            }
        } while (cond != true);

        /*
        Ainda não Resolvido
        */
        System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
        energia = energia + 20;
        System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);
        /*
        Ainda não Resolvido
        */

        if (energia > 100) {
            System.out.println("Você tem muita energia acumulada. Não acha melhor gastá-la indo para a aula?");
        }

        System.out.println("\nHoje (Sexta-Feira) é seu 8° dia de aula, " + nome + "! ");
        do {
            System.out.println("Oh não! Hoje é o dia de lançamento do jogo \"God of War\", que você estava esperando a tanto tempo!");
            System.out.println("\nVocê deseja:"
                    + "\nAssistir a aula de Projeto Integrador [1];"
                    + "\nJogar God of War [2]"
                    + "\nSair com uma garota [3];"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            int y = input.nextInt();
            if (y == 1) {
                /*Adicionar random para ter a chance do professor faltar
                 */
                cond = true;
                System.out.println(nome + " escolheu assistir a aula e aprendeu mais sobre laços de repetição!\n"
                        + nome + " está se sentindo mais inteligente, porém está cansado de tanto estudar.");
                inteligencia = inteligencia + 50;
                energia = energia - 30;
                System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            } else if (y == 2) {
                cond = true;
                System.out.println(nome + " passou a noite toda jogando \"God of War\" e gastou toda a sua energia! Melhor descansar por um tempo!");
                energia = energia - energia;

            } else if (y == 3) {
                cond = true;
                if (job == 3) {
                    energia = energia - 30;
                    carisma = carisma + 30;
                    System.out.println(nome + " aproveita um tempo com sua namorada. (Você deveria estar estudando!)");
                } else if (carisma < 310) {
                    nam = true;
                    carisma = carisma + 30;
                    energia = energia - 30;
                    System.out.println(nome + " pediu Aline em namoro e ela aceitou! Mandou bem!"
                            + nome + " está muito feliz com sua conquista!");

                } else if (y != 1 || y != 2 || y != 3) {
                    System.out.println("Opção inválida! Digite [1], [2] ou [3] para prosseguir com o jogo!");
                }
            }
        } while (cond != true);
        /*
        tomadaDecisao11
        */
        System.out.println("\nNo fim do dia, você chega em casa e vai direto pra cama.");
        energia = energia + 20;
        System.out.println("\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

        if (energia > 100) {
            System.out.println("Você tem muita energia acumulada. Não acha melhor gastá-la indo para a aula?");

        }
        /*Função já feita
        */
        
        System.out.println("\nHoje é o dia da prova, " + nome + "! ");
        int contador = 0;
        int contadorn = 0;
        do {
            System.out.println("\nVocê deseja:"
                    + "\nFazer a prova [1]"
                    + "\nDescansar porque sabe que vai reprovar [2]"
                    + "\n\nAtributos:" + " Inteligência: " + inteligencia + " Carisma: " + carisma + " Energia: " + energia);

            int y = input.nextInt();
            if (y == 1) {
                switch (job) {
                    case 2:
                        System.out.println("PROVA FINAL!"
                                + "\nEsta prova vai testar seus conhecimentos de todas as matérias!"
                                + "\nNormalmente a prova contém 10 questões, porém como você é um Nerd você só terá 5 questões! Viu como estudar valeu a pena no final?");
                        System.out.println("Questão 1: "
                                + "\nO que é IF em programação?"
                                + "\n[1] Utilizado para repetição;"
                                + "\n[2] Utilizado para decisão;"
                                + "\n[3] Utilizado para inserir um valor em uma variável;"
                                + "\n[4] Nenhuma das opções acima;");
                        int xn1 = input.nextInt();
                        if (xn1 == 2) {
                            contadorn = contadorn + 2;
                            cond = true;
                            System.out.println("Correto! Parabéns!");
                        } else if (xn1 == 1 || xn1 == 3 || xn1 == 4) {

                            cond = true;
                            System.out.println("Incorreto! Que azar!");

                        } else {
                            System.out.println("Opção inválida! Digite [1], [2], [3] ou [4] para responder as questões.");
                        }
                        System.out.println("Questão 2: "
                                + "\nQUESTÃO DE ADM1"
                                + "\n[1] 1"
                                + "\n[2] 2"
                                + "\n[3] 3"
                                + "\n[4] Nenhuma das opções acima;");
                        int xn2 = input.nextInt();
                        if (xn2 == 3) {
                            contadorn = contadorn + 2;
                            cond = true;
                            System.out.println("Correto! Parabéns!");
                        } else if (xn2 == 1 || xn2 == 2 || xn2 == 4) {

                            cond = true;
                            System.out.println("Incorreto! Que azar!");

                        } else {
                            System.out.println("Opção inválida! Digite [1], [2], [3] ou [4] para responder as questões.");
                        }
                        System.out.println("Questão 3: "
                                + "\nQUESTÃO DE CONCEITOS1"
                                + "\n[1] 1"
                                + "\n[2] 2"
                                + "\n[3] 3"
                                + "\n[4] Nenhuma das opções acima;");
                        int xn3 = input.nextInt();
                        if (xn3 == 3) {
                            contadorn = contadorn + 2;
                            cond = true;
                            System.out.println("Correto! Parabéns!");
                        } else if (xn3 == 1 || xn3 == 2 || xn3 == 4) {

                            cond = true;
                            System.out.println("Incorreto! Que azar!");

                        } else {
                            System.out.println("Opção inválida! Digite [1], [2], [3] ou [4] para responder as questões.");
                        }
                        System.out.println("Questão 4: "
                                + "\nQUESTÃO DE PRÉCALCULO1"
                                + "\n[1] 1"
                                + "\n[2] 2"
                                + "\n[3] 3"
                                + "\n[4] Nenhuma das opções acima;");
                        int xn4 = input.nextInt();
                        if (xn4 == 4) {
                            contadorn = contadorn + 2;
                            cond = true;
                            System.out.println("Correto! Parabéns!");
                        } else if (xn4 == 1 || xn4 == 2 || xn4 == 3) {

                            cond = true;
                            System.out.println("Incorreto! Que azar!");

                        } else {
                            System.out.println("Opção inválida! Digite [1], [2], [3] ou [4] para responder as questões.");
                        }
                        System.out.println("Questão 5: "
                                + "\nQUESTÃO DE PROGRAMAÇÃOAUTO10");
                        if (inteligencia > 400) {
                            contadorn = contadorn + 2;
                            cond = true;
                            System.out.println("Sua inteligência fez você escrever a questão 5 com muita confiança! Você acertou!");

                        } else if (inteligencia < 400) {
                            cond = true;
                            System.out.println("Que pena! Você não faz a menor idéia da resposta! Deveria ter estudado mais!");
                        }

                        System.out.println("Você tirou nota " + contadorn + " na prova!");
                        if (contadorn > 5) {
                            System.out.println("Parabéns! Você passou!");
                        } else if (contadorn < 6) {
                            System.out.println("Que pena, você não passou!");
                        }
                        cond = true;
                        break;
                    case 1:
                    case 3:
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
                        int x1 = input.nextInt();
                        if (x1 == 2) {
                            contador = contador + 1;
                            cond = true;
                            System.out.println("Correto! Parabéns!");
                        } else if (x1 == 1 || x1 == 3 || x1 == 4) {

                            cond = true;
                            System.out.println("Incorreto! Que azar!");

                        } else {
                            System.out.println("Opção inválida! Digite [1], [2], [3] ou [4] para responder as questões.");
                        }
                        System.out.println("Questão 2: "
                                + "\nO que é WHILE em programação?"
                                + "\n[1] Utilizado para repetição;"
                                + "\n[2] Utilizado para decisão;"
                                + "\n[3] Utilizado para inserir um valor em uma variável;"
                                + "\n[4] Nenhuma das opções acima;");
                        int x2 = input.nextInt();
                        if (x2 == 1) {
                            contador = contador + 1;
                            cond = true;
                            System.out.println("Correto! Parabéns!");
                        } else if (x2 == 2 || x2 == 3 || x2 == 4) {

                            cond = true;
                            System.out.println("Incorreto! Que azar!");

                        } else {
                            System.out.println("Opção inválida! Digite [1], [2], [3] ou [4] para responder as questões.");
                        }
                        System.out.println("Questão 3: "
                                + "\nQUESTÃO DE ADM1"
                                + "\n[1] 1"
                                + "\n[2] 2"
                                + "\n[3] 3"
                                + "\n[4] Nenhuma das opções acima;");
                        int x3 = input.nextInt();
                        if (x3 == 3) {
                            contador = contador + 1;
                            cond = true;
                            System.out.println("Correto! Parabéns!");
                        } else if (x3 == 1 || x3 == 2 || x3 == 4) {

                            cond = true;
                            System.out.println("Incorreto! Que azar!");

                        } else {
                            System.out.println("Opção inválida! Digite [1], [2], [3] ou [4] para responder as questões.");
                        }
                        System.out.println("Questão 4: "
                                + "\nQUESTÃO DE ADM2"
                                + "\n[1] 1"
                                + "\n[2] 2"
                                + "\n[3] 3"
                                + "\n[4] Nenhuma das opções acima;");
                        int x4 = input.nextInt();
                        if (x4 == 4) {
                            contador = contador + 1;
                            cond = true;
                            System.out.println("Correto! Parabéns!");
                        } else if (x4 == 1 || x4 == 2 || x4 == 3) {

                            cond = true;
                            System.out.println("Incorreto! Que azar!");

                        } else {
                            System.out.println("Opção inválida! Digite [1], [2], [3] ou [4] para responder as questões.");
                        }

                        System.out.println("Questão 5: "
                                + "\nQUESTÃO DE CONCEITOS1"
                                + "\n[1] 1"
                                + "\n[2] 2"
                                + "\n[3] 3"
                                + "\n[4] Nenhuma das opções acima;");
                        int x5 = input.nextInt();
                        if (x5 == 3) {
                            contador = contador + 1;
                            cond = true;
                            System.out.println("Correto! Parabéns!");
                        } else if (x5 == 1 || x5 == 2 || x5 == 4) {

                            cond = true;
                            System.out.println("Incorreto! Que azar!");

                        } else {
                            System.out.println("Opção inválida! Digite [1], [2], [3] ou [4] para responder as questões.");
                        }
                        System.out.println("Questão 6: "
                                + "\nQUESTÃO DE CONCEITOS2"
                                + "\n[1] 1"
                                + "\n[2] 2"
                                + "\n[3] 3"
                                + "\n[4] Nenhuma das opções acima;");
                        int x6 = input.nextInt();
                        if (x6 == 1) {
                            contador = contador + 1;
                            cond = true;
                            System.out.println("Correto! Parabéns!");
                        } else if (x4 == 2 || x4 == 3 || x4 == 4) {

                            cond = true;
                            System.out.println("Incorreto! Que azar!");

                        } else {
                            System.out.println("Opção inválida! Digite [1], [2], [3] ou [4] para responder as questões.");
                        }
                        System.out.println("Questão 7: "
                                + "\nQUESTÃO DE PRÉCALCULO1"
                                + "\n[1] 1"
                                + "\n[2] 2"
                                + "\n[3] 3"
                                + "\n[4] Nenhuma das opções acima;");
                        int x7 = input.nextInt();
                        if (x7 == 4) {
                            contador = contador + 1;
                            cond = true;
                            System.out.println("Correto! Parabéns!");
                        } else if (x7 == 1 || x7 == 2 || x7 == 3) {

                            cond = true;
                            System.out.println("Incorreto! Que azar!");

                        } else {
                            System.out.println("Opção inválida! Digite [1], [2], [3] ou [4] para responder as questões.");
                        }
                        System.out.println("Questão 8: "
                                + "\nQUESTÃO DE PRÉCALCULO2"
                                + "\n[1] 1"
                                + "\n[2] 2"
                                + "\n[3] 3"
                                + "\n[4] Nenhuma das opções acima;");
                        int x8 = input.nextInt();
                        if (x8 == 1) {
                            contador = contador + 1;
                            cond = true;
                            System.out.println("Correto! Parabéns!");
                        } else if (x8 == 2 || x8 == 3 || x8 == 4) {

                            cond = true;
                            System.out.println("Incorreto! Que azar!");

                        } else {
                            System.out.println("Opção inválida! Digite [1], [2], [3] ou [4] para responder as questões.");
                        }
                        System.out.println("Questão 9: "
                                + "\nQUESTÃO DE PROGRAMAÇÃOAUTO1");
                        if (inteligencia > 200) {
                            contador = contador + 1;
                            cond = true;
                            System.out.println("Sua inteligência fez você escrever a questão 9 com muita confiança! Você acertou!");

                        } else if (inteligencia < 200) {
                            cond = true;
                            System.out.println("Que pena! Você não faz a menor idéia da resposta! Deveria ter estudado mais!");

                        }
                        System.out.println("Questão 10: "
                                + "\nQUESTÃO DE PROGRAMAÇÃOAUTO10");
                        if (inteligencia > 400) {
                            contador = contador + 1;
                            cond = true;
                            System.out.println("Sua inteligência fez você escrever a questão 9 com muita confiança! Você acertou!");

                        } else if (inteligencia < 400) {
                            cond = true;
                            System.out.println("Que pena! Você não faz a menor idéia da resposta! Deveria ter estudado mais!");
                        }

                        System.out.println("Você tirou nota " + contador + " na prova!");
                        if (contador > 5) {
                            System.out.println("Parabéns! Você passou!");
                        } else if (contador < 6) {
                            System.out.println("Que pena, você não passou!");
                        }

                }
     
                if (y == 2) {
                    cond = true;
                    System.out.println(nome + " faltou no dia da prova e continuou jogando \"God of War\"! Pelo menos você conseguiu terminar o jogo!");
                    energia = energia - energia;

                } else if (y != 1 || y != 2) {
                    System.out.println("Opção inválida! Digite [1] ou [2] para prosseguir com o jogo!");
                /*Função já feita
                    
                */
                
                /* Final repetido.
                    
                */
                } else if (y == 2) {
                    cond = true;
                    System.out.println(nome + " faltou no dia da prova e continuou jogando \"God of War\"! Pelo menos você conseguiu terminar o jogo!"
                            + " não conseguiu se formar e terminou o jogo sozinho e sem diploma! Mais sorte da próxima!"
                            + "\nVocê chegou ao final n° 4, o PIOR final do jogo! ");
                    energia = energia - energia;

                } else if (y != 1 || y != 2) {
                    System.out.println("Opção inválida! Digite [1] ou [2] para prosseguir com o jogo!");

                }
               
                /* Função já feita.
                
                */
                if (contadorn > 5 || contador > 5) {

                    System.out.println("\nParabéns, " + nome + "! Você acabou o jogo com o diploma e uma namorada! Você é demais!"
                            + "\nVocê chegou ao final n° 1, o MELHOR final do jogo!");
                }
            } else if (contadorn < 5 || contador < 5) {
                System.out.println("\nNão foi dessa vez que você passou, " + nome + "! Pelo menos você terminou o jogo com uma namorada!"
                        + "\nVocê chegou ao final n° 2, o final NEUTRO!");

            } else if (contadorn > 5 || contador > 5) {
                System.out.println("\nParabéns, " + nome + "! Você acabou o jogo com o diploma, porém infelizmente acabou o jogo sozinho!"
                        + "\nVocê chegou ao final n° 3, o final BOM!");

            } else if (contadorn < 5 || contador < 5) {

                System.out.println(nome + " não conseguiu se formar e terminou o jogo sozinho e sem diploma! Mais sorte da próxima!"
                        + "\nVocê chegou ao final n° 4, o PIOR final do jogo!");
            }
               /* Função já feita.
                
                */
     

        } while (cond != true);
        /* Precisa fazer funcionar os diferentes tipos de finais. Não sei por que não tá funcionando
        Ele tá imprimindoa a mensagem de erro "Opção inválida! Digite [1] ou [2] para prosseguir com o jogo!" duplicadamente depois que você resolve a prova
        Deixei mais uns comentários no meio do código, dá uma olhada pra ver se você consegue fazer
        Se tiver alguma sugestão ou idéia fique a vontade pra mudar
        Não esquece de apagar esses comentários depois
        Valeu!    
         */
    }
}
