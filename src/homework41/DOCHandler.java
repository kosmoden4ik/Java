package homework41;

public class DOCHandler extends  AbstractHandler{
    @Override
    public void open() {
        System.out.println("Открыт DOC документ");
    }

    @Override
    public void create() {
        System.out.println("Создан DOC документ");
    }

    @Override
    public void change() {
        System.out.println("Изменен DOC документ");
    }

    @Override
    public void save() {
        System.out.println("Сохранен DOC документ");
    }
}
