package dio.strategy;

public class Test {
    public static void main(String[] args) {
        //cria instancia dos comportamentos possiveis
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        //cria robo
        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
    }
}
