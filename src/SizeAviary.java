enum SizeAviary {
    TINY(2),
    LOW(4),
    MIDLE(6),
    BIG(8);
    private int size;

    SizeAviary(int size){
        this.size=size;
    }

    public int getSize(){
        return size;
    }
}
