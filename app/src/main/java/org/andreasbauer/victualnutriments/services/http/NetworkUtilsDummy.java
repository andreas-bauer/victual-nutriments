package org.andreasbauer.victualnutriments.services.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkUtilsDummy implements HttpNetwork {
    @Override
    public String getResponseFromHttpUrl(URL url) throws IOException {
        if (url.getFile().endsWith("/all")) {
           return "Banana,Apple,Orange";
        }
        String json = "{\"doc_id\": \"AknEknAkw3\", \"energy\": 90, \"fat\": 20, \"proteins\": 1, \"carbs\": 2}";
        return json;
    }

    @Override
    public URL buildUrl(String query) {
        try {
            return new URL("https://fake.api.com/" + query);
        } catch (MalformedURLException e) {
            return null;
        }
    }
}
