package Stanze.Mercato.Bancarella;

public abstract class BancItem {
    private double prezzoAlKg;
    private String itemName;
    private double price;
    private BancType typeOfBanc;
    public BancItem(){
    }

    public void initializeMarket(){

    }

    // getter and setters
    public BancType getTypeOfBanc() {return typeOfBanc;}
    public double getPrice() {return price;}
    public double getPrezzoAlKg() {
        return prezzoAlKg;
    }
    public String getItemName() {
        return itemName;
    }
    public void setPrezzoAlKg(double prezzoAlKg) {
        this.prezzoAlKg = prezzoAlKg;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTypeOfBanc(BancType typeOfBanc) {
        this.typeOfBanc = typeOfBanc;
    }



    @Override
    public String toString() {
        return

                "Item name: " + itemName + '\'' +
                "prezzo al Kg: " + prezzoAlKg +
                "prezzo: " + price +
                '}';
    }

}
