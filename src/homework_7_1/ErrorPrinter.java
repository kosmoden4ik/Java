package homework_7_1;
/*
Создать функциональный интерфейс ErrorPrinter с абстрактным методом printError,
 принимающий строку error. Создайте на базе интерфейса ErrorPrinter анонимный класс,
  реализующий метод printError. printError принимает строку и выводит ее в консоль красным цветом.
 */
interface ErrorPrinter {
    void printError(String error);
};
