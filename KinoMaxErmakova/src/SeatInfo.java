public class SeatInfo {
    private int price ;
    private boolean isFree;
    private String name  ;

    public SeatInfo(int price, boolean isFree, String name){
        this.price = price;
        this.isFree = isFree;
        this.name = name;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public boolean getIsFree(){
        return isFree;
    }
    public void setPrice(int setPrice){
         this.price = setPrice ;
    }
    public void setName(String setName){
         this.name = setName ;
    }
    public void setIsFree(boolean setIsFree){
         this.isFree = setIsFree;
    }
}
