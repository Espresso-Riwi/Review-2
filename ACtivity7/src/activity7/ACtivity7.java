
package activity7;
import java.util.HashMap;
public class ACtivity7 {

   
    public static void main(String[] args) {
    /*Create interface Storable { String key(); }.
Create User(id:String, name:String) implementing Storable (key = id).
In main, store users in a HashMap<String, User> using u.key().
Find, update the name by id, and remove a user.*/
    
    HashMap<String, User> users = new HashMap<>();
    User u1 = new User("i12345","Juan");
    users.put(u1.key(), u1);
    User u2 = new User("i123456","Juanito");
    users.put(u2.key(), u2);
    
    System.out.println("|id : "+users.get(u1.key()).getId()+" | Name : "+users.get(u1.key()).getName()+" |");
    
    users.get(u1.key()).setName("nuevoName");
    System.out.println("|id : "+users.get(u1.key()).getId()+" | Name : "+users.get(u1.key()).getName()+" |");
    
    users.remove(u1.key());
    System.out.println(users.toString());
   
    }
    
}
