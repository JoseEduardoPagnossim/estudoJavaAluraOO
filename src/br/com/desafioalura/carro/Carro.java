public class Carro {

    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void modeloCarro( String modelo){
        this.modelo = modelo;
    }

    public void precoCarroAno1(double ano1){
        this.precoAno1 = ano1;
    }

    public void precoCarroAno2(double ano2){
        this.precoAno2 = ano2;
    }

    public void precoCarroAno3(double ano3){
        this.precoAno3 = ano3;
    }

    public void exibirInfo(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço do Carro no Ano 1: " + this.precoAno1);
        System.out.println("Preço do Carro no Ano 2: " + this.precoAno2);
        System.out.println("Preço do Carro no Ano 3: " + this.precoAno3);
        System.out.println("Menor Preço: " + calculaMenorPreco() );
        System.out.println("Maior Preço: " + calculaMaiorPreco() );
    }

    private double calculaMaiorPreco(){
        double maiorPreco = precoAno1;

        if(precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }

        if(precoAno3 > maiorPreco){
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }

    private double calculaMenorPreco(){
        double menorPreco = precoAno1;

        if(precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }

        if(precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }

        return menorPreco;
    }
}
