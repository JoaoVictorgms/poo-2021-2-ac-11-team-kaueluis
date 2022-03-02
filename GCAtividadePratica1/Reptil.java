public class Reptil extends Animal {
    private String cor_escama;
    private int id_reptil;

    public Reptil(){}

    public Reptil(String cor_escama, int id_reptil){
        this.cor_escama = cor_escama;
        this.id_reptil = id_reptil;
    }
    public Reptil(String nome, int idade, String cor_escama, int id_reptil){
        super(nome, idade);
        this.cor_escama = cor_escama;
        this.id_reptil = id_reptil;
    }

    //Getters e Setters
    public void setCor_escama(String cor_escama){
        this.cor_escama = cor_escama;
    }
    public void setId_reptil(int id_reptil){
        this.id_reptil = id_reptil;
    }

    public String getCor_escama(){
        return this.cor_escama;
    }
    public int getId_reptil(){
        return id_reptil;
    }

    public String getInformações(){
        String nome = getNome();
        int idade = getIdade();
        return "Nome: "+nome+"\nIdade: "+idade+"\nCor da Escama: "+cor_escama+"\nID do Reptil: "+id_reptil;
    }

}
