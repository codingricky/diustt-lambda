package diustt;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SlackCallback implements RequestHandler<SlackRequest, SlackResponse> {
    public SlackResponse handleRequest(SlackRequest slackRequest, Context context) {
        return new SlackResponse(slackRequest.toString());
    }
}