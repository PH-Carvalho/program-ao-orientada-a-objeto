import java.util.Scanner;

public class caneta {
    String modelo;
    String cor; 
    float ponta;
    int carga;
    Boolean tampada;

    void usuario(){
        System.out.println("Escreva a cor da sua caneta.");
        Scanner infoCor = new Scanner(System.in);
        cor = infoCor.nextLine();

       System.out.println("Escreva qual eh o modelo");
        Scanner infoModelo = new Scanner(System.in);
        modelo = infoModelo.nextLine();

       ponta = 1;
       tampada = false;
    }

    void status(){
        System.out.println("O modelo eh.: "+ this.modelo);
        System.out.println("A cor da caneta eh.: "+ this.cor);
        System.out.println("A ponta tem tamanho.: "+ this.ponta);
        System.out.println("A Carga é de.: " + this.carga + "%");
        
        if(tampada == true){
            System.out.println("Tampada");
        }
        else{
            System.out.println("Destampada");
        }
    }
    
    void rabiscar(){

    }

    void tampar(){

    }

    void destampar(){

    }

}
