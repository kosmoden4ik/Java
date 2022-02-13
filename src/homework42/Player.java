package homework42;

public class Player implements Playable, Recodable{
    @Override
    public void play() {
        System.out.println("Начато проигрывание");
    }

    @Override
    public void record() {
        System.out.println("Запись начата");
    }

    @Override
    public void pause() {
        System.out.println("Поставлено на паузу");
    }

    @Override
    public void stop() {
        System.out.println("Всё остановленно");
    }
}
