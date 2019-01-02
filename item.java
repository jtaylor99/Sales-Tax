import java.util.*;

//This is where I declare my variables
public class Item {
    int ItemNumber;
    String Name;
    float Price;
    int Quanity;
    String type;
    float FinalTax;
   
    public Item(int ItemNumber, String Name, float Price, int Quanity, String type) {
        this.ItemNumber = ItemNumber;
        this.Name = Name;
        this.Price = Price;
        this.Quanity =  Quanity;
        this.type = type;
    }
    public int getItemNumber() {
        return ItemNumber;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public int getQuanity(){
        return quanity;
    }
    public String getType(){
        return type;
    }
    //This is where I determine the tax for imported goods and exemptions
    void calculateTax() {
        float Tax;
        if (Name.contains("imported")) {
            Tax = .05;
        }
        if (!type.equals("book")||
        (!type.equals("food")||
        (!type.equals("medical product")))) {
            Tax = .10;
        }
        if((Name.contains("imported")) && (!type.equals("book")||(!type.equals("food")||(!type.equals("medical product"))))) {
            Tax = .15;
        }
        FinalTax = Tax * Price;
    } 
//This is the list of items that I will use the order is the name, price, quanity, and type
//Also this is where the inputs go
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Item> list = new ArrayList<Item>(10) {{
        add(new Item(1, "Dr.pepper", .50, 10, "food"));
        add(new Item(2, "Kite Runner", 9.00, 1, "book"));
        add(new Item(3, "Purple Rain", 12.00, 1, "music"));
        add(new Item(4, "Nintendo 64", 69.49, 1, "video game console"));
        add(new Item(5, "Sharp LC 50LBU591U UltraHD", 200.00, 1, "Television"));
        add(new Item(6, "imported German White Chocolate bar", 1.00, 1, "food"));
        add(new Item(7, "imported Ophelia Dress", 91.00, 1, "clothes"));
        add(new Item(8, "imported N011-YMR MT1", 136.5, 1, "Jewelry"));
        add(new Item(9, "imported Gabriel Leather Shoes", 91.00, 1, "shoes"));
        add(new Item(10, "imported Audrey Mini With Chain", 91.00, 1, "purse"));
    };

};
};
}

