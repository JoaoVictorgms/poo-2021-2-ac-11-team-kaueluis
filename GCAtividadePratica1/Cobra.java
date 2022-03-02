public class Cobra extends Reptil{
    String tipo_veneno;

    public Cobra(){}

    public Cobra(String tipo_veneno){
        this.tipo_veneno = tipo_veneno;
    }
    public Cobra(String nome, int idade, String cor_escama, int id_reptil, String tipo_veneno){
        super(nome, idade, cor_escama, id_reptil);
        this.tipo_veneno = tipo_veneno;
    }

    //Getters e Setters
    public void setTipo_veneno(String tipo_veneno){
        this.tipo_veneno = tipo_veneno;
    }
    public String getTipo_veneno(){
        return this.tipo_veneno;
    }
    
    public String getInformações(){
        String nome = getNome();
        int idade = getIdade();
        String cor_escama = getCor_escama();
        int id_reptil = getId_reptil();

        return "Nome: "+nome+"\nIdade: "+idade+"\nCor da Escama: "+cor_escama+"\nID: "+id_reptil+"\nTipo do Veneno: "+tipo_veneno;
    }

}
