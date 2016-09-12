package diustt;

import com.amazonaws.services.lambda.runtime.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.StringWriter;

public class SlackCallback {
    String handle(Context context) {
        Gson gson = new GsonBuilder().create();
        StringWriter stringWriter = new StringWriter();
        gson.toJson(new SlackMessage("ok"), stringWriter);
        return stringWriter.toString();
    }
}