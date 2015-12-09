package cuteedittextpro.pro.wjj.cuteedittext.CuteEditTextPro.Anim;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by Ezreal on 2015/10/16.
 */
public class ShakeAnimator extends BaseViewAnimator{
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "translationX", 0, 25, -25, 25, -25, 15, -15, 6, -6, 0)
        );
    }
}
