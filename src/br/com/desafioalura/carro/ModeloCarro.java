public class ModeloCarro extends Carro {

    private String marca;
    private int anoLancamento;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void exibirInfo(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço do Carro no Ano 1: " + this.precoAno1);
        System.out.println("Preço do Carro no Ano 2: " + this.precoAno2);
        System.out.println("Preço do Carro no Ano 3: " + this.precoAno3);
        System.out.println("Menor Preço: " + calculaMenorPreco() );
        System.out.println("Maior Preço: " + calculaMaiorPreco() );
    }

}
