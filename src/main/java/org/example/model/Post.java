package org.example.model;

public class Post {
    private final Integer postId;
    private final String text;
    private final Integer authorId;

    public Post(Integer postId, String text, Integer authorId) {
        this.postId = postId;
        this.text = text;
        this.authorId = authorId;
    }

    public Integer getPostId() {
        return postId;
    }

    public String getText() {
        return text;
    }

    public Integer getAuthorId() {
        return authorId;
    }
}
