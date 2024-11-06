public class Main {
    public static void main(String[] args) {
        // Створення базового повідомлення
        Message message = new SimpleMessage("Це    тестове    повідомлення    з     додатковими     пробілами.");

        // 1. Виводимо базове повідомлення
        System.out.println("Вихідний текст: " + message.getText());

        // 2. Стискаємо текст
        message = new CompressedMessage(message);
        System.out.println("Після стиснення: " + message.getText());

        // 3. Шифруємо текст
        message = new EncryptedMessage(message);
        System.out.println("Після шифрування: " + message.getText());

        // 4. Додаємо дату та час
        message = new TimestampedMessage(message);
        System.out.println("Після додавання дати та часу: " + message.getText());

        // 5. Додаємо автора
        message = new AuthorMessage(message, "Душко Роман ІО-32");
        System.out.println("Після додавання автора: " + message.getText());
    }
}


