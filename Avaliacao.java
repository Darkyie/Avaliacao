    // Criação dos atributos 
public class Avaliacao {
    String nome;
    String tipoAvaliacao;
    double notaMaxima;
    // Criação do construtor sem atributos
    public Avaliacao() {
        this.nome = "";
        this.tipoAvaliacao = "";
        this.notaMaxima = 0.0;
    }
    // Criação do construtor com atributos
    public Avaliacao(String nome, String tipoAvaliacao, double notaMaxima) {
        this.nome = nome;
        this.tipoAvaliacao = tipoAvaliacao;
        this.notaMaxima = notaMaxima;
    }
    // Criação da função calcularPercentual
    public double calcularPercentual() {
        return (this.notaMaxima / 10.0) * 100.0;
    }
    // Override no método toString
    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Tipo de Avaliação: " + this.tipoAvaliacao + ", Nota Máxima: " + this.notaMaxima + ", Percentual da Nota Final: " + calcularPercentual() + "%";
    }
}
