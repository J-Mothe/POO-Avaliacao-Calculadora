//Para permitir o acesso ao atributo resultado da classe Calculadora a partir da subclasse CalculadoraAvançada,
//voce pode usar a visibilidade protected para o atributo resultado na classe Calculadora.
//A visibilidade protected permite que os atributos sejam acessados pelas subclasses.

public class CalculadoraAvançada extends Calculadora {
    private Double estadoSalvo;

    public CalculadoraAvançada() {
        // Chama o construtor da classe pai (Calculadora)
        super();
        this.estadoSalvo = null;
    }

    public void potencia(int expoente) {
        this.resultado = Math.pow(this.resultado, expoente);
    }

    public void raiz(int expoente) {
        this.resultado = Math.pow(this.resultado, 1.0 / expoente);
    }

    public void divisaoInteiro(double divisor) {
        this.resultado = (int) (this.resultado / divisor);
    }

    public void inverterSinal() {
        this.resultado = -this.resultado;
    }

    public void salvarEstado() {
        this.estadoSalvo = this.resultado;
    }

    public void carregarEstado() {
        if (this.estadoSalvo != null) {
            this.resultado = this.estadoSalvo;
        }
    }
}
