package com.yb.buglyhotfix.application;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by yb on 2017/12/15.
 */
public class FixApplication extends TinkerApplication {
    public FixApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.yb.buglyhotfix.application.FixApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
