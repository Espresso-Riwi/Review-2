
package activity5;

import java.util.ArrayList;
public class Activity5 {


    public static void main(String[] args) {
        
        /*Create Product(id:String, name:String, price:double).
In main, use an ArrayList<Product>: add 5, remove 1 by index, update the name of the first.
Loop and print id - name - price.
*/
        ArrayList<Product> Products = new ArrayList<>();
        Product p = new Product("i12345", "cafe", 2500);
        Product p2 = new Product("i12345", "cafe", 2500);
        Product p3 = new Product("i12345", "cafe", 2500);
        Product p4 = new Product("i12345", "cafe", 2500);
        Product p5 = new Product("i12345", "cafe", 2500);
        Product p6 = new Product("i12345", "cafe", 2500);
        Products.add(p);
        Products.add(p2);
        Products.add(p3);
        Products.add(p4);
        Products.add(p5);
        Products.remove(0);
        Products.get(1).setName("ad");
        for(Product a : Products){
            System.out.println("id : "+a.getId()+" name: "+a.getName()+" price: "+a.getPrice());
        /*Error, si modificamos añadiendo el mismo objeto se cambian todos*/
        }
    }
    
}
