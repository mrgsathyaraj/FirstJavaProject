package shop.discount;

public class Runner {

    public static void main(String[] args) {
        ShopDiscount discountObj= new ShopDiscount("alex",1500);
        String result = discountObj.CalculateDiscount();
        System.out.println(result);

    }

}
