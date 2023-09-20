public class Fila {

    public static Fila instance = null;
    private Fila(){
    }

    private void ImprimiDocumento(){
    }
    private void RemoveDocumento(){
    }
    private void RemoveTodosDocumento(){
    }
    public static Fila getInstance(){
        if(instance == null){
            instance = new Fila();
        }
        return instance;
    }
}
