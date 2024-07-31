public class q2_ExcelDocumentFactory extends q2_DocumentFactory {
    @Override
    public q2_Document createDocument() {
        return new q2_ExcelDocument();
    }
}