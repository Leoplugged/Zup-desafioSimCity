import java.util.Scanner;

//Refazer Desafio

public class informeRendimento {
    public static void main(String[] args) {
        rodarPrograma();
    }

    public static void rodarPrograma() {
        Scanner leitorCad = new Scanner(System.in);
        String nomeSim = "";
        String profissaoSim = "";
        Double[] listaSalarios = new Double[12];
        for (int i = 0; i < 1000; i++) {     
            System.out.println("\n\n::           MENU INICIAL           ::\n--------------------------------------\n|   INFORME DE IMPOSTOS DA SIMCITY   |\n|                                    |\n|Selecione uma das opções abaixo:    |\n|                                    |\n|[1] Cadastrar o(a) Sim              |\n|[2] Mostrar Cadastro do(a) Sim      |\n|[3] Rendimentos do Sim cadastrado   |\n|[4] Imposto de Rendimento do Sim    |\n|[5] Sair do Programa                |\n|____________________________________|\n::           MENU INICIAL           ::\n\n");          
            int selecao = leitorCad.nextInt();

            if(selecao == 1){
                System.out.println("Nome Sim: ");
                nomeSim = leitorCad.next();
                System.out.println("Cargo do(a) Sim: ");
                profissaoSim = leitorCad.next();
                for (i = 0; i < listaSalarios.length; i++) {
                    System.out.println("Mês "+(i+1)+": R$ ");
                    listaSalarios[i] = leitorCad.nextDouble();
                }
            }
            if(selecao == 2){
                System.out.println("::         CADASTRO DO(A) SIM         ::\n----------------------------------------\nNome: "+nomeSim+"\nCargo: "+profissaoSim+"\n. . . . . . . . . . . . . . . . . . . . \n----------------------------------------\n");
            
            }
            if(selecao == 3){
                System.out.println("Mostrando Salários: ");
                for (i = 0; i < listaSalarios.length; i++) {
                    System.out.println("Mês "+(i+1)+": R$ "+listaSalarios[i]);
                }
            }
            if(selecao == 4){
                System.out.println("Imposto de Renda pago: ");
                for (i = 0; i < listaSalarios.length; i++) {
                    if(listaSalarios[i]<=2000.00) {
                        System.out.println("Mês "+(i+1)+": R$"+0.00);
                        
                    }else if(listaSalarios[i] > 2000.00 && listaSalarios[i] <= 3000.00){
                        System.out.println("Mês "+(i+1)+": R$"+listaSalarios[i]*0.08);

                    }else if(listaSalarios[i] > 3000.00 && listaSalarios[i] <= 4500.00){
                        System.out.println("Mês "+(i+1)+": R$"+listaSalarios[i]*0.18);
                    }else{
                        System.out.println("Mês "+(i+1)+": R$"+listaSalarios[i]*0.28);
                    }
                }
            }
            if(selecao == 5){
                System.exit(0);
            }

                /*cadastroSim(cadastroSim);
                System.out.println(selecoesMenu[1]);
                
                switch (selecao){
                    case 1:{
                    System.out.println(layoutMenu);
                    }
                    default:{
                    System.out.println("Pressione 1 para prosseguir, por favor.");
            
            }else{
                System.out.println(selecoesMenu[4]);
                System.exit(0);

            }
            
            }
            /*   System.out.println(layoutMenu);
                selecao = leitor.nextInt();

                case 2:{
                    selecaoValida = true;
                    
                        }
                    }
                    
                }
                case 3:{
                    selecaoValida = true;
                    System.out.println(selecoesMenu[2]);

                    

                    System.out.println(layoutMenu);
                    selecao = leitor.nextInt();
                    break;
                }
            case 4:{
                selecaoValida = true;
                System.out.println(selecoesMenu[3]);

                System.out.println(layoutMenu);
                selecao = leitor.nextInt();
                break;
            }
            case 5:{
                selecaoValida = true;

            }
            default:{
                selecaoValida = false;
                System.out.println("Foi digitado: '"+selecao+"'. Essa opção não existe. Por favor, digite novamente: ");
                System.out.println(selecoesMenu[4]);
                System.out.println(layoutMenu);
                selecao = leitor.nextInt();
            }*/
        }
    }
    
/*
    public static String[] cadastrarSim(String[] cadastrarSim) {
    //Cadastrar o(a) Sim
        Scanner leitorCad = new Scanner(System.in);
        int i = 0;

        

        System.out.println("Salário-base mensal:");
        
        
        }

        return cadastrarSim;
    }
    public static String[] cadastroSim(String[] cadastroSim) {
        //Cadastro do(a) Sim
        System.out.println("::     Pressione 1 p/ prosseguir    ::");
    }

    /*
                    :: Modulo Salários Mensais ::
                    for (i = 0; i < listaSalarios.length; i++) {
                    
                }
    */
    /*
                    :: Módulo Cálculo do IRSim ::                      
                    
*/
}
