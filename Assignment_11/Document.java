abstract class Document {
    String name;
    
    Document(String name) {
        this.name = name;
    }
    
    abstract void open();
    abstract void save();
    
    void printInfo() { 
        System.out.println("Document Name: " + name);
    }
}

class PDFDocument extends Document {
    PDFDocument(String name) {
        super(name);
    }
    
    @Override
    void open() {
        System.out.println(name + " is opened as a PDF file.");
    }
    
    @Override
    void save() {
        System.out.println(name + " is saved as a PDF file.");
    }
}

class TextDocument extends Document {
    TextDocument(String name) {
        super(name);
    }
    
    @Override
    void open() {
        System.out.println(name + " is opened as a text file.");
    }
    
    @Override
    void save() {
        System.out.println(name + " is saved as a text file.");
    }
}

class ImageDocument extends Document {
    ImageDocument(String name) {
        super(name);
    }
    
    @Override
    void open() {
        System.out.println(name + " is opened as an image file.");
    }
    
    @Override
    void save() {
        System.out.println(name + " is saved as an image file.");
    }
}

class Q4 {
    public static void main(String[] args) {
        Document pdf = new PDFDocument("Report");
        pdf.printInfo();
        pdf.open();
        pdf.save();
        
        System.out.println();
        
        Document text = new TextDocument("Notes");
        text.printInfo();
        text.open();
        text.save();
        
        System.out.println();
        
        Document image = new ImageDocument("Picture");
        image.printInfo();
        image.open();
        image.save();
    }
}
