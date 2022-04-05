import java.util.Scanner;

public class cadastroSim {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // ! MENU
        System.out.println("\n\n\n______________________________________\n|   INFORME DE IMPOSTOS DA SIMCITY   |\n|                                    |\n|Selecione uma das opções abaixo:    |\n|                                    |\n|[1] Cadastrar o(a) Sim              |\n|[2] Mostrar Cadastro do(a) Sim      |\n|[3] Cadastro do(a) Sim              |\n|[4] Rendimentos do Sim cadastrado   |\n|[5] Imposto de Rendimento do Sim    |\n|[6] Sair da Calculadora             |\n|____________________________________|\n");
        int selecao = leitor.nextInt();

        if(selecao == 1){
            // ! CADASTRAR SIM
            System.out.println("\n :: O 'Cadastrar o(a) Sim' foi selecionado. ::\n");
            //::Outputs&Inputs simples::
            System.out.println("\n------------- CADASTRAR O(A) SIM -------------\nDigite primeiro nome e último sobrenome do(a) 'Sim': (DeuRuimAqui!)");
            String nomeSim = leitor.nextLine();

            System.out.println("\nQual a profissão do(a) 'Sim' "+"nomeSim(deuRuim!)"+"? ");
            String profissaoSim = leitor.nextLine();

            System.out.println("\nAgora, liste os salários-bases mensais do(a) 'Sim' "+profissaoSim+" "+"nomeSim(deuRuim!)"+":\n:: Obs.: Se por algum motivo não teve renda no mês, pressionar 'enter'. ::");

            //::Outputs&Inputs de repetição::
            double[] listaSalarios = new double[4];

            for (int i = 0; i < listaSalarios.length; i++) {
                System.out.println("Mês "+(i+1)+": R$ ");
                listaSalarios[i] = leitor.nextDouble();
            }
            System.out.println("\n :: Cadastro do(a) Sim "+"nomeSim(deuRuim!)"+" foi finalizado. Digite: [0] para voltar ou [QUALQUER TECLA] para sair do sistema.");
            Scanner leitor1 = new Scanner(System.in);
            int voltar = leitor1.nextInt();
            if(voltar == 0){
                System.out.println("::\n\n\n______________________________________\n|   INFORME DE IMPOSTOS DA SIMCITY   |\n|                                    |\n|Selecione uma das opções abaixo:    |\n|                                    |\n|[1] Cadastrar o(a) Sim              |\n|[2] Mostrar Cadastro do(a) Sim      |\n|[3] Cadastro do(a) Sim              |\n|[4] Rendimentos do Sim cadastrado   |\n|[5] Imposto de Rendimento do Sim    |\n|[6] Sair da Calculadora             |\n|____________________________________|\n:: Seleção inválida. Tente novamente. ::\n");
                selecao = leitor1.nextInt();
            }else{
                System.out.println(".\n\n\n:: Você saiu do Sistema.:: \n");
                System.exit(0);
            }
        }else if(selecao == 2){
            // ! CADASTRO DO(A) SIM
            System.out.println("\n :: O 'Mostrar Cadastro do(a) Sim' foi selecionado. ::\n");

            /*
        }else if(selecao == 3){
            System.out.println("'Rendimentos do Sim cadastrado' selecionado.");
                        // ! RENDIMENTOS DO SIM CADASTRADO
            System.out.println("\n------- RENDIMENTO ANUAL DO(A) SIM "+"nomeSim(deuRuim!)"+" -------");
            
            for (int i = 0; i < listaSalarios.length; i++){
                System.out.println("Mês "+(i+1)+": R$ "+listaSalarios[i]);
            }
        }else if(selecao == 4){
            System.out.println("'Imposto de Rendimento do Sim' selecionado.");
        }else if(selecao == 5){
            System.out.println("'Sair da Calculadora' selecionado.");
            System.exit(0);
*/
        }else{
            System.out.println("::\n\n\n______________________________________\n|   INFORME DE IMPOSTOS DA SIMCITY   |\n|                                    |\n|Selecione uma das opções abaixo:    |\n|                                    |\n|[1] Cadastrar o(a) Sim              |\n|[2] Mostrar Cadastro do(a) Sim      |\n|[3] Cadastro do(a) Sim              |\n|[4] Rendimentos do Sim cadastrado   |\n|[5] Imposto de Rendimento do Sim    |\n|[6] Sair da Calculadora             |\n|____________________________________|\n:: Seleção inválida. Tente novamente. ::\n");
            selecao = leitor.nextInt();
        }
    }
}

