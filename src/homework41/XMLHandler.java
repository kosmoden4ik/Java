package homework41;

public class XMLHandler extends AbstractHandler{

    @Override
    public void open() {
        System.out.println("Открыт XML документ");
    }

    @Override
    public void create() {
        System.out.println("Создан XML документ");
    }

    @Override
    public void change() {
        System.out.println("Изменен XML документ");
    }

    @Override
    public void save() {
        System.out.println("Сохранен XML документ");
    }
}
