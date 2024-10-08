package annotation.example.S1;

public class ViewResolver {

    public final String prefix = "/templates";
    public final String suffix = ".html";

    public String getTemplatePath(String path) {

        if ( path.trim().startsWith("/") ) {
            return prefix + path + suffix;
        } else {
            return prefix + "/" + path + suffix;
        }

    }


}
