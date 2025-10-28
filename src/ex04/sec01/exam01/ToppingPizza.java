package ex04.sec01.exam01;

public class ToppingPizza extends Pizza {
    public String topping;
    public ToppingPizza(String dough, int sizeInInch, String pizza_name, String topping) {
        super(dough, sizeInInch, pizza_name);
        this.topping = topping;
        this.dough = dough;
        this.sizeInInch = sizeInInch;
        this.pizza_name = pizza_name;
    }
    @Override
    public void describe(){
        System.out.println(pizza_name + ": " + sizeInInch + "인치, " + dough + " 도우를 사용한 기본 피자입니다. 주요 토핑 **"+topping+"** 입니다.");
    }
    @Override
    public void bake(){
        System.out.println(pizza_name + " (표준): 오븐에서 표준 시간 동안 피자를 굽습니다.");
    }
    @Override
    public void bake(int time){
        System.out.println(pizza_name + " (시간 지정): " + time + " 분 동 특별히 피자를 굽습니다.");
    }
    public void bake(int time, int temperature) {
        System.out.println(pizza_name + " (온도+시간 지정): " + temperature + " 도에서 " + time + " 분 동안 **" + topping + "** 피자를 완벽하게 굽습니다.");
    }
}