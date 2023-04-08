package nullAnnotationExample;

import org.jetbrains.annotations.NotNull;


public class ExampleJ {

//    @NotNull 어노테이션을 붙이면 NPE가 아닌 IllegalStateException을 던짐
    @NotNull
    public Integer nonNullFun(){
        return null;
    }

    //    @NotNull 어노테이션을 붙이면 NPE가 아닌 IllegalStateException을 던짐
    public void passNonNull(@NotNull Integer i){
        i.equals(3);
    }



    public static void main(String[] args) {
        ExampleJ s = new ExampleJ();
//        s.nonNullFun().equals(3);
        Integer i = null;
        s.passNonNull(i);
    }
}
