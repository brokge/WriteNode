package com.san.writenode.dagger.scoped;

import dagger.Component;

/**
 * Created by chenlinwei on 2018/2/23.
 */
@AScoped
@Component(modules = {ScopModule.class})
public interface ScopComponent {
    void inject (ScopDagger scopDagger);
}
