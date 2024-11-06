public class EncryptedMessage extends MessageDecorator {
    public EncryptedMessage(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        // Простий шифр: зсув кожного символа на 1
        StringBuilder encryptedText = new StringBuilder();
        for (char c : message.getText().toCharArray()) {
            encryptedText.append((char) (c + 1));
        }
        return encryptedText.toString();
    }
}


