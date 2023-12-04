package Week5.ApartmentComparison;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }

    public int priceDifference(Apartment otherApartment){
        int ApartmentPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherApartmentPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return Math.abs(ApartmentPrice - otherApartmentPrice);
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        int ApartmentPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherApartmentPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return ApartmentPrice > otherApartmentPrice;
    }

}
