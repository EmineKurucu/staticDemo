public class ProductValidator {
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public void deneme(){
        System.out.println("deneme");
        // bunu çağırabilmek için class'ı new'lemek gerekir
        // bu durumda constructor static'te çalışmaz static constructor oluşturulmalı
        /*
        static {
           System.out.println("Static yapici blok")
        }
         */

            // ana class static olamaz inner class static olabilir
        }
    }
    // eğer static yaparsan ProductValidator bellekte 1 kere oluşur
    // bütün kullanıcılar o şekilde kullanır
    // araç olarak kullanacaklarında static oluştur
    // uygulama sıfırlanana kadar bellekten atılmaz tüm kullanıcılar aynı nesneyi kullanır

}
