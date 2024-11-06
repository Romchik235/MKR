public class AuthorMessage extends MessageDecorator {
    private String author;

    public AuthorMessage(Message message, String author) {
        super(message);
        this.author = author;
    }

    @Override
    public String getText() {
        // Додаємо автора до кінця повідомлення
        return message.getText() + " - " + author;
    }
}

