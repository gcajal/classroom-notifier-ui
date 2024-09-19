package _ClassroomNotifierUI;

public class ApplicationInitializer {

    public static void main(String[] args) {

        ListaView view = new ListaView();

        ListaController controller = new ListaController(view.getChangesLabel());

        view.setController(controller);
    }
}
