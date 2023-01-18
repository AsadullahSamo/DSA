package Lab_05;

class Invoice{
    String partNumber, description;
    int itemQuantity;
    float pricePerItem;

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemQuantity(int itemQuantity) {
        if (itemQuantity < 0){
            itemQuantity = 0;
        }
        this.itemQuantity = itemQuantity;
    }

    public void setPricePeritemQuantity(float pricePerItem) {
        if (pricePerItem < 0.0f){
            pricePerItem = 0.0f;
        }
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public float getPricePerItem() {
        return pricePerItem;
    }

    public float getInvoiceAmount(){
        return (this.itemQuantity * this.pricePerItem);
    }

}   // end of class Invoice

public class Q3 {
    public static void main(String[] args) {

        Invoice invoice = new Invoice();

        invoice.setDescription("L Phillips");
        invoice.setItemQuantity(5);
        invoice.setPricePeritemQuantity(5000.00f);
        invoice.setPartNumber("\"4-40-3/4\"-pan-phil\"");

        System.out.println("Description: "+invoice.getDescription());
        System.out.println("Part Number: "+invoice.getPartNumber());
        System.out.println("Price per Item: "+invoice.getPricePerItem());
        System.out.println("Item Quantity: "+invoice.getItemQuantity());
        System.out.println("Invoice Amount: "+invoice.getInvoiceAmount());

    }   // end of main() method
}      //  end of program
