package br.com.kmg.mylist.model;

public class Contact {

    private String name;
    private String description;
    private String lastSeen;
    private String photoUrl;

    public Contact() {

    }

    public Contact(String name, String description, String lastSeen, String photoUrl) {
        this.name = name;
        this.description = description;
        this.lastSeen = lastSeen;
        this.photoUrl = photoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
