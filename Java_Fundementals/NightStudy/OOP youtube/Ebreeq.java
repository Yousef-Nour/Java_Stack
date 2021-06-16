public class Ebreeq{
    
   private String liquidType;
   private int amountType = 0;

   public String getliquidType(){
       return liquidType;
   }
   public int getamountType(){
       return amountType;
   }
   public Ebreeq(String type){
       this.liquidType = type;
   }
}