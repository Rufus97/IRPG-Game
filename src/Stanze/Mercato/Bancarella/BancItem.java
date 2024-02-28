package Stanze.Mercato.Bancarella;

public abstract class BancItem {
    private double prezzoAlKg;
    private String itemName;
    private double price;
    private String typeOfBanc;
    public BancItem(){
    }


    // getter and setters

    public String getTypeOfBanc() {return typeOfBanc;}
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
    public void setTypeOfBanc(String typeOfBanc) {
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
