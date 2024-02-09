public class User implements Observer {
    @Override
    public void update(Source source) {
        System.out.println(	"live result: " + ( (Subject)source ).getScore());
    }
}
