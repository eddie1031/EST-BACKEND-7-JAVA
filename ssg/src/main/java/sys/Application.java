package sys;

import lombok.RequiredArgsConstructor;
import posts.controller.PostController;

import java.util.Scanner;

@RequiredArgsConstructor
public class Application {

    private Scanner sc = new Scanner(System.in);

    private final String domain;
    private boolean isActive = true;

    public void run() {

        PostController postController = new PostController();

        while (isActive) {

            System.out.print(domain);
            String inputUrl = sc.nextLine().trim();

            if ( inputUrl.equals(".exit")) {
                isActive = false;
                System.out.println("프로그램이 종료됩니다.");
                break;
            }

            Request request = new Request(inputUrl);

            if ( !request.isValidUri() ) {
                System.out.println("잘못된 형식의 URL입니다.");
                continue;
            }

            switch ( request.getControllerCode() ) {
                case "posts":
                    postController.handleRequest(request);
                    break;
                default:
                    System.out.println("존재하지 않는 명령어입니다!");
            }

        }
    }


}

