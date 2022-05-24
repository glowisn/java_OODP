public interface Observer {
    public String getState();
    public void setState(String state);
    void update(String state);
    public void endSequence();

}
