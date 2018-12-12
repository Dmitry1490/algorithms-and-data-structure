public class Vertex {

    @Override
    public String toString() {
        return "Vertex{" +
                "label='" + label + '\'' +
                '}';
    }

    private final String label;
    private boolean isVisited;
    private Vertex previousPoint;

    public Vertex(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }


    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public void setPreviousPoint(Vertex previousPoint) {
        this.previousPoint = previousPoint;
    }
    public Vertex getPreviousPoint() {
        return previousPoint;
    }
}
