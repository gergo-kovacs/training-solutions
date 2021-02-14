package week15d03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PostFinder {

    private List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }


    public List<Post> findPostsFor(String user){
        Objects.requireNonNull(user, "User is null!");
        List<Post> postList = new ArrayList<>();

        for (Post p: posts) {
            if(isNull(p)){
                postList.add(p);
            }
        }
        return postList;
    }

    private boolean isNull(Post post){
        return post.getContent()!=null &&
                post.getOwner()!=null &&
                post.getPublishedAt()!=null &&
                post.getTitle()!=null;
    }

    private boolean isEmpty(String str) {
        return str == null && str.isEmpty();
    }
}
