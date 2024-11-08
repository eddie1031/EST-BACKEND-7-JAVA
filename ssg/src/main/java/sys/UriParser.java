package sys;

import lombok.AccessLevel;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;


@Getter(AccessLevel.PROTECTED)
public class UriParser {

    private String URI;

    private String controllerCode;
    private String target;

    private boolean isValidUri = true;

    private Map<String, Object> parameters = new HashMap<>();

    public UriParser(String URI) {
        this.URI = parse(URI);
    }

    protected String parse(String uri) {

        if ( !uri.startsWith("/") ) {
            this.isValidUri = false;
            return uri;
        }

        String[] uriSplit = uri.split("\\?", 2);

        if ( uriSplit.length == 2 ) {
            setParameters(uriSplit[1]);
        }

        String[] uriFront = uriSplit[0].trim().split("/");

        if ( uriFront.length != 3 ) {
            this.isValidUri = false;
            return uri;
        }

        controllerCode = uriFront[1].trim();
        target = uriSplit[2].trim();

        return uri;

    }

    private void setParameters(String uriBack) {
        try {
            if ( uriBack.contains("&") ) {

                String[] uriBackSplit = uriBack.split("&");

                for (String backSplit : uriBackSplit) {
                    String[] paramData = backSplit.split("=", 2);

                    if ( paramData[1].isBlank() ) {
                        throw new IllegalArgumentException("파라미터 값을 확인해주세요");
                    }

                    parameters.put(paramData[0], paramData[1]);

                }

            } else {

                String[] uriBackSplit = uriBack.split("=", 2);

                if ( uriBackSplit[1].isBlank() ) {
                    throw new IllegalArgumentException("파라미터 값을 확인해주세요");
                }

                parameters.put(uriBackSplit[0], uriBackSplit[1]);
            }
        } catch ( IllegalArgumentException e ) {
            isValidUri = false;
        } catch ( IndexOutOfBoundsException e ) {
            isValidUri = false;
        } catch ( Exception e ) {
            isValidUri = false;
        }

    }


}
