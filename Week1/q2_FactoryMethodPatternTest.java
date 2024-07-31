public class q2_FactoryMethodPatternTest {
    public static void main(String[] args) {
        q2_DocumentFactory wordFactory = new q2_WordDocumentFactory();
        q2_DocumentFactory pdfFactory = new q2_PdfDocumentFactory();
        q2_DocumentFactory excelFactory = new q2_ExcelDocumentFactory();

        System.out.println("Using Word Document Factory:");
        wordFactory.openDocument();
        wordFactory.saveDocument();

        System.out.println("\nUsing PDF Document Factory:");
        pdfFactory.openDocument();
        pdfFactory.saveDocument();

        System.out.println("\nUsing Excel Document Factory:");
        excelFactory.openDocument();
        excelFactory.saveDocument();
    }
}