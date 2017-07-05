
/**
 * @author Lichenyi
 * @date 2017-7-5
 */
public class SingerSing extends Singer {
    private Singer singer;
    public SingerSing(Singer singer){
        this.singer = singer;
    }

    @Override
    public void sing() {
        singer.sing();
    }
}
