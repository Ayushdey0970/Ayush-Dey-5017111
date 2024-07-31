public abstract class q2_DocumentFactory {
    public abstract q2_Document createDocument();

    public void openDocument() {
        q2_Document document = createDocument();
        document.open();
    }

    public void saveDocument() {
        q2_Document document = createDocument();
        document.save();
    }
}