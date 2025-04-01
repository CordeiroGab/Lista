package Dados;

public class Funcionario {

    private Integer id;
    private String name;
    private Double Salario;



    public Funcionario(int id, String name, double Salario) {
        this.id = id;
        this.name = name;
        this.Salario = Salario;

    }
    public Funcionario() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    @Override
    public String toString() {

        return "ID: "+id + ", Nome: " + name+ ", "+ String.format("%.2f",Salario);
    }
    public void calcularSalario( double porcent) {
      Salario +=  (Salario * porcent)/100;

    }
}
