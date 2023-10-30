public class Printer {

    public int paperLeft;
    public int tonerLeft;

    public Printer(int inputPaperLeft, int inputTonerLeft){
        this.paperLeft = inputPaperLeft;
        this.tonerLeft = inputTonerLeft;
    }


    public int getPaperLeft(){
        return this.paperLeft;
    }

    public int getTonerLeft(){
        return this.tonerLeft;
    }
    public void print(int inputPages, int inputCopies){
        if((inputPages*inputCopies) <= this.paperLeft){
            this.paperLeft -= (inputPages*inputCopies);
            this.tonerLeft -= 1;
        }
    }


}
