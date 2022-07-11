package xyz.yuu8583.hitokoto4j.utils;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @packageName: xyz.yuu8583.hitokoto4j.utils
 * @className: HttpsUtils
 * @author: GerryYuu
 * @date: 7/11/2022 3:25 PM
 */

public final class HttpsUtils {
    private HttpsUtils() {
    }

    public static String doRequest(String method, String url) throws IOException {
        URL targetUrl = new URL(url);
        HttpsURLConnection connection = (HttpsURLConnection) targetUrl.openConnection();
        connection.setRequestMethod(method);
        connection.setRequestProperty("Content-type", "application/json");
        connection.setInstanceFollowRedirects(false);
        connection.connect();
        return getConnectionReturn(connection);
    }

    private static String getConnectionReturn(HttpsURLConnection httpsURLConnection) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            InputStream inputStream = httpsURLConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                stringBuilder.append(s);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}