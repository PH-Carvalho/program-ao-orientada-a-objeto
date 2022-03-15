import java.util.Scanner;

public class Conta {

    Scanner teclado= new Scanner(System.in);

    public int numConta;
    protected String tipoDaConta;
    private String nomeCliente;
    private float saldo;
    private boolean status;

    public void abrirConta(String tipoDaConta){
       
        setTipoDaConta(tipoDaConta);
        setStatus(true);


        if(tipoDaConta=="cc"){
            saldo=50;

            System.out.println("Escolha um numero para sua conta corrente");
            int numConta =teclado.nextInt();
            
            setNumConta(numConta);
        }
        else if(tipoDaConta=="cp"){
            saldo=150;

            System.out.println("Escolha um numero para sua conta poupança.");
            int numConta =teclado.nextInt();
            
            setNumConta(numConta);

        }
    }
    public void fecharConta(){
        if(saldo>0){
            System.out.println("Você ainda  têm saldo em conta");
        }
        else if(saldo<0){
            System.out.println("Você têm saldo negativo. liquide o seu débito para poder fechar sua conta.");
        }
        else{
            setStatus(false);
        }

    }

    public void depositar(float valorDeposito){
        if(status==true){
            saldo=saldo+valorDeposito;
        }else{
            System.out.println("conta está fechada.");
        }

    }

    public void sacar(float saque){
        
         if(status==false){
            System.out.println("Sua conta está fechada.");
        }
        else if(saldo<saque){
            System.out.println("Saldo insufisiente!");
        }
        else{
            if (status==true && saldo>0){
                if(saque<=this.saldo){
                
                    this.saldo=this.saldo-saque; 
                }
            }
        }

    }

    public void pagamentoMensal(){
        int pagamento=0;

        if(tipoDaConta=="cc"){
            pagamento=12;
        }
        else if(tipoDaConta=="cp"){
            pagamento=20;
        }

        if(status==true && saldo>pagamento){
            System.out.println("Pagamento realizado com sucesso!\n Seu saldo era de.: "+this.saldo+"R$");
            saldo=saldo-pagamento;
            System.out.println("Saldo atual.: "+this.saldo+"R$");

        }else if(status==false){
            System.out.println("A Conta está fechada, não há como realizar o pagamento.");
        }else if(saldo<pagamento){
            System.out.println("Seu Saldo é insuficíente para realizar o pagamento mensal.");

        }
        
    }
        public void estado_conta(){
           System.out.println("------------------------------------------------------");
           System.out.println("Informação do usúario: ");
           System.out.println("  Nome do usúario: "+getNomeCliente()); 
           System.out.println("  Numero da Conta: "+getNumConta());
           System.out.println("  Saldo: "+ getSaldo()+"R$");
           System.out.println("------------------------------------------------------");

        }

/* métodos especiais-------------------------------------*/

    public Conta(int numConta , String tipo , String nomeCliente, float saldo,boolean status){

        this.numConta=numConta;
        this.tipoDaConta=tipo;
        this.nomeCliente=nomeCliente;
        this.saldo=saldo;
        this.status=status;

    }
    public Conta(){

    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public int getNumConta(){
        return this.numConta;
    }

    public void setTipoDaConta(String tipo){

        this.tipoDaConta=tipo;
    }
    public String getTipoDaConta(){
        return this.tipoDaConta;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente=nomeCliente;
    }
    public String getNomeCliente(){

        return this.nomeCliente;
    }

    public void setSaldo(Float saldo){
        this.saldo=saldo;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean status){
        this.status=status;
    }
    public boolean getStatus(){
        return this.status;
    }

    
}
