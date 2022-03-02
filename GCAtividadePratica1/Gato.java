public class Gato extends Mamifero {
    private double comprimento_calda;

    public Gato(){}

    public Gato(double comprimento_calda){
        this.comprimento_calda = comprimento_calda;
    }
    
    public Gato(String nome, int idade, String cor_do_pelo, int id_mamifero, double comprimento_calda){
        super(nome, idade, cor_do_pelo, id_mamifero);
        this.comprimento_calda = comprimento_calda;
    }

    //Getters e Setters
    public void setComprimento_calda(double comprimento_calda){
        this.comprimento_calda = comprimento_calda;
    }
    public double getComprimento_calda(){
        return this.comprimento_calda;
    }

    public String getInformações(){
        String nome = getNome();
        int idade = getIdade();
        String cor_do_pelo = getCor_do_pelo();
        int id_mamifero = getId_mamifero();
        return "Nome: "+nome+"Idade: "+idade+"\nCor do Pelo: "+cor_do_pelo+"\nID: "+id_mamifero+"\nComprimento da Calda: "+comprimento_calda;
    }
}
