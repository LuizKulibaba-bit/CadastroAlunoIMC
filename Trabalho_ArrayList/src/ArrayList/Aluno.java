package ArrayList;

public class Aluno {

    private int codigo;
    private String nome;
    private String email;
    private double peso;
    private double altura;
    private String sexo; 

   
    public Aluno(int codigo, String nome, String email,
                 double peso, double altura, String sexo) {

        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    
    public double IMC() {
        return peso / (altura * altura);
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   
    public String toString() {

        return "Codigo: " + codigo +
               "\nNome: " + nome +
               "\nEmail: " + email +
               "\nPeso: " + peso +
               "\nAltura: " + altura +
               "\nSexo: " + sexo +
               "\nIMC: " + IMC();
    }

    
    public boolean equals(Object obj) {

        if (obj instanceof Aluno) {

            Aluno outro = (Aluno) obj;

            return this.codigo == outro.codigo;
        }

        return false;
    }
}


