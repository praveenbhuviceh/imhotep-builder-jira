package com.indeed.skeleton.index.builder.jiraaction.api.response.issue.fields.comment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.indeed.skeleton.index.builder.jiraaction.api.response.issue.User;

/**
 * @author soono
 */

@JsonIgnoreProperties(ignoreUnknown=true)

public class Comment {
    public String id;
    public User author;
    public String body;
    public String created;
    public String updated;

    public boolean isValid() {
        return author != null;
    }
}