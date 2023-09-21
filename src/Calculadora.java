
// Aluno:Joao Victor Mothe Vantil
// Matricula: 2112130053

public class Calculadora {
    // Atributo privado resultado
    // private double resultado;
    // Agora sera protected para CalculadoraAvançada funcionar
    protected double resultado;

    // Inicializa o resultado como zero
    public Calculadora() {
        this.resultado = 0;
    }

    // a) Somar valor ao resultado
    public void somar(double valor) {
        this.resultado += valor;
    }

    // b) Subtrair valor ao resultado
    public void subtrair(double valor) {
        this.resultado -= valor;
    }

    // c) Multiplicar o resultado por um valor
    public void multiplicar(double valor) {
        this.resultado *= valor;
    }

    // d) Dividir o resultado por um valor
    public void dividir(double valor) {
        // Verifica se o valor é zero
        if (valor != 0) {
            this.resultado /= valor;
        } else {
            System.out.println("Erro: Divisão por zero.");
        }
    }

    // e) Zerar o resultado
    public void zerar() {
        this.resultado = 0;
    }

    // f) Exibir o valor do resultado
    public void exibir() {
        System.out.println("Resultado: " + this.resultado);
    }

    // g) Mostrar o valor do resultado
    public double obterResultado() {
        return this.resultado;
    }

    /* public static void main(String[] args) {
        //Calculadora funcionando
        Calculadora CalculadoraTeste = new Calculadora();

        CalculadoraTeste.somar(1);
        CalculadoraTeste.multiplicar(6);
        CalculadoraTeste.dividir(2);
        CalculadoraTeste.subtrair(2);

        CalculadoraTeste.exibir();
    } */
}
