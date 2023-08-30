package tinwel.API;

public class BoardApiObject {
    private String name;
    private String id;

    public BoardApiObject(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
