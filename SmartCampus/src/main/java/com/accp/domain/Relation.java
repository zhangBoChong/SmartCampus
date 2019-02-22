package com.accp.domain;

public class Relation {
    private Integer relationId;

    private Integer u1Id;

    private Integer u2Id;

    private Integer deleteId;

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getU1Id() {
        return u1Id;
    }

    public void setU1Id(Integer u1Id) {
        this.u1Id = u1Id;
    }

    public Integer getU2Id() {
        return u2Id;
    }

    public void setU2Id(Integer u2Id) {
        this.u2Id = u2Id;
    }

    public Integer getDeleteId() {
        return deleteId;
    }

    public void setDeleteId(Integer deleteId) {
        this.deleteId = deleteId;
    }
}