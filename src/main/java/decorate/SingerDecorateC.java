/**
 * @author Lichenyi
 * @date 2017-7-5
 */
public class SingerDecorateC extends SingerSing{

    public SingerDecorateC(Singer singer) {
        super(singer);
    }

    @Override
    public void sing() {
        super.sing();
        decorate();
    }

    private void decorate(){
        System.out.println("经历介绍..");
    }
}
