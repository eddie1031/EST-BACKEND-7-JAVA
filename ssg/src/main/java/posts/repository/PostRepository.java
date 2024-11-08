package posts.repository;

import posts.domain.Post;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PostRepository {

    int postCount = 0;
    List<Post> postList = new ArrayList<>();

    public int save(Post post) {

        ++postCount;

        post.setId(postCount);
        postList.add(post);

        return post.getId();
    }

    public Post getById(int id) throws IndexOutOfBoundsException {
        return postList.get(id-1);
    }

    public void remove(int id ) {

        Post findPost = getById(id);

        if ( findPost != null ) {
            postList.set(id-1, findPost);
        }

    }

    public void update(int id, String title, String content) {

        Post findPost = getById(id);

        findPost.setTitle(title);
        findPost.setContent(content);

        findPost.setUpdatedAt(LocalDateTime.now());

    }


}
