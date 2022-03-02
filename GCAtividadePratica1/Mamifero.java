public class Mamifero extends Animal {
    private String cor_do_pelo;
    private int id_mamifero;

    public Mamifero(){}

    public Mamifero(String cor_do_pelo, int id_mamifero){
        this.cor_do_pelo = cor_do_pelo;
        this.id_mamifero = id_mamifero;
    }

    public Mamifero(String nome, int idade, String cor_do_pelo, int id_mamifero){
        super(nome, idade);
        this.cor_do_pelo = cor_do_pelo;
        this.id_mamifero = id_mamifero;
    }

    //Getters e Setters
    public void setCor_do_pelo(String cor_do_pelo){
        this.cor_do_pelo = cor_do_pelo;
    }
    public void setId_mamifero(int id_mamifero){
        this.id_mamifero = id_mamifero;
    }

    public String getCor_do_pelo(){
        return this.cor_do_pelo;
    }
    public int getId_mamifero(){
        return id_mamifero;
    }

    public String getInformações(){
        String nome = getNome();
        int idade = getIdade();
        return "Nome: "+nome+"\nIdade: "+idade+"\nCor do pelo: "+cor_do_pelo+"\nID: "+id_mamifero;
    }

}
