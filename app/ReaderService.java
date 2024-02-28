package app;

import java.nio.file.Files;
import java.nio.file.Path;

public class ReaderService extends Service{


    public ReaderService(String n){
        super(n);
    }





    static void chooseFile(){
    
        Path test = Path.of("file.txt");
        System.out.println(test instanceof Path);

        try {
            var list = Files.readAllLines(test);
            System.out.println(list);
       
        } catch (Exception e) {
            System.out.println("Erreur");
            System.out.println(e);
        }
  
         
    }

  
}
