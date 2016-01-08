package com.alorma.github.sdk.bean.issue;

import com.alorma.github.sdk.bean.dto.response.Commit;
import com.alorma.github.sdk.bean.dto.response.User;

import java.io.Serializable;

/**
 * Created by Bernat on 07/04/2015.
 */
public class PullRequestStoryCommit implements IssueStoryDetail, Serializable {

    public Commit commit;
    public long created_at;

    public PullRequestStoryCommit(Commit commit) {
        this.commit = commit;
    }

    @Override
    public boolean isList() {
        return false;
    }

    @Override
    public String getType() {
        return "committed";
    }

    @Override
    public long createdAt() {
        return created_at;
    }

    @Override
    public User user() {
        return commit.committer;
    }
}
