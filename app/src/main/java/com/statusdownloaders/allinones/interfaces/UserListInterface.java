package com.statusdownloaders.allinones.interfaces;


import com.statusdownloaders.allinones.model.FBStoryModel.NodeModel;
import com.statusdownloaders.allinones.model.story.TrayModel;

public interface UserListInterface {
    void userListClick(int position, TrayModel trayModel);
    void fbUserListClick(int position, NodeModel trayModel);
}
