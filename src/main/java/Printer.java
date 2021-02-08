public class Printer {
    private int paper;

    public Printer(int paper){
        this.paper = paper;
    }

    public int getPaper() {
        return paper;
    }

    public void print(int numberOfPages, int numberOfCopies){
        int totalPages = numberOfPages * numberOfCopies;
        if (totalPages <= this.paper){
            this.paper -= totalPages;
        }
    }
}
