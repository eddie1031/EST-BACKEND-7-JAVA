package posts;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Post {

    // 구분 번호
    private int id;

    // 제목
    private String title;
    // 내용
    private String content;

    // 작성일
    private LocalDateTime createdAt;
    // 수정일
    private LocalDateTime updatedAt;

}
