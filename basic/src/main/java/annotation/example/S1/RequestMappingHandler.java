package annotation.example.S1;

import java.lang.reflect.Method;

public class RequestMappingHandler {

    public static void main(String[] args) throws Exception {

        Request request = new Request();

        ViewResolver viewResolver = new ViewResolver();
        ViewController viewController = new ViewController();

        Method[] viewControllerMethods = viewController.getClass().getMethods();

        for ( int i = 0; i < viewControllerMethods.length; i++ ) {

            Method method = viewControllerMethods[i];

            if ( method.isAnnotationPresent(GetMapping.class)) {
//                System.out.println(method.getName());
                GetMapping annotation = method.getAnnotation(GetMapping.class);
                String path = annotation.value();
                String httpMethod = annotation.httpMethod();

                String indexReturnValue = method.invoke(viewController).toString();

                request.setMethod(httpMethod);
                request.setTargetPath(path);
                String templatePath = viewResolver.getTemplatePath(indexReturnValue);
                request.setTemplatePath(templatePath);
            }

        }

        String string = request.toString();
        System.out.println(string);

    }

    private static class Request {

        private String method;
        private String templatePath;
        private String targetPath;

        @Override
        public String toString() {
            return "Request{" +
                    "method='" + method + '\'' +
                    ", templatePath='" + templatePath + '\'' +
                    ", targetPath='" + targetPath + '\'' +
                    '}';
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getTemplatePath() {
            return templatePath;
        }

        public void setTemplatePath(String templatePath) {
            this.templatePath = templatePath;
        }

        public String getTargetPath() {
            return targetPath;
        }

        public void setTargetPath(String targetPath) {
            this.targetPath = targetPath;
        }
    }

}
