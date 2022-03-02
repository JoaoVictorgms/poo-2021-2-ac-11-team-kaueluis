public class RegistraAluno{
    private String nome;
    private String endereco;
    private int idade;

    public RegistraAluno(){}

    public RegistraAluno(String nome, String endereco, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    //Getters e Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public int getIdade(){
        return this.idade;
    }

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Idade: "+idade);
    }

    public void imprimir(double mNota, double pNota, double gNota){
        System.out.println("Nome: "+nome);
        System.out.println("Nota Matemática: "+mNota);
        System.out.println("Nota Português: "+pNota);
        System.out.println("Nota Geografia: "+gNota);
    }
}