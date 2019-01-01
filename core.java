import java.util.*;

//This is where I declare my variables
public class Item {
    String Name;
    float Price;
    int Quanity;
    String type;
    float FinalTax;
   
    public Item(String Name, float Price, int Quanity, String type) {
        this.Name = name;
        this.Price = price;
        this.Quanity =  quanity;
        this.type = type;
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
};
//This is the list of items that I will use the order is the name, price, quanity, and type
public class Store { 
    public static void main(String[] args) {
        List<Item> list = new ArrayList<Item>(10) {{
        add(new Item("Dr.pepper", .50, 10, "food"));
        add(new Item("Kite Runner", 9.00, 1, "book"));
        add(new Item("Purple Rain", 12.00, 1, "music"));
        add(new Item("Nintendo 64", 69.49, 1, "video game console"));
        add(new Item("Sharp LC 50LBU591U UltraHD", 200.00, 1, "Television"));
        add(new Item("imported German White Chocolate bar", 1.00, 1, "food"));
        add(new Item("imported Ophelia Dress", 91.00, 1, "clothes"));
        add(new Item("imported N011-YMR MT1", 136.5, 1, "Jewelry"));
        add(new Item("imported Gabriel Leather Shoes", 91.00, 1, "shoes"));
        add(new Item("importedAudrey Mini With Chain", 91.00, 1, "purse"));
    };
};
};}

