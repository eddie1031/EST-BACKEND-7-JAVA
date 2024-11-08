package posts.repository;

import org.junit.jupiter.api.*;
import posts.domain.Post;

import static org.assertj.core.api.Assertions.assertThat;

class PostRepositoryTests {

    PostRepository repository;


    @BeforeEach
    void setUp() {
        repository = new PostRepository();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    @DisplayName("save test")
    void save_test() throws Exception {

        // given
        Post newPost = Post.builder()
                        .title("title1")
                        .content("content1")
                        .build();

        // when
        int result = repository.save(newPost);

        // then
        assertThat(result).isEqualTo(1);

    }

    @Test
    @DisplayName("getById Test")
    void test2() throws Exception {
        // given
        Post newPost = Post.builder()
                .title("title5")
                .content("content5")
                .build();

        repository.save(newPost);

        // when
        Post findPost = repository.getById(1);

        // then
        assertThat(findPost.getTitle()).isEqualTo("title5");

    }




}