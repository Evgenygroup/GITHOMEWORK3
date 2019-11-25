package weather;

import java.io.IOException;

public interface ReadFrom {
    Weather readFrom(String str) throws IOException;

}
