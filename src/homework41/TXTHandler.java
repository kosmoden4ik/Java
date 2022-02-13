package homework41;

public class TXTHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("Открыт TXT документ");
    }

    @Override
    public void create() {
        System.out.println("Создан TXT документ");
    }

    @Override
    public void change() {
        System.out.println("Изменен TXT документ");
    }

    @Override
    public void save() {
        System.out.println("Сохранен TXT документ");
    }
}
