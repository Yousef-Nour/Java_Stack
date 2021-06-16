public class Main{
    public static void main(String[] args) {
        System.out.println("Create the new Child");
        Ebreeq ebreeq = new Ebreeq("Coffee");
        System.out.println(ebreeq.getliquidType());
        System.out.println(ebreeq.getamountType());
        System.out.println("This is the Liquid Type" + ebreeq.getliquidType()+"and this is the amount of liquid"+ ebreeq.getamountType());
        Ebreeq secondEbreeq = new Ebreeq("Milk");
        System.out.println(secondEbreeq.getliquidType());
        
    }
}