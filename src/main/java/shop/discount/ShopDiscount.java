package shop.discount;
// Give a discount to the user who purchase above 1000 in the shop
public class ShopDiscount {

    private String user="";
    private int purchaseCost=0;

    public ShopDiscount(String user, int purchaseCost)
    {
        this.purchaseCost=purchaseCost;
        this.user=user;

    }

    public String CalculateDiscount()
    {
        String FinalPrice ="";
        int sale =0;

        if (purchaseCost<1000)
        {
            sale= purchaseCost;
            FinalPrice = " The "+user+" Final Cost is :"+ sale;


        }
        else if (purchaseCost>1000)
        {
            sale = purchaseCost-purchaseCost*10/100;
            int DiscountCost= purchaseCost*10/100;
            FinalPrice = " The "+user+" Purchase Cost is :"+ purchaseCost+" Discount is "
                    +DiscountCost+" Final Cost is "+sale;
        }

        return FinalPrice;

    }

}
