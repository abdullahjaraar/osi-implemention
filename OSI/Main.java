public class Main {
    public static void main(String[] args) {
        BaseHandler obj1 = new ApplicationLayer();
        BaseHandler obj2 = new PresntitionLayer();
        BaseHandler obj3 = new SessionLayer();
        BaseHandler obj4 = new TransportLayer();
        BaseHandler obj5 = new NetworkLayer();
        BaseHandler obj6 = new DataLinkLyer();
        BaseHandler obj7 = new PhysicalLAyer();

        obj1.setNextChain(obj2);
        obj2.setNextChain(obj3);
        obj3.setNextChain(obj4);
        obj4.setNextChain(obj5);
        obj5.setNextChain(obj6);
        obj6.setNextChain(obj7);

        Data request = new Data("data");
        obj1.process(request);
    }
}
