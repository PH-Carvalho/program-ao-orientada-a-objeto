public class Aula04 {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
       // c1.setModelo("Bic");
        //c1.setPonta(2.0f);
        c1.status();

        System.out.println("Com o metodo getter vemos que o modelo da caneta é: " + c1.getModelo());


    }
}
