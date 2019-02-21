package com.accp.domain;

public class Dccharacter {
    private Integer dccharacterid;

    private String charactername;

    private Integer charactergread;

    private Integer characterclass;

    private Integer characterscore;

    public Integer getDccharacterid() {
        return dccharacterid;
    }

    public void setDccharacterid(Integer dccharacterid) {
        this.dccharacterid = dccharacterid;
    }

    public String getCharactername() {
        return charactername;
    }

    public void setCharactername(String charactername) {
        this.charactername = charactername;
    }

    public Integer getCharactergread() {
        return charactergread;
    }

    public void setCharactergread(Integer charactergread) {
        this.charactergread = charactergread;
    }

    public Integer getCharacterclass() {
        return characterclass;
    }

    public void setCharacterclass(Integer characterclass) {
        this.characterclass = characterclass;
    }

    public Integer getCharacterscore() {
        return characterscore;
    }

    public void setCharacterscore(Integer characterscore) {
        this.characterscore = characterscore;
    }
}