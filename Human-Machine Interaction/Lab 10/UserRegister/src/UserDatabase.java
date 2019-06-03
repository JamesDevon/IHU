import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author James
 */
//{};
public class UserDatabase {
    
    
    ArrayList<String> pwdList = new ArrayList<String>(Arrays.asList("123", "password123" , "Example123"));
    ArrayList<String> unameList = new ArrayList<String>(Arrays.asList("admin", "Devon26", "Example"));
    ArrayList<String> rNameList = new ArrayList<String>(Arrays.asList("Admin" , "James" , "Example"));
    ArrayList<String> emailList = new ArrayList<String>(Arrays.asList("it164709@it.teithe.gr","jbalashi@gmail.com", "example@example.com"));
    
    public ArrayList getUnameList(){
        return unameList;
    }
    
    public class newUser{
        String uname;
        String pwd;
        String fullName;
        String Email;
        newUser(String uname, String pwd, String fullName, String Email){
            
            
            
        }
    }
    
    public void addUser(String uname, String pwd, String rName, String email){
        pwdList.add(pwd);
        unameList.add(uname);
        rNameList.add(rName);
        emailList.add(email);
    }
}
