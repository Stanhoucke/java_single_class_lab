public class Printer {
    private int paper;
    private int tonerVolume;

    public Printer(int paper, int tonerVolume){
        this.paper = paper;
        this.tonerVolume = tonerVolume;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public int getPaper() {
        return this.paper;
    }

    public void print(int numberOfPages, int numberOfCopies){
        int totalPages = numberOfPages * numberOfCopies;
        if (totalPages <= this.paper){
            this.paper -= totalPages;
            this.tonerVolume -= totalPages;
        }
    }
}
