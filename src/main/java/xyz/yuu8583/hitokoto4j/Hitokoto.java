package xyz.yuu8583.hitokoto4j;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import xyz.yuu8583.hitokoto4j.utils.HttpsUtils;
import xyz.yuu8583.hitokoto4j.utils.TypeUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.UUID;

/**
 * @packageName: xyz.yuu8583.hitokoto4j
 * @className: Hitokoto
 * @author: GerryYuu
 * @date: 7/11/2022 2:36 PM
 */

public class Hitokoto {
    String requestURL;

    public Hitokoto(String requestURL) {
        this.requestURL = requestURL;
    }

    public HitokotoResponse request() {
        JsonObject jsonObject = new JsonParser().parse(requestAndGetJson()).getAsJsonObject();
        HitokotoResponse hitokotoResponse = new HitokotoResponse();
        if (!jsonObject.get("id").isJsonNull()) {
            hitokotoResponse.setId(jsonObject.get("id").getAsLong());
        }
        if (!jsonObject.get("uuid").isJsonNull()) {
            hitokotoResponse.setUuid(UUID.fromString(jsonObject.get("uuid").getAsString()));
        }
        if (!jsonObject.get("hitokoto").isJsonNull()) {
            hitokotoResponse.setHitokoto(jsonObject.get("hitokoto").getAsString());
        }
        if (!jsonObject.get("type").isJsonNull()) {
            hitokotoResponse.setType(TypeUtils.getType(jsonObject.get("type").getAsString()));
        }
        if (!jsonObject.get("from").isJsonNull()) {
            hitokotoResponse.setFrom(jsonObject.get("from").getAsString());
        }
        if (!jsonObject.get("from_who").isJsonNull()) {
            hitokotoResponse.setFromWho(jsonObject.get("from_who").getAsString());
        }
        if (!jsonObject.get("creator").isJsonNull()) {
            hitokotoResponse.setCreator(jsonObject.get("creator").getAsString());
        }
        if (!jsonObject.get("creator_uid").isJsonNull()) {
            hitokotoResponse.setCreatorUid(jsonObject.get("creator_uid").getAsLong());
        }
        if (!jsonObject.get("reviewer").isJsonNull()) {
            hitokotoResponse.setReviewer(jsonObject.get("reviewer").getAsLong());
        }
        if (!jsonObject.get("created_at").isJsonNull()) {
            hitokotoResponse.setCreatedAt(jsonObject.get("created_at").getAsString());
        }
        if (!jsonObject.get("length").isJsonNull()) {
            hitokotoResponse.setLength(jsonObject.get("length").getAsInt());
        }
        return hitokotoResponse;
    }

    public String requestAndGetJson() {
        try {
            return HttpsUtils.doRequest("GET", requestURL);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}