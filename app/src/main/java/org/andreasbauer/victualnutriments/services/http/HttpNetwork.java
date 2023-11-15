package org.andreasbauer.victualnutriments.services.http;

import java.io.IOException;
import java.net.URL;

public interface HttpNetwork {
    String getResponseFromHttpUrl(URL url) throws IOException;
    URL buildUrl(String query);
}
