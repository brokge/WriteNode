package com.san.writenode;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chenlinwei on 2018/2/22.
 */

@Module
public final class ApplicationModule {
    private final Context mContext;

    public ApplicationModule (Context context) {
        mContext=context;
    }
    @Provides
    Context provideContext(){
        return mContext;
    }
}
