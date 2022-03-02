public class Animal {
    private String nome;
    private int idade;
    
    public Animal(){}

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Getters e Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }

    public String getInformacoes(){
        return "Nome: "+nome+"\nIdade: "+idade;
    }
}
