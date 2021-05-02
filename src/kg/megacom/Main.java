package kg.megacom;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        String json = sendGet("https://cat-fact.herokuapp.com/facts");
        List<Post> postList = getUsers(json);

        for (Post posts : postList) {
            System.out.println(posts);
            System.out.println("--------------------------------------------------------------------");
        }


    }

    public static List<Post> getUsers(String json) {
        ObjectMapper mapper = new ObjectMapper();
        List<Post> methodList = new ArrayList<>();
        try {
            methodList = Arrays.asList(mapper.readValue(json, Post[].class));
        } catch (IOException e) {
            System.out.println(e);
        }
        return methodList;
    }

    private static String sendGet(String string) throws Exception {

        String url = string;

        HttpURLConnection httpClient =
                (HttpURLConnection) new URL(url).openConnection();

        // optional default is GET
        httpClient.setRequestMethod("GET");

        //add request header
        httpClient.setRequestProperty("User-Agent", "Mozilla/5.0");

        int responseCode = httpClient.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(httpClient.getInputStream()))) {

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }

            //print result
            return response.toString();

        }

    }
}


