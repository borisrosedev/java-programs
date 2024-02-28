package app;

public class ProductService extends Service {


    public ProductService(String n){
        super(n);
    }
    
    static String[] artProducts =  {
        "https://cdn.pixabay.com/photo/2019/05/04/15/24/woman-4178302_1280.jpg",
        "https://cdn.pixabay.com/photo/2019/09/05/05/28/eye-4453129_1280.jpg",
        "https://cdn.pixabay.com/photo/2022/03/05/10/08/beauty-7048849_1280.jpg",
        "https://cdn.pixabay.com/photo/2023/03/07/11/58/woman-7835587_1280.jpg"
    };

    public static void main(String... args){
        displayArray(artProducts);
    }
}


