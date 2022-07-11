package xyz.yuu8583.hitokoto4j;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import xyz.yuu8583.hitokoto4j.utils.HttpsUtils;
import xyz.yuu8583.hitokoto4j.utils.TypeUtils;

import java.io.IOException;
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
        hitokotoResponse.setId(jsonObject.get("id").getAsLong());
        hitokotoResponse.setUuid(UUID.fromString(jsonObject.get("uuid").getAsString()));
        hitokotoResponse.setHitokoto(jsonObject.get("hitokoto").getAsString());
        hitokotoResponse.setType(TypeUtils.getType(jsonObject.get("type").getAsString()));
        hitokotoResponse.setFrom(jsonObject.get("from").getAsString());
        if (!jsonObject.get("from_who").isJsonNull()) {
            hitokotoResponse.setFromWho(jsonObject.get("from_who").getAsString());
        }
        hitokotoResponse.setCreator(jsonObject.get("creator").getAsString());
        hitokotoResponse.setCreatorUid(jsonObject.get("creator_uid").getAsLong());
        hitokotoResponse.setReviewer(jsonObject.get("reviewer").getAsLong());
        hitokotoResponse.setCreatedAt(jsonObject.get("created_at").getAsString());
        hitokotoResponse.setLength(jsonObject.get("length").getAsInt());
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