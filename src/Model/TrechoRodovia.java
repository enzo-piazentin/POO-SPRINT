package Model;

public class TrechoRodovia {
    private double quilometroInicial, quilometroFinal, nivelVegetacao;

    public TrechoRodovia(double quilometroInicial, double quilometroFinal, double nivelVegetacao){

        if (quilometroInicial >= 0 && quilometroFinal >= 0 && nivelVegetacao >= 0  && !(quilometroInicial == quilometroFinal)) {
            this.quilometroInicial = quilometroInicial;
            this.quilometroFinal = quilometroFinal;
            this.nivelVegetacao = nivelVegetacao;
        } else {
            System.out.println("Erro: valores informados errados ou valores iguais");
        }
    }

    public void quilometroRodado(){
        double quilometroRodado = quilometroFinal - quilometroInicial;

        if (!(quilometroRodado == 0) &&  quilometroRodado >= 0) {
            System.out.println("Quilometro da rodovia rodado foi: " + quilometroRodado + "KM");
        } else {
            System.out.println("Erro: Valor não pode ser igual a 0");
        }
    }

    public double registrarCrescimento(double taxa){
        if (taxa >= 0){
            setNivelVegetacao(nivelVegetacao += taxa );
            System.out.println("Nível de vegetação está: " + getNivelVegetacao() + "cm");
        }else{
            System.out.println("Sem multa registrada e vegetação dentro dos parâmetros.");
        }

        // terminar de fazer o metodo de registrarCrescimento e responde perguntas
        return taxa;
    }

    public void exibirInfo(){
        System.out.println("Quilometro inicial: "+ getQuilometroInicial() + "| Quilometo final: " + getQuilometroFinal() + "| Nível da vegetação: "+ getNivelVegetacao()+ "cm");
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

    private void setNivelVegetacao(double nivelVegetacao) {
        this.nivelVegetacao = nivelVegetacao;
    }
}
