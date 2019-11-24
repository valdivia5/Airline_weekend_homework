public enum PlaneType {

    AIRBUSBELUGA(700, 86200),
    BOEINGDreamlifter(500, 180520);

    public final int capacity;
    public final double weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }
}