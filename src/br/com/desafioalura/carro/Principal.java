
public class Principal {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.modeloCarro("Astra");
        carro.precoCarroAno1(50.200);
        carro.precoCarroAno2(30.000);
        carro.precoCarroAno3(29.900);
        carro.exibirInfo();

        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.modeloCarro("Celta");
        modeloCarro.precoCarroAno1(30.00);
        modeloCarro.precoCarroAno2(20.000);
        modeloCarro.precoCarroAno3(10.900);
        modeloCarro.setMarca("Chevrolet");
        modeloCarro.setAnoLancamento(2000);




    }

}