package Lab_05;

class Outlet{

    float cost = 5.50f, largeBoxCost = 1.80f, mediumBoxCost = 1.00f, smallBoxCost = 0.60f;
    int order, mediumBoxes, smallBoxes, largeBoxes;

    public void setOrder(int order){
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public float getOrderCost(){
        return this.order * cost;
    }
    public float getLargeBoxesCost(){
        largeBoxes = this.order / 20;
        System.out.print(largeBoxes + " Large - $");
        return largeBoxes * largeBoxCost;
    }

    public float getMediumBoxesCost(){
        int remainingBoxes = this.order % 20;
        mediumBoxes = remainingBoxes / 10;
        System.out.print(mediumBoxes + " Medium - $");
        return mediumBoxes * mediumBoxCost;
    }

    public float getSmallBoxesCost(){
        smallBoxes = mediumBoxes % 10;
        System.out.print(smallBoxes + " Small - $");
        return smallBoxes * smallBoxCost;
    }

    public float totalCost(){
        return (this.order * cost) + (largeBoxes * largeBoxCost) + (mediumBoxes * mediumBoxCost) + (smallBoxes * smallBoxCost);
    }

}   // end of class Outlet

public class Q5 {
    public static void main(String[] args) {

        Outlet outlet = new Outlet();
        outlet.setOrder(52);
        System.out.println("Number of Bags Ordered: "+outlet.getOrder());
        System.out.println("The Cost of Order: $"+outlet.getOrderCost());
        System.out.println("Used: ");
        System.out.println(outlet.getLargeBoxesCost());
        System.out.println(outlet.getMediumBoxesCost());
        System.out.println(outlet.getSmallBoxesCost());
        System.out.println("Your total cost is "+outlet.totalCost());
    }
}
