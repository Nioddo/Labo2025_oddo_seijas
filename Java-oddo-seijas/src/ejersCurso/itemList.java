/*package ejersCurso;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class ItemList implements Handler{
    private Clothing[] stock;
    public ItemList(Clothing[] stock) {
        this.stock = stock;
    }
    @Override
    public void accept(ServerRequest serverRequest, ServerResponse serverResponse) {
        serverResponse.status(Http.Status.OK_200);
        serverResponse.headers().put("Content-Type", "text/plain; charset=UTF-8");
        StringBuilder result = new StringBuilder();
        for(Clothing item : stock){
            result.append(item + "\n");
        }
        serverResponse.send(result);
    }
}*/
