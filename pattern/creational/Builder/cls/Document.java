package pattern.creational.Builder.cls;

public class Document{
    // mandatory
    private final String text;
    private final String color;

    // optional
    private boolean isBold;
    private boolean isItalic;
    private boolean isUnderlined;

    public String getText() {
        return text;
    }

    public String getColor() {
        return color;
    }

    public boolean isBold() {
        return isBold;
    }

    public boolean isItalic() {
        return isItalic;
    }

    public boolean isUnderlined() {
        return isUnderlined;
    }


    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                ", color='" + color + '\'' +
                ", isBold=" + isBold +
                ", isItalic=" + isItalic +
                ", isUnderlined=" + isUnderlined +
                '}';
    }

    private Document(DocumentBuilder documentBuilder) {
        this.color = documentBuilder.color;
        this.text = documentBuilder.text;
        this.isUnderlined = documentBuilder.isUnderlined;
        this.isBold = documentBuilder.isBold;
        this.isItalic = documentBuilder.isItalic;
    }

    public static class DocumentBuilder{
        // mandatory
        private final String text;
        private final String color;

        // optional
        private boolean isBold;
        private boolean isItalic;
        private boolean isUnderlined;

        public DocumentBuilder(String text, String color) {
            this.text = text;
            this.color = color;
        }

        public DocumentBuilder isBold(boolean isBold){
            this.isBold = isBold;
            return this;
        }

        public DocumentBuilder isItalic(boolean isItalic){
            this.isItalic = isItalic;
            return this;
        }

        public DocumentBuilder isUnderlined(boolean isUnderlined){
            this.isUnderlined = isUnderlined;
            return this;
        }

        public Document build(){
            return new Document(this);
        }
    }
}