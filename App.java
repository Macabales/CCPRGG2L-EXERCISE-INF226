public class App {

    public static void main(String[] args) throws Exception {


        GroceryItem item2 = new Toothbrush();
        item2.name = "Colgate";
        item2.showItemName();
        item2.price = 100.00;


        GroceryItem item3 = new Toothpaste();
        item3.name = "Pepsodent";
        item3.showItemName();
        item3.price = 30.00;
       
        Cashier c1 = new Cashier ();

        c1.checkOut(item2);
        c1.checkOut(item3);
        c1.showprice(item2);
        c1.showprice(item3);


        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item2;
        itemArray[1] = item3;

        for (int i = 0;  i < itemArray.length; i++) {
            itemArray[i].showItemName();


        Dog myDog = new Dog();
        myDog.eat();
           }

        }   
    }





    

