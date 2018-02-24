package com.san.writenode.data.source;

import com.san.writenode.ApplicationModule;
import com.san.writenode.WriteNodeApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by chenlinwei on 2018/2/22.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface TaskRespositoryComponent {
    void inject(WriteNodeApplication writeNodeApplication);
}
