package dio;

//singleton apressado
//ja vem pronto pro usuario (ja instancia direto)
public class SingletonEager {
    private static dio.SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static dio.SingletonEager getInstancia() {
        return instancia;
    }
}
