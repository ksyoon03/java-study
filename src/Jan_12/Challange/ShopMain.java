package Jan_12.Challange;

public class ShopMain {
    public static void main(String[] args){
        System.out.println("===[" + GameSetting.SHOP_NAME + "]===");

        Item [] items = new Item[GameSetting.INVENTORY];
        items[0] = new Weapon("무한의 대검", 3000, 70);
        items[1] = new Potion("빨간 물약", 50, 100);
        items[2] = new Weapon("낡은 도끼", 100, 5);

        for(int i=0; i< items.length; i++){
            items[i].use();
            if(items[i] instanceof Potion){
                Potion tmp = (Potion) items[i];
                tmp.heal();
            }
            System.out.println("-------------------------");
        }
    }
}
