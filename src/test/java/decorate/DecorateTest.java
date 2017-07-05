/**
 * @author Lichenyi
 * @date 2017-7-5
 */
public class DecorateTest {
    public static void main(String args[]) {
        Singer singe = new Singer();
        SingerSing singer = new SingerSing(singe);
        singer = new SingerDecorateA(singer);
        singer = new SingerDecorateB(singer);
        singer = new SingerDecorateC(singer);
        singer.sing();
    }
}
