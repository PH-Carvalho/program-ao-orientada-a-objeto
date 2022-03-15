import java.util.Scanner;

public class App_Banco {
    public static void main(String[] args) throws Exception {
        Scanner teclado =new Scanner(System.in);

        Conta novaConta =new Conta();

        int opcao=0;
        System.out.println("Seja bem vindo ao App do Banco Sullym!");
        System.out.print("Qual é o seu nome?");

        novaConta.setNomeCliente(teclado.next());


        System.out.println("Senhor(a) "+novaConta.getNomeCliente()+ " Você deseja continuar e abrir uma conta?");

        System.out.println(" 1-Sim \n 2-não");
        opcao=teclado.nextInt();

        if(opcao==1){

            System.out.println("Seja bem vindo! "+novaConta.getNomeCliente()+". Qual tipo de conta você deseja abrir?");
                System.out.println(" Conta Corrente ==> 1 \n Conta Poupança ==> 2 ");
                System.out.print("opção.: ");
                int tipo= teclado.nextInt();

                if(tipo==1){
                    novaConta.abrirConta("cc");
                }
                else if(tipo==2){
                    novaConta.abrirConta("cp");
                }
                else{ System.out.println("opção invalida");
                
                }

            do{
                
                System.out.println("Ok, "+novaConta.getNomeCliente()+ " Qual ação você deseja realizar?");
                System.out.println(" Digite.: \n Depositar ==> 1 \n Sacar ==> 2 \n Pagar mensalidade da Conta ==> 3 \n Perfil do Usúario ==> 4 \n Fechar conta ==> 5 \n Encerrar sessão ==> 6");
                
                opcao=teclado.nextInt();

                switch(opcao){

                    case 1: 
                        limparTela();
                        System.out.println("Qunto você deseja depositar");

                        float valorDeposito = teclado.nextFloat();
                        novaConta.depositar(valorDeposito);
                        System.out.println(novaConta.getSaldo());
                        
                        System.out.println("---------------------------------------------------");
                    break;

                    case 2: 
                    limparTela();
                        System.out.println("Quanto você deseja sacar");
                        float saque =teclado.nextFloat();
                        novaConta.sacar(saque);
                        System.out.println("----------------------------------------------------------");
                    break;
                    
                    case 3: 
                        limparTela();;
                         novaConta.pagamentoMensal();
                         System.out.println("------------------------------------------------------------e");
                    break;

                    case 4:
                        limparTela();
                        novaConta.estado_conta();
                        System.out.println("--------------------------------------------------------------------");
                    break;

                    case 5:
                    limparTela();
                        novaConta.fecharConta();
                    break;

                    case 6:
                    limparTela();
                            System.out.println("Muito obrigado pelo acesso volte sempre!!!");
                    break;  
                }

            }while(opcao!=6);

    }
        else{

            System.out.println("Ok,"+novaConta.getNomeCliente()+"Você pode retornar a qualquer momento para podermos abrir sua conta em nosso banco.");

        }
    teclado.close();
    
}

public static void limparTela() { // método para limpar a tela, pula linha 20 vezes
    for (int i = 0; i < 20; i++) {
      System.out.println();
    }
}
}
