class Task {
    private String title;
    private String description;
    private boolean completed;
    private Customer owner;

    public Task(String title, String description, Customer owner) {
        this.title = title;
        this.description = description;
        this.completed = false;
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Customer getOwner() {
        return owner;
    }
}
