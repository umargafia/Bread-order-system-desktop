import java.util.HashMap;

public class IDAndPassword {
    HashMap<String,String> logininfo = new HashMap<>();
        IDAndPassword(){

            logininfo.put("abc","123");
            logininfo.put("admin","admin");


        }
       HashMap getInfo(){
            return logininfo;
        }
}
