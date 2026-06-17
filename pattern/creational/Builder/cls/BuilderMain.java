package pattern.creational.Builder.cls;

public class BuilderMain {
    public static void main(String[] args) {
        Document document = new Document.DocumentBuilder("ABCDEFGHIJK", "white").isItalic(true).isUnderlined(true).build();
        System.out.println(document.toString());
    }
}
