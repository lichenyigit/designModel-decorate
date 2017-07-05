/**
 * @author Lichenyi
 * @date 2017-7-5
 */
public class SingerDecorateB extends SingerSing{

    public SingerDecorateB(Singer singer) {
        super(singer);
    }

    @Override
    public void sing() {
        decorate();
        super.sing();
    }

    private void decorate(){
        System.out.println("播放背景音乐..");
    }
}
