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

    protected void setId(long id) {
        this.id = id;
    }

    protected void setHitokoto(String hitokoto) {
        this.hitokoto = hitokoto;
    }

    protected void setType(HitokotoType type) {
        this.type = type;
    }

    protected void setFrom(String from) {
        this.from = from;
    }

    protected void setFromWho(String fromWho) {
        this.fromWho = fromWho;
    }

    protected void setCreator(String creator) {
        this.creator = creator;
    }

    protected void setCreatorUid(long creatorUid) {
        this.creatorUid = creatorUid;
    }

    protected void setReviewer(long reviewer) {
        this.reviewer = reviewer;
    }

    protected void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    protected void setCommitFrom(String commitFrom) {
        this.commitFrom = commitFrom;
    }

    protected void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    protected void setLength(int length) {
        this.length = length;
    }

    public HitokotoType getType() {
        return type;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getHitokoto() {
        return hitokoto;
    }

    public String getCreator() {
        return creator;
    }

    public long getCreatorUid() {
        return creatorUid;
    }

    public String getFrom() {
        return from;
    }

    public String getFromWho() {
        return fromWho;
    }

    public long getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public long getReviewer() {
        return reviewer;
    }

    public UUID getUuid() {
        return uuid;
    }
}