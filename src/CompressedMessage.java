public class CompressedMessage extends MessageDecorator {
    public CompressedMessage(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        // Видалення зайвих пробілів
        return message.getText().replaceAll("\\s+", " ");
    }
}


