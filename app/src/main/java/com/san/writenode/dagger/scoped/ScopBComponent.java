package com.san.writenode.dagger.scoped;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by chenlinwei on 2018/2/23.
 */
@AScoped
@Component(modules = {ScopModule.class})
public interface ScopBComponent {
    void inject (ScopDagger scopDagger);
}
