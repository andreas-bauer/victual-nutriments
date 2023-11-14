package org.andreasbauer.victualnutriments.services.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkUtilsDummy implements HttpNetwork {
    @Override
    public String getResponseFromHttpUrl(URL url) throws IOException {
        String json = "{\"doc_id\": \"AknEknAkw3\", \"energy\": 90, \"fat\": 20, \"proteins\": 1, \"carbs\": 2}";
        return json;
    }

    @Override
    public URL buildUrl(String githubSearchQuery) {
        try {
            return new URL("https://jsonplaceholder.typicode.com/todos/1");
        } catch (MalformedURLException e) {
            return null;
        }
    }
}
