public class Luta {
    private Lutador desafiador;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public Lutador getDesafiador() {
        return desafiador;
    }
    public void setDesafiador(Lutador desafiador) {
        this.desafiador = desafiador;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1 , Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
            setAprovada(true);
            setDesafiador(l1);
            setDesafiante(l2);
        }
        else{
            setAprovada(false);
            setDesafiador(null);
            setDesafiante(null);
        }

    }

    public void lutar(){
        
        if(getAprovada()==true){
            desafiador.apresentar();
            desafiante.apresentar();
        }
    }

    
    
}
