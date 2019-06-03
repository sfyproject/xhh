package org.xhh.admin.dto;

import org.xhh.db.domain.*;

/**
 * 项目及任务bean
 * @Date: 2019-6-3  19:05
 * @Params: ProAndTask.java
 * @Author: sunfy
 */
public class ProAndTask {
    ProContent proContent;
    ProTask[] proTasks;

    public ProContent getProContent() {
        return proContent;
    }

    public void setProContent(ProContent proContent) {
        this.proContent = proContent;
    }

    public ProTask[] getProTasks() {
        return proTasks;
    }

    public void setProTasks(ProTask[] proTasks) {
        this.proTasks = proTasks;
    }
}
