package posts.service;

import posts.domain.Post;
import posts.repository.PostRepository;

public class PostService {

    private PostRepository postRepository = new PostRepository();

    public int save(String title, String content) {

        Post post = Post.builder()
                    .title(title)
                    .content(content)
                    .build();

        int savedId = postRepository.save(post);


        return savedId;

    }

    public Post getById(int id) throws IndexOutOfBoundsException, NullPointerException {
        return postRepository.getById(id);
    }

    public void update(int id, String title, String content)
            throws IndexOutOfBoundsException, NullPointerException {
        postRepository.update(id, title, content);
    }

    public void remove(int id) throws IndexOutOfBoundsException {
        postRepository.remove(id);
    }

}
