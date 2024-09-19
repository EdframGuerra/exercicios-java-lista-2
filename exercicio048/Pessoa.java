package exercicio048;

public class Pessoa {
    private String name;
    private int idade;
    private double salario;
    private  char sexo;
    private  char estadoCivil;

    public Pessoa(String name, int idade, double salario, char sexo, char estadoCivil) {
        this.name = name;
        this.idade = idade;
        this.salario = salario;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getEstadoSivil() {
        return estadoCivil;
    }

    public void setEstadoSivil(char estadoSivil) {
        this.estadoCivil = estadoSivil;
    }

    public void name(String name){
        if(name == null || name.trim().length() < 3){
            System.out.println("Nome invalido");
            return;
        }
    }

    public void idade(int idade){
        if(idade<0 || idade>150){
            System.out.println("idade ivalida");
            return;
        }
    }

    public void salario(double salario){
        if(salario<0.0){
            System.out.println("Salario invalido");
            return;
        }
    }

    public  void sexo(char sexo){
        if(sexo !='m'|| sexo!='f'){
            System.out.println("sexo invalido");
            return;
        }
    }

    public void estadoCivil(char estadoCivil){
        if(estadoCivil!='s'||estadoCivil!='c'||estadoCivil!='v'||estadoCivil!='d'){
            System.out.println("estado civil invalido");
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", sexo=" + sexo +
                ", estadoCivil=" + estadoCivil +
                '}';
    }
}
