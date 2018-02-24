package com.san.writenode;

import android.app.Application;

import com.san.writenode.data.source.DaggerTaskRespositoryComponent;
import com.san.writenode.data.source.TaskRespositoryComponent;

/**
 * Created by chenlinwei on 2018/2/22.
 */
public class WriteNodeApplication extends Application {

    private TaskRespositoryComponent taskRespositoryComponent;

    @Override
    public void onCreate () {
        super.onCreate();
        taskRespositoryComponent = DaggerTaskRespositoryComponent.builder()
                .applicationModule(new ApplicationModule(getApplicationContext()))
                .build();
        taskRespositoryComponent.inject(this);
    }

    public TaskRespositoryComponent getTaskRespositoryComponent () {
        return taskRespositoryComponent;
    }
}
