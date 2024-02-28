package app;

public class MessageService  extends Service {
    public String content; 
    public String type;


    static {
        System.out.println("🟢 Message Service ");
    }



    
    public MessageService(String content){
        this("Info Message Service", content, "info");
    }
    
    
    public MessageService(String n, String content, String type){
        super(n);
        this.content = content;
        this.type = type;
    }

    


    void showMessageContent(){
        System.out.println(content);
    }

    void setContentAndType(String c, String t){
        content = c;
        type = t;
    }

    


}
