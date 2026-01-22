package Jan_22.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private int stock;
    private boolean onSale;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
