package app;


interface MyDocument {
    void showDocInfo();
}

public class Main {

    public static void main(String[] args) {


        MyDocument document = new MyDocument() {
            String title;
            String content;
            Owner owner;

            {
                title = "";
                content = "";
                owner = new Owner("luc@gmail.com");
            }

            @Override
            public void showDocInfo() {
                System.err.println(title + "" + content + "" + owner.email);
                
            }
        };

        document.showDocInfo();
    

    }
}
