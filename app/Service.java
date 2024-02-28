package app;

public class Service implements Crud {
    String name = "Service";
    private int servicesCount = 0x000F & 0x5555;



    // constructor 
    public Service(String n){
        name = n;
    }



    void displayServicesCount(){
        System.out.print(servicesCount);
    }




    static void display(String message){
        System.out.println(message);
    }

    static void displayArray(String[] elements){
        for(String el: elements){
            System.out.println(el);
        }
    }

    static void mockupArray(String[] arr, String value){
        java.util.Arrays.fill(arr, value);
        java.util.Arrays.stream(arr).map(el -> el + " ").forEach(System.out::print);
    }

    static boolean findElementInArray(String value, String... arr){

        boolean isInIt = false;
        for( int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] == value){
                isInIt = true;
                break;
            } 
        }

        return isInIt;

        
        
       

    }

    static String findElement(String el, String... elements){
        System.out.println("Tableau : ");
        System.out.println("------------");
        System.out.println(java.util.Arrays.toString(elements));
        System.out.println("------------");

        int index = java.util.Arrays.binarySearch(elements, el);
        if(index > 0){
            return elements[index];
        } else {
            return null;
        }
    }

    @Override
    public String create(String name) {
     
        System.out.println("into create function");
        return null;
    }


    @Override
    public String read(String name) {
       
        System.out.println("into read function");
        return null;
    }

    @Override
    public String update(String name) {
 
        System.out.println("into update function");
        return null;
    }

    @Override
    public String delete(String name) {
        System.out.println("into delete function");
        return null;
    }

    
}
