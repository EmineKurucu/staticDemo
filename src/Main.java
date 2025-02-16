import javax.xml.crypto.Data;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // main static olduğundan başka yerde main'i çağırmak için Main.main gerekir
        // new leyerek main'e ulaşamayız
        // aşağıdaki gibi new'leyerek kullanabiliriz ama static olarak oluşturusak
        // Class. ile de kullanabiliriz.
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "Computer";
        product.id = 10;
        product.price = 4500;
        productManager.add(product);

        DatabaseHelper.crud.delete();

    }
}