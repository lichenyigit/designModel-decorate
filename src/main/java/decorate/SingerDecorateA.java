/**
 * @author Lichenyi
 * @date 2017-7-5
 */
public class SingerDecorateA  extends SingerSing{

    public SingerDecorateA(Singer singer) {
        super(singer);
    }

    @Override
    public void sing() {
        decorate();
        super.sing();
    }

    private void decorate(){
        System.out.println("伴舞..");
    }
}
