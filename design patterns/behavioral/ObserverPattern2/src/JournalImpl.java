public class JournalImpl implements Journal {
    private String journalName;

    public JournalImpl(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public String getJournalName() {
        return journalName;
    }
}
