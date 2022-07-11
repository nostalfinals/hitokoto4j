package xyz.yuu8583.hitokoto4j;

import java.util.UUID;

/**
 * @packageName: xyz.yuu8583.hitokoto4j
 * @className: HitokotoResponse
 * @author: GerryYuu
 * @date: 7/11/2022 2:44 PM
 */

public class HitokotoResponse {
    private long id;
    private String hitokoto;
    private HitokotoType type;
    private String from;
    private String fromWho;
    private String creator;
    private long creatorUid;
    private long reviewer;
    private UUID uuid;
    private String createdAt;
    private String commitFrom;
    private int length;

    public HitokotoResponse() {
    }

    protected void setCommitFrom(String commitFrom) {
        this.commitFrom = commitFrom;
    }

    public HitokotoType getType() {
        return type;
    }

    protected void setType(HitokotoType type) {
        this.type = type;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    protected void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getHitokoto() {
        return hitokoto;
    }

    protected void setHitokoto(String hitokoto) {
        this.hitokoto = hitokoto;
    }

    public String getCreator() {
        return creator;
    }

    protected void setCreator(String creator) {
        this.creator = creator;
    }

    public long getCreatorUid() {
        return creatorUid;
    }

    protected void setCreatorUid(long creatorUid) {
        this.creatorUid = creatorUid;
    }

    public String getFrom() {
        return from;
    }

    protected void setFrom(String from) {
        this.from = from;
    }

    public String getFromWho() {
        return fromWho;
    }

    protected void setFromWho(String fromWho) {
        this.fromWho = fromWho;
    }

    public long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }

    protected void setLength(int length) {
        this.length = length;
    }

    public long getReviewer() {
        return reviewer;
    }

    protected void setReviewer(long reviewer) {
        this.reviewer = reviewer;
    }

    public UUID getUuid() {
        return uuid;
    }

    protected void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}