public class NetworkLayer implements BaseHandler{
    private BaseHandler nextInChain;
    @Override
    public void setNextChain(BaseHandler nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // Network header is added
            // Called packet
            request.addData("+NetworkAdded");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
