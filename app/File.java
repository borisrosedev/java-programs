package app;

public class File {
    String name;
    Owner owner;
    private String token;

    {
        this.name = "File";
        this.owner = new Owner("boris@gmail.com");
        this.token = "065623KLM";
    }


    // NESTED CLASSES 
    // static nest class

    static class Description {
        String content; 
        {
            content = "Aucun contenu";
        }
    }


    // non-static : inner class

    class MetaData {
        String meta;

        {
            meta = "Aucune métadonnée";
        }
    }


    // METHODS 

    public static void showDefaultInfo(){

        Description description = new Description();
        var file = new File();
        File.MetaData metadata = file.new MetaData();
        String[] arr = {description.content, metadata.meta};

        for(int i = 0; i < arr.length; i++){
            System.err.println(arr[i]);
        }
    }

    

}
