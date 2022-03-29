public class Lutador {
    private String nome,nacionalidade,categoria;
    private int idade,vitorias,derrotas,empates;
    private float altura,peso;

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.peso<52.0){
            this.categoria="invalido";
        }
        else if(this.peso<=70.3){
            this.categoria="Peso Leve";
        }
        else if(this.peso<=83.9){
            this.categoria="Peso Médio";
        }
        else if(this.peso<=128.3){
            this.categoria="Peso Pesado";
        }
        else{
            this.categoria="Invalido";
        }
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }  
    public Lutador(String nome, String nacionalidade, String categoria, int idade, int vitorias, int derrotas,
            int empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.categoria = categoria;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.peso = peso;
    }
    public Lutador() {
    }

    public void apresentar(){
        System.out.println("IIIIIIIIIIIIIIIIIIIIIIT`S TIMEEEEEEE!!!!!!!!!");
        System.out.println("Informação sobre o lutador. \n*------------------------------------------------------------*");
        System.out.println("Nome.: "+getNome());
        System.out.println("País de origem.: "+ getNacionalidade());
        System.out.println("Idade.: " + getIdade());
        System.out.println("Altura.: "+ getAltura() + "M");
        System.out.println("Peso.: "+ getPeso() + "Kg");
        System.out.println("Vitorias.: " + getVitorias());
        System.out.println("Derrotas.: " + getDerrotas());
        System.out.println("Empates.: "+ getEmpates());
        System.out.println("*------------------------------------------------------------*");
    }

    public void status(){
        System.out.println(getNome());
        System.out.println("Categoria " + getCategoria());
        System.out.println( getVitorias() + " Vitorias");
        System.out.println( getDerrotas() + " Derrotas");
        System.out.println( getEmpates() + " Empates");
    }

    public void ganharLuta(){
        setVitorias(getVitorias()+1); 
    }

    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }

    

    
    
}
