package CreationalDP.BuilderDP;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem (Item item){
        items.add(item);
    }

    public double getCost(){
        double cost = 0.0;
        for(Item item: items){
            cost = cost+ item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item: items){
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }


}
