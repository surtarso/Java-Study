package dio;

//singleton preguicoco
//primeiramente nao disponibiliza a instancia pro usuario
//verifica se existe primeiro ou retorna ela msma
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if(instancia == null) instancia = new SingletonLazy();
        return instancia;
    }
}
