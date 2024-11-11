import java.util.List;

public class Personajes {
    private String characterName;
    private String characterImageThumb;
    private String characterImageFull;
    private String characterLink;
    private String actorName;
    private String actorLink;
    private List<Actors>actors;
    private String nickname;
    private boolean kingsguard;
    private List<String> serves;
    private List<String> guardianOf;
    private boolean royal;
    private List<String> allies;
    private List<String> parents;
    private List<String> siblings;
    private List<String> killed;
    private List<String> servedBy;
    private List<String> parentOf;
    private List<String> marriedEngaged;
    private List<String> guardedBy;
    private List<String> killedBy;


    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterImageThumb() {
        return characterImageThumb;
    }

    public void setCharacterImageThumb(String characterImageThumb) {
        this.characterImageThumb = characterImageThumb;
    }

    public String getCharacterImageFull() {
        return characterImageFull;
    }

    public void setCharacterImageFull(String characterImageFull) {
        this.characterImageFull = characterImageFull;
    }

    public String getCharacterLink() {
        return characterLink;
    }

    public void setCharacterLink(String characterLink) {
        this.characterLink = characterLink;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorLink() {
        return actorLink;
    }

    public void setActorLink(String actorLink) {
        this.actorLink = actorLink;
    }

    public List<Actors> getActors() {
        return actors;
    }

    public void setActors(List<Actors> actors) {
        this.actors = actors;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isKingsguard() {
        return kingsguard;
    }

    public void setKingsguard(boolean kingsguard) {
        this.kingsguard = kingsguard;
    }

    public List<String> getServes() {
        return serves;
    }

    public void setServes(List<String> serves) {
        this.serves = serves;
    }

    public List<String> getGuardianOf() {
        return guardianOf;
    }

    public void setGuardianOf(List<String> guardianOf) {
        this.guardianOf = guardianOf;
    }

    public boolean isRoyal() {
        return royal;
    }

    public void setRoyal(boolean royal) {
        this.royal = royal;
    }

    public List<String> getAllies() {
        return allies;
    }

    public void setAllies(List<String> allies) {
        this.allies = allies;
    }

    public List<String> getParents() {
        return parents;
    }

    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    public List<String> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<String> siblings) {
        this.siblings = siblings;
    }

    public List<String> getKilled() {
        return killed;
    }

    public void setKilled(List<String> killed) {
        this.killed = killed;
    }

    public List<String> getServedBy() {
        return servedBy;
    }

    public void setServedBy(List<String> servedBy) {
        this.servedBy = servedBy;
    }

    public List<String> getParentOf() {
        return parentOf;
    }

    public void setParentOf(List<String> parentOf) {
        this.parentOf = parentOf;
    }

    public List<String> getMarriedEngaged() {
        return marriedEngaged;
    }

    public void setMarriedEngaged(List<String> marriedEngaged) {
        this.marriedEngaged = marriedEngaged;
    }

    public List<String> getGuardedBy() {
        return guardedBy;
    }

    public void setGuardedBy(List<String> guardedBy) {
        this.guardedBy = guardedBy;
    }

    public List<String> getKilledBy() {
        return killedBy;
    }

    public void setKilledBy(List<String> killedBy) {
        this.killedBy = killedBy;
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "characterName='" + characterName + '\'' +
                ", characterImageThumb='" + characterImageThumb + '\'' +
                ", characterImageFull='" + characterImageFull + '\'' +
                ", characterLink='" + characterLink + '\'' +
                ", actorName='" + actorName + '\'' +
                ", actorLink='" + actorLink + '\'' +
                ", actors=" + actors +
                ", nickname='" + nickname + '\'' +
                ", kingsguard=" + kingsguard +
                ", serves=" + serves +
                ", guardianOf=" + guardianOf +
                ", royal=" + royal +
                ", allies=" + allies +
                ", parents=" + parents +
                ", siblings=" + siblings +
                ", killed=" + killed +
                ", servedBy=" + servedBy +
                ", parentOf=" + parentOf +
                ", marriedEngaged=" + marriedEngaged +
                ", guardedBy=" + guardedBy +
                ", killedBy=" + killedBy +
                '}';
    }
}

