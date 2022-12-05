public class TransportLayer implements BaseHandler{
    private BaseHandler nextInChain;
    @Override
    public void setNextChain(BaseHandler nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
      
            request.addData("+TransportAdded");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
