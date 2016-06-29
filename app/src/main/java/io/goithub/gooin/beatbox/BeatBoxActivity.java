package io.goithub.gooin.beatbox;

import android.support.v4.app.Fragment;

/**
 * Created by gooin on 2016/6/29.
 */
public class BeatBoxActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return BeatBoxFragment.newInstance();
    }

}
