package Practice0328_02;

public class Magazine extends Book {

    private String coverPersonName;

    public Magazine(String title, int price, String coverPersonName){
        super(title, price);
        this.coverPersonName = coverPersonName;
    }

    public void show(){
        System.out.println(getTitle() + "절찬 판매중!");
        System.out.println("정가: " + getPrice() + "원");
        System.out.println("이번 표지: " + coverPersonName + "님");
    }

}