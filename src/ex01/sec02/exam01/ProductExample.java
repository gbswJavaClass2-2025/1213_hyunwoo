package ex01.sec02.exam01;

public class ProductExample {
    public static void main(String[] args) {
        Product ssg = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        Product lg = new Product("lgxnote9", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        Product kt = new Product("ktsnote9", "KT스마트폰3", "서울시 강남", 250000, 0.3);
        System.out.println(ssg.Information());
        System.out.println(lg.Information());
        System.out.println(kt.Information());
        System.out.println("=======================================");

        ssg.SetPrice(1200000);
        lg.SetPrice(1200000);
        kt.SetPrice(1200000);
        ssg.SetTax(0.05);
        lg.SetTax(0.05);
        kt.SetTax(0.05);

        System.out.println(ssg.Information());
        System.out.println(lg.Information());
        System.out.println(kt.Information());
        System.out.println("=======================================");

        System.out.println("상품명 : " + ssg.GetProductName());
        System.out.println("부가세 포함 가격 : " + (int)(ssg.GetPrice()+ssg.GetTax()*ssg.GetPrice()));
        System.out.println("상품명 : " + lg.GetProductName());
        System.out.println("부가세 포함 가격 : " + (int)(lg.GetPrice()+lg.GetTax()*lg.GetPrice()));
        System.out.println("상품명 = " + kt.GetProductName());
        System.out.println("부가세 포함 가격 = " + (int)(kt.GetPrice()+kt.GetTax()*kt.GetPrice()));
    }
}
