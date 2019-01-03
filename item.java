import java.util.*;

//This is where I declare my variables
public class Item {
    int ItemNumber;
    String Name;
    double Price;
    int Quanity;
    String type;
    double FinalTax;
   
    public Item(int ItemNumber, String Name, double Price, int Quanity, String type) {
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
        return Name;
    }
    public double getPrice(){
        return Price;
    }
    public int getQuanity(){
        return Quanity;
    }
    public String getType(){
        return type;
    }
    
    public String toString() {
        return ItemNumber+ " "+"Name: " + Name+" "+"Price: " + Price+" "+ "Stock: " + Quanity;
    }
    //This is where I determine the tax for imported goods and exemptions
    void calculateTax() {
        double Tax = 0;
        if (Name.contains("imported")) {
            Tax = .05;
        }
        if  (!type.equals("book")||
        (!type.equals("food")||
        (!type.equals("medical product")))) {
            Tax = .10;
        }
        if  ((Name.contains("imported")) && (!type.equals("book")||(!type.equals("food")||(!type.equals("medical product"))))) {
            Tax = .15;
        }
        FinalTax = Tax * Price;
    } 
//This is the list of items that I will use the order is the name, price, quanity, and type
//Also this is where the inputs go
    public static void main(String[] args) {
        System.out.println("Welcome to the store");
        System.out.println("Here's our Inventory!");
        List<Item> list = new ArrayList<Item>(10);
        list.add(new Item(1, "Dr.pepper", .50, 10, "food"));
        list.add(new Item(2, "Kite Runner", 9.00, 1, "book"));
        list.add(new Item(3, "Purple Rain", 12.00, 1, "music"));
        list.add(new Item(4, "Nintendo 64", 69.49, 1, "video game console"));
        list.add(new Item(5, "Sharp LC 50LBU591U UltraHD", 200.00, 1, "Television"));
        list.add(new Item(6, "imported German White Chocolate bar", 1.00, 1, "food"));
        list.add(new Item(7, "imported Ophelia Dress", 91.00, 1, "clothes"));
        list.add(new Item(8, "imported N011-YMR MT1", 136.5, 1, "Jewelry"));
        list.add(new Item(9, "imported Gabriel Leather Shoes", 91.00, 1, "shoes"));
        list.add(new Item(10, "imported Audrey Mini With Chain", 91.00, 1, "purse"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        List<Item> Cart = new ArrayList<Item>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Itemname: ");
        while (true) {
            int In = input.nextInt();
            Cart.add(In);

        break;
        }



    


};
}

