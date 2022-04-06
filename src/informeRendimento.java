import java.util.Scanner;

public class informeRendimento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //## MENU ##
        //Layout
        boolean selecaoValida = true;
        String nomeSim = new String();
        String profissaoSim = new String();
        double[] listaSalarios = new double[2];//mostrando apenas 2 meses para rapida testagem
        int i = 0;

        do {      
            String layoutMenu = "::           MENU INICIAL           ::\n--------------------------------------\n|   INFORME DE IMPOSTOS DA SIMCITY   |\n|                                    |\n|Selecione uma das opções abaixo:    |\n|                                    |\n|[1] Cadastrar o(a) Sim              |\n|[2] Mostrar Cadastro do(a) Sim      |\n|[3] Rendimentos do Sim cadastrado   |\n|[4] Imposto de Rendimento do Sim    |\n|[5] Sair do Programa                |\n|____________________________________|\n::           MENU INICIAL           ::\n\n";
            String layout1 = ":::::::::::::::::::::::::::::::::::::::::::::\n|             CADASTRAR O(A) SIM            |\n---------------------------------------------\n\nNome e sobrenome: ";
            //String layout2 = "";
            //String layout3 = "";
            //String layout4 = "";  
            
            System.out.println(layoutMenu);
            
            //Métodos do Menu
            String[] selecoesMenu = new String [5];
            
            selecoesMenu[0] = ":: Selecionado: '[1] Cadastrar o(a) Sim ::'\n";
            selecoesMenu[1] = ":: Selecionado: '[2] Mostrar Cadastro do(a) Sim ::'\n";
            selecoesMenu[2] = ":: Selecionado: '[3] Rendimentos do Sim cadastrado ::'\n";
            selecoesMenu[3] = ":: Selecionado: '[4] Imposto de Rendimento do Sim ::'\n";
            selecoesMenu[4] = ":: Selecionado: '[5] Sair do Programa' ::\n::             À Bientôt!              ::\n";

            int selecao = leitor.nextInt();

            switch(selecao){
                case 1:{
                    selecaoValida = true;
                    //:: Outputs&Inputs Simples ::
                    System.out.println(selecoesMenu[0]);
                    System.out.println(layout1);
                    leitor.nextLine();
                    nomeSim = leitor.nextLine();
                    System.out.println("Cargo:");
                    profissaoSim = leitor.nextLine();
                    System.out.println("Salário-base mensal:");
                    //:: Outputs&Inputs de Repetição ::
                    for (i = 0; i < listaSalarios.length; i++) {
                        System.out.println("Mês "+(i+1)+": R$ ");
                        listaSalarios[i] = leitor.nextDouble();
                    }
                    System.out.println("_____________________________________________\n::                                           ::\n");
                    System.out.println(layoutMenu);
                    selecao = leitor.nextInt();
                    break;
                }

                case 2:{
                    selecaoValida = true;
                    leitor.nextInt();
                    System.out.println(selecoesMenu[1]);
                    System.out.println("::         CADASTRO DO(A) SIM         ::\n----------------------------------------\nNome: "+nomeSim+"\nCargo: "+profissaoSim+"\n. . . . . . . . . . . . . . . . . . . . \n----------------------------------------\n");
                    System.out.println("::     Pressione 1 p/ prosseguir    ::");
                    selecao = leitor.nextInt();
                    switch (selecao){
                        case 1:{
                            System.out.println(layoutMenu);
                        }
                        default:{
                            System.out.println("Pressione 1 para prosseguir, por favor.");
                        }
                    }
                }
                case 3:{
                    selecaoValida = true;
                    System.out.println(selecoesMenu[2]);
/*
                        :: Modulo Salários Mensais ::
                        for (i = 0; i < listaSalarios.length; i++) {
                        System.out.println("Mês "+(i+1)+": R$ "+listaSalarios[i]);
                    }
*/
                    System.out.println(layoutMenu);
                    selecao = leitor.nextInt();
                    break;
                }
                case 4:{
                    selecaoValida = true;
                    System.out.println(selecoesMenu[3]);
/*
                        :: Módulo Cálculo do IRSim ::                      
                        if(listaSalarios[i]<=2000.00) {
                        System.out.println("Mês "+(i+1)+": R$"+0.00);
                        
                    }else if(listaSalarios[i] > 2000.00 && listaSalarios[i] <= 3000.00){
                        System.out.println("Mês "+(i+1)+": R$"+listaSalarios[i]*0.08);

                    }else if(listaSalarios[i] > 3000.00 && listaSalarios[i] <= 4500.00){
                        System.out.println("Mês "+(i+1)+": R$"+listaSalarios[i]*0.18);
                    }else{
                        System.out.println("Mês "+(i+1)+": R$"+listaSalarios[i]*0.28);
                    }
*/
                    System.out.println(layoutMenu);
                    selecao = leitor.nextInt();
                    break;
                }
                case 5:{
                    selecaoValida = true;
                    System.out.println(selecoesMenu[4]);
                    System.exit(0);
                }
                default:{
                    selecaoValida = false;
                    System.out.println("Foi digitado: '"+selecao+"'. Essa opção não existe. Por favor, digite novamente: ");
                    System.out.println(selecoesMenu[4]);
                    System.out.println(layoutMenu);
                    selecao = leitor.nextInt();
                    leitor.close();
                }
            }
        }while(selecaoValida == true);
    }
}