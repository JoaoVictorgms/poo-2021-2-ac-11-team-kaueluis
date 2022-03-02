public class Cachorro extends Mamifero{
    private String raça;
    
    public Cachorro(){}

    public Cachorro(String raça){
        this.raça = raça;
    }
    
    public Cachorro(String nome, int idade, String cor_do_pelo, int id_mamifero, String raça){
        super(nome, idade, cor_do_pelo, id_mamifero);
        this.raça = raça;
    }

    //Getters e Setters
    public void setRaça(String raça){
        this.raça = raça;
    }
    public String getRaça(){
        return this.raça;
    }

    public String getInformações(){
        String nome = getNome();
        int idade = getIdade();
        String cor_do_pelo = getCor_do_pelo();
        int id_mamifero = getId_mamifero();
        return "Nome: "+nome+"Idade: "+idade+"\nCor do Pelo: "+cor_do_pelo+"\nID: "+id_mamifero+"\nRaça: "+raça;
    }
}

