package Model;

public class TrechoRodovia {
    private double quilometroInicial, quilometroFinal, nivelVegetacao;

    public TrechoRodovia(double quilometroInicial, double quilometroFinal, double nivelVegetacao) {
        if (quilometroInicial < 0 || quilometroFinal < 0 || nivelVegetacao < 0) {
            throw new IllegalArgumentException("Valores não podem ser negativos");
        }
        if (quilometroInicial >= quilometroFinal) {
            throw new IllegalArgumentException("Quilômetro final deve ser maior que o inicial");
        }
        this.quilometroInicial = quilometroInicial;
        this.quilometroFinal = quilometroFinal;
        this.nivelVegetacao = nivelVegetacao;
    }

    public void quilometroRodado(){
        double quilometroRodado = quilometroFinal - quilometroInicial;
        System.out.println("Quilômetro da rodovia: " + quilometroRodado + "KM");
    }

    public void registrarCrescimento(double taxa){
        if (taxa > 0){
            setNivelVegetacao(nivelVegetacao + taxa);
            System.out.println("Nível de vegetação está: " + nivelVegetacao + "cm");
        } else {
            System.out.println("Taxa de crescimento deve ser positiva");
        }
    }

    public void setNivelVegetacao(double nivelVegetacao) {
        if (nivelVegetacao < 0) {
            throw new IllegalArgumentException("Nível de vegetação não pode ser negativo");
        }
        this.nivelVegetacao = nivelVegetacao;
    }

    public void exibirInfo() {
        System.out.println("Quilômetro inicial: " + getQuilometroInicial() + " | Quilômetro final: " + getQuilometroFinal() + " | Nível da vegetação: " + getNivelVegetacao() + "cm");
        quilometroRodado();
    }


    public double getQuilometroInicial() {
        return quilometroInicial;
    }

    private void setQuilometroInicial(double quilometroInicial) {
        this.quilometroInicial = quilometroInicial;
    }

    public double getQuilometroFinal() {
        return quilometroFinal;
    }

    private void setQuilometroFinal(double quilometroFinal) {
        this.quilometroFinal = quilometroFinal;
    }

    public double getNivelVegetacao() {
        return nivelVegetacao;
    }

}
