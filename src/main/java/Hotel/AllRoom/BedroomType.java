package Hotel.AllRoom;

public enum  BedroomType {
    SINGLE(1, 10.00),
    DOUBLE(2, 20.00);

    private final int capacity;
    private final double nightlyRate;

    BedroomType(int capacity, double nightlyRate){
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public double getNightlyRate(){
        return this.nightlyRate;
    }
}
