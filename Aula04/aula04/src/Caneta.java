
public class Caneta{
    public String modelo;
    private Float ponta;
    private boolean tampada;
    private String cor;

   public Caneta(){
       this.tampar();
        this.cor="Azul";
   }

   public String getModelo() {
        return this.modelo;
   }

   public void setModelo(String m){
       this.modelo=m;
   }

   public Float getPonta(){
       return this.ponta;
   }

   public void setPonta(Float d){
       this.ponta=d;
   }

   public void tampar(){
       this.tampada = true;

   }

   public void destampada (){
       this.tampada=false;
   }

   public void status(){

    System.out.println("Sobre A CANETA:");
    System.out.println("Modelo "+ this.getModelo());
    System.out.println("Ponta: " + this.getPonta());
    System.out.println("Cor: "+ this.cor);
   }
}
