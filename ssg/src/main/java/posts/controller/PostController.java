package posts.controller;

import posts.domain.Post;
import posts.service.PostService;
import sys.Request;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostController {

    private Scanner sc = new Scanner(System.in);

    private PostService postService = new PostService();

    public void handleRequest(Request request) {
        switch ( request.getTarget() ) {
            case "remove":
                System.out.println("게시물을 삭제합니다.");
                System.out.println("게시물 번호를 정수로 입력해주세요.");

                System.out.print("게시물 번호 : ");
                String removePostId = sc.nextLine().trim();

                try {

                    int postId = Integer.parseInt(removePostId);
                    postService.remove(postId);

                    System.out.println("게시물이 정상적으로 삭제되었습니다!");

                } catch (NumberFormatException e) {
                    System.out.println("게시물 번호는 정수로 입력하여 주시기 바랍니다.");
                } catch ( IndexOutOfBoundsException e) {
                    System.out.println("게시물 번호를 다시 한 번 확인하여 주시기 바랍니다.");
                } catch ( NullPointerException e) {
                    System.out.println("해당 게시물은 존재하지 않습니다.");
                }
                break;
            case "update":
                System.out.println("게시물을 수정합니다!");
                System.out.println("게시물 번호를 정수로 입력해주세요.");

                System.out.print("게시물 번호 : ");
                String updatePostIdStr = sc.nextLine().trim();

                try {

                    int postId = Integer.parseInt(updatePostIdStr);

                    System.out.print("제목 : ");
                    String title = sc.nextLine().trim();
                    System.out.print("내용 : ");
                    String content = sc.nextLine().trim();

                    postService.update(postId, title, content);


                    System.out.println("게시물 수정이 완료되었습니다.");

                } catch (NumberFormatException e) {
                    System.out.println("게시물 번호는 정수로 입력하여 주시기 바랍니다.");
                } catch ( IndexOutOfBoundsException e) {
                    System.out.println("게시물 번호를 다시 한 번 확인하여 주시기 바랍니다.");
                }catch ( NullPointerException e) {
                    System.out.println("해당 게시물은 존재하지 않습니다.");
                }
                break;
            case "view":
                System.out.println("이전에 작성된 게시물을 조회합니다.");
                System.out.println("게시물 번호를 정수로 입력해주세요.");

                System.out.print("게시물 번호 : ");
                String savePostIdStr = sc.nextLine().trim();

                try {

                    int postId = Integer.parseInt(savePostIdStr);

                    Post findPost = postService.getById(postId);

                    System.out.println("번호 : " + findPost.getId());
                    System.out.println("제목 : " + findPost.getTitle());
                    System.out.println("내용 : " + findPost.getContent());
                    System.out.println("작성일 : " + findPost.getCreatedAt());
                    System.out.println("수정일 : " + findPost.getUpdatedAt());

                } catch ( NumberFormatException e ) {
                    System.out.println("게시물 번호는 정수로 입력해 주십시오!");
                } catch ( IndexOutOfBoundsException e ) {
                    System.out.println("게시물 번호를 다시 한 번 확인하여 주시기 바랍니다!");
                }catch ( NullPointerException e) {
                    System.out.println("해당 게시물은 존재하지 않습니다.");
                }

                break;
            case "write":
                System.out.println("게시글을 작성합니다!");
                System.out.print("제목 : ");
                String title = sc.nextLine().trim();

                System.out.print("내용 : ");
                String content = sc.nextLine().trim();

                int savedPostId = postService.save(title, content);

                System.out.println(savedPostId + "번 게시물이 작성되었습니다!");
                break;
            default:
                System.out.println("존재하지 않는 명령어 입니다!");
        }

    }


}
