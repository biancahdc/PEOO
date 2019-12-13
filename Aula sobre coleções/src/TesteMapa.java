
import java.util.HashMap;


public class TesteMapa {
    public static void main(String[] args) {
        
        HashMap<String, String> lab63 = new HashMap<String, String>();
    
        if(!lab63.containsKey("44")){
            lab63.put("44", "Felipe");
        }    
        
        lab63.put("40", "Bianca");
        lab63.put("12", "Ellen");
        lab63.put("76", "Felipe");
        
        System.out.println(lab63);
        
        System.out.println(lab63.remove("80"));
        
        lab63.remove("44");
        
        System.out.println(lab63.keySet());
        System.out.println(lab63.values());
    }
}
