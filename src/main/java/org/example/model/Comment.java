package org.example.model;

public class Comment {
    private final Integer commentId;
    private final Integer postId;
    private final Integer authorId;
    private final String text;

    public Comment(Integer commentId, Integer postId, Integer authorId, String text) {
        this.commentId = commentId;
        this.postId = postId;
        this.authorId = authorId;
        this.text = text;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public Integer getPostId() {
        return postId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public String getText() {
        return text;
    }
}
