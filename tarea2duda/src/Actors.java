public class Actors {
    private String actorName;
    private String actorLink;
    private int[] seasonsActive;

    public Actors(){
    }

    public String getActorName() {
        return actorName;
    }

    public String getActorLink() {
        return actorLink;
    }

    public int[] getSeasonsActive() {
        return seasonsActive;
    }

    public void setActorLink(String actorLink) {
        this.actorLink = actorLink;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public void setSeasonsActive(int[] seasonsActive) {
        this.seasonsActive = seasonsActive;
    }
}
