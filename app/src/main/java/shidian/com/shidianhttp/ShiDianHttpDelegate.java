package shidian.com.shidianhttp;

/**
 * Created by Charlin on 2017/4/13.
 */

public interface ShiDianHttpDelegate {

    public void successBlock(String dataString);
    public void errorBlock(String dataString);
}
