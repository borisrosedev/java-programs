package app;

public class Folder {
    Owner owner;

    {
        this.owner = new Owner("john@doe.com");
    }

    class PublicMetaData {

        Owner owner;
        String createdAt;
        int fileCounts;
        boolean isConfidential;
        private boolean isIntialized = initializePublicMetaData();
        
        protected final boolean initializePublicMetaData(){
            this.owner = new Owner("oliver@gmail.com");
            this.createdAt = "2024-10-01";
            this.isConfidential = false;
            return true; 
        }
    
    }
 
    static class MetaData {
        // inner class 

    }


    Folder(){}

    Folder(Owner owner){
        this.owner = owner;
    }
   


}
